package com.logbasex.rest_number;

import lombok.Data;

import java.time.Instant;

@Data
public class IsbnNumbersResponse {
	public String id;
	public String isbn10;
	public String isbn13;
	public Instant generationDate;
}
