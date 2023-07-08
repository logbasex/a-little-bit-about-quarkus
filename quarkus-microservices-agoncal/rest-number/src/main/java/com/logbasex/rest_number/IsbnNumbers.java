package com.logbasex.rest_number;

import io.quarkus.mongodb.panache.common.MongoEntity;
import jakarta.json.bind.annotation.JsonbProperty;
import jakarta.json.bind.annotation.JsonbTransient;
import lombok.Data;
import org.bson.codecs.pojo.annotations.BsonProperty;
import org.bson.types.ObjectId;
import org.eclipse.microprofile.openapi.annotations.media.Schema;

import java.time.Instant;

@Data
@MongoEntity(collection="isbn_numbers")
@Schema(description = "Several ISBN formats")
public class IsbnNumbers {
	public ObjectId id;
	
	@Schema(required = true)
	@JsonbProperty("isbn_10")
	@BsonProperty("isbn10")
	public String isbn10;
	
	@Schema(required = true)
	@JsonbProperty("isbn_13")
	@BsonProperty("isbn13")
	public String isbn13;
	
	@JsonbTransient
	public Instant generationDate;
}
