package com.logbasex.rest_book;

import io.quarkus.mongodb.panache.PanacheMongoEntity;
import io.quarkus.mongodb.panache.common.MongoEntity;
import jakarta.json.bind.annotation.JsonbDateFormat;
import jakarta.json.bind.annotation.JsonbProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.bson.codecs.pojo.annotations.BsonProperty;
import org.bson.types.ObjectId;
import org.eclipse.microprofile.openapi.annotations.media.Schema;

import java.time.Instant;

@Data
@Schema(description = "A book")
@MongoEntity(collection="book")
@EqualsAndHashCode(callSuper = true)
public class Book extends PanacheMongoEntity {
	public ObjectId id;
	
	@JsonbProperty("isbn_13")
	@Schema(required = true)
	@BsonProperty("isbn13")
	private String isbn13;
	
	@Schema(required = true)
	@BsonProperty("title")
	private String title;
	
	@BsonProperty("author")
	private String author;
	
	@BsonProperty("yearOfPublication")
	@JsonbProperty("year_of_publication")
	private int yearOfPublication;
	
	@BsonProperty("genre")
	private String genre;
	
	@JsonbDateFormat("yyyy/MM/dd")
	@JsonbProperty("creation_date")
	@Schema(implementation = String.class, format = "date")
	@BsonProperty("creationDate")
	private Instant creationDate;
}
