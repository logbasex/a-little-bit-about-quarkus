package com.logbasex.reactive.webapp;

import lombok.Data;

@Data
public class WebAppData {
	private String userData;
	private String productData;
	private String orderData;
	
	public WebAppData(String userData, String productData, String orderData) {
		this.userData = userData;
		this.productData = productData;
		this.orderData = orderData;
	}
	
	// Getters for userData, productData, and orderData
}
