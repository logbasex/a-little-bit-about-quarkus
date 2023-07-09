package com.logbasex.rest_book;

import jakarta.inject.Inject;
import jakarta.json.bind.Jsonb;
import jakarta.json.bind.JsonbBuilder;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.eclipse.microprofile.faulttolerance.Fallback;
import org.eclipse.microprofile.faulttolerance.Retry;
import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.parameters.RequestBody;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.jboss.logging.Logger;

import java.io.PrintWriter;
import java.time.Instant;

@Path("/api/books")
@Tag(name = "Book REST Endpoint")
@SuppressWarnings("all")
public class BookResource {
	
	@Inject
	@RestClient
	NumberProxy proxy;
	
	@Inject
	Logger logger;
	
	/**
	 * curl --location --request POST 'http://localhost:8702/api/books' \
	 * --header 'Content-Type: application/json' \
	 * --data-raw '{
	 *     "title": "Tao Te Ching",
	 *     "author": "Lao Tzu",
	 *     "yearOfPublication": "-400",
	 *     "genre": "Philosophy"
	 * }'
	 */
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	@Operation(summary = "Creates a new book")
	@Retry(maxRetries = 1, delay = 2000)
	@Fallback(fallbackMethod = "fallbackOnCreatingABook")
	public Response createABook(@RequestBody BookRequest request) {
		Book book = new Book();
		book.setIsbn13(proxy.generateIsbnNumbers().isbn13);
		book.setTitle(request.getTitle());
		book.setAuthor(request.getAuthor());
		book.setYearOfPublication(request.getYearOfPublication());
		book.setGenre(request.getGenre());
		book.setCreationDate(Instant.now());
		book.persist();
		logger.info("Book created: " + book);
		return Response.status(201).entity(book).build();
	}
	
	public Response fallbackOnCreatingABook(@RequestBody BookRequest request) {
		Book book = new Book();
		book.setIsbn13("Will be set later");
		book.setTitle(request.getTitle());
		book.setAuthor(request.getAuthor());
		book.setYearOfPublication(request.getYearOfPublication());
		book.setGenre(request.getGenre());
		book.setCreationDate(Instant.now());
		saveBookOnDisk(book);
		logger.warn("Book saved on disk: " + book);
		return Response.status(206).entity(book).build();
	}
	
	private void saveBookOnDisk(Book book) {
		try (Jsonb jsonb = JsonbBuilder.create();
		     PrintWriter out = new PrintWriter("book-" + Instant.now().toEpochMilli() + ".json")) {
			String bookJson = jsonb.toJson(book);
			out.println(bookJson);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
