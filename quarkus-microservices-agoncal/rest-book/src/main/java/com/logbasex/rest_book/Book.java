package com.logbasex.rest_book;

import jakarta.json.bind.annotation.JsonbDateFormat;
import jakarta.json.bind.annotation.JsonbProperty;
import lombok.Data;
import org.eclipse.microprofile.openapi.annotations.media.Schema;

import java.time.Instant;

@Data
@Schema(description = "A book")
public class Book {
	@JsonbProperty("isbn_13")
	@Schema(required = true)
	public String isbn13;
	@Schema(required = true)
	public String title;
	public String author;
	@JsonbProperty("year_of_publication")
	public int yearOfPublication;
	public String genre;
	@JsonbDateFormat("yyyy/MM/dd")
	@JsonbProperty("creation_date")
	@Schema(implementation = String.class, format = "date")
	public Instant creationDate;
}
