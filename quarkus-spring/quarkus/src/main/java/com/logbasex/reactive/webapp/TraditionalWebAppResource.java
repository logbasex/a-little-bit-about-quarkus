package com.logbasex.reactive.webapp;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/traditional/webapp")
public class TraditionalWebAppResource {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public WebAppData fetchWebAppData() {
		String userData = fetchUserData();
		String productData = fetchProductData();
		String orderData = fetchOrderData();
		
		return new WebAppData(userData, productData, orderData);
	}
	
	private String fetchUserData() {
		// Simulate fetching user data from an external API with a delay (1 second)
		simulateDelay();
		return "User data";
	}
	
	private String fetchProductData() {
		// Simulate fetching product data from an external API with a delay (2 seconds)
		simulateDelay();
		return "Product data";
	}
	
	private String fetchOrderData() {
		// Simulate fetching order data from an external API with a delay (3 seconds)
		simulateDelay();
		return "Order data";
	}
	
	private void simulateDelay() {
		try {
			Thread.sleep(100); // 2 seconds delay
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
	}
}
