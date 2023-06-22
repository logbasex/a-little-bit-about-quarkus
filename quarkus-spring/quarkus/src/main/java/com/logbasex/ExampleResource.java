package com.logbasex;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class ExampleResource {
	
	//JAX-RS annotation (quite old, difference with Spring annotation)
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String hello() {
		return "Hello from RESTEasy Reactive";
	}
}
