package com.logbasex.reactive;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

@Path("/fibonacci/traditional")
public class FibonacciResourceTraditional {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public int getFibonacci(@QueryParam("n") int n) {
		long startTime = System.currentTimeMillis();
		int result = calculateFibonacci(n);
		long endTime = System.currentTimeMillis();
		
		//http://localhost:8080/q/dev-ui/io.quarkus.quarkus-resteasy-reactive/endpoint-scores
		// writer 100% resource.
		return result;
//		return "Fibonacci(" + n + ") = " + result + "\nExecution Time (Traditional): " + (endTime - startTime) + " ms";
	}
	
	private int calculateFibonacci(int n) {
		if (n <= 0) return 0;
		if (n == 1) return 1;
		return calculateFibonacci(n - 1) + calculateFibonacci(n - 2);
	}
}
