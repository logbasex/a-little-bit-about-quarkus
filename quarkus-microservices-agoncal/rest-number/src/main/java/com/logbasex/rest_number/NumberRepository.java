package com.logbasex.rest_number;

import io.quarkus.mongodb.panache.PanacheMongoRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class NumberRepository implements PanacheMongoRepository<IsbnNumbers> {

}
