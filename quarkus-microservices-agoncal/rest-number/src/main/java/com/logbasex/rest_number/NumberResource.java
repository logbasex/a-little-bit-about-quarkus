package com.logbasex.rest_number;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;
import org.jboss.logging.Logger;

import java.time.Instant;
import java.util.Random;

@Path("/api/numbers")
@Tag(name = "Number REST Endpoint")
public class NumberResource {
	
	@Inject
	Logger logger;
	
	@Inject
	NumberRepository numberRepo;
	
	@Inject
	IsbnNumbersMapper isbnNumbersMapper;
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Operation(summary = "Generates book numbers")
	public IsbnNumbersResponse generateIsbnNumbers() {
		IsbnNumbers defaultIsbnNumbers = new IsbnNumbers();
		defaultIsbnNumbers.isbn13 = "13-" + new Random().nextInt(100_000_000);
		defaultIsbnNumbers.isbn10 = "10-" + new Random().nextInt(100_000);
		defaultIsbnNumbers.generationDate = Instant.now();
		logger.info("Numbers generated " + defaultIsbnNumbers);
		
		IsbnNumbers isbnNumbers = numberRepo
				.listAll()
				.stream()
				.findFirst()
				.orElse(defaultIsbnNumbers);
		return isbnNumbersMapper.toDto(isbnNumbers);
	}
}
