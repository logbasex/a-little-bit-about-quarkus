package com.logbasex.rest_book;

import lombok.Data;

@Data
public class BookRequest {
	private String title;
	private String author;
	private int yearOfPublication;
	private String genre;
}
