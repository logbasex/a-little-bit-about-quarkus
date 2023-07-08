package com.logbasex.rest_number;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.event.Observes;
import jakarta.enterprise.event.Startup;
import jakarta.inject.Inject;

import java.time.Instant;
import java.util.Random;

@ApplicationScoped
public class NumberMongoInitializer {
	
	@Inject
	NumberRepository numberRepo;
	
	/**
	 * <a href="https://stackoverflow.com/questions/49278854/postconstruct-is-not-invoked-for-applicationscoped-on-initialisation">...</a>
	 */
	public void init(@Observes Startup startup) {
		numberRepo.deleteAll();
		
		IsbnNumbers isbnNumbers = new IsbnNumbers();
		isbnNumbers.isbn13 = "13-" + new Random().nextInt(100_000_000);
		isbnNumbers.isbn10 = "10-" + new Random().nextInt(100_000);
		isbnNumbers.generationDate = Instant.now();
		numberRepo.persist(isbnNumbers);
	}
}
