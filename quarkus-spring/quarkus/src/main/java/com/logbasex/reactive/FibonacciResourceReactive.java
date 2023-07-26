package com.logbasex.reactive;

import io.smallrye.mutiny.Uni;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;
import org.jboss.resteasy.reactive.RestStreamElementType;

/**
 * <a href="https://developers.redhat.com/articles/2021/11/04/boost-throughput-resteasy-reactive-quarkus-22#tune_the_slow_endpoints_to_optimize_performance">...</a>
 */
@Path("/fibonacci/reactive")
public class FibonacciResourceReactive {
	
	//java14 introduce record to simplify the creation of classes that are primarily used to store data
	public record FibonacciResult(int result, long executionTime) {
	
	}
	
//	@GET
//	@Produces(MediaType.SERVER_SENT_EVENTS)
//	@RestStreamElementType(MediaType.TEXT_PLAIN)
//	public Uni<FibonacciResult> reactiveFibonacci(@QueryParam("n") int n) {
//		long startTime = System.currentTimeMillis();
//		return Uni.createFrom().item(() -> {
//			int result = calculateFibonacci(n);
//			long executionTime = System.currentTimeMillis() - startTime;
//			return new FibonacciResult(result, executionTime);
//		});
//	}
	
	@GET
	@Produces(MediaType.SERVER_SENT_EVENTS)
	@RestStreamElementType(MediaType.TEXT_PLAIN)
	public Uni<String> getFibonacci(@QueryParam("n") int n) {
		return Uni.createFrom().item(() -> calculateFibonacci(n))
				.map(result -> "Fibonacci(" + n + ") = " + result);
	}
	
	// n = 40 takes 500ms
	private int calculateFibonacci(int n) {
		if (n <= 0) return 0;
		if (n == 1) return 1;
		return calculateFibonacci(n - 1) + calculateFibonacci(n - 2);
	}
}

