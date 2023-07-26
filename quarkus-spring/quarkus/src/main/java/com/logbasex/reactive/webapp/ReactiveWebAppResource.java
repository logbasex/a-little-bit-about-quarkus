package com.logbasex.reactive.webapp;

import io.smallrye.mutiny.Uni;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.jboss.resteasy.reactive.RestStreamElementType;

@Path("/reactive/webapp")
public class ReactiveWebAppResource {
	
	@GET
	@Produces(MediaType.SERVER_SENT_EVENTS)
	@RestStreamElementType(MediaType.TEXT_PLAIN)
	public Uni<WebAppData> fetchWebAppData() {
		Uni<String> userData = fetchUserData();
		Uni<String> productData = fetchProductData();
		Uni<String> orderData = fetchOrderData();
		
		return Uni.combine().all().unis(userData, productData, orderData)
				.asTuple()
				.onItem().transform(tuple -> new WebAppData(tuple.getItem1(), tuple.getItem2(), tuple.getItem3()));
	}
	
	private Uni<String> fetchUserData() {
		return Uni.createFrom().item(() -> {
			// Simulate fetching user data from an external API with a delay (1 second)
			simulateDelay();
			return "User data";
		});
	}
	
	private Uni<String> fetchProductData() {
		return Uni.createFrom().item(() -> {
			// Simulate fetching product data from an external API with a delay (2 seconds)
			simulateDelay();
			return "Product data";
		});
	}
	
	private Uni<String> fetchOrderData() {
		return Uni.createFrom().item(() -> {
			// Simulate fetching order data from an external API with a delay (3 seconds)
			simulateDelay();
			return "Order data";
		});
	}
	
	private void simulateDelay() {
		try {
			Thread.sleep(100); // 2 seconds delay
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
	}
	
}
