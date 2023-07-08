package com.logbasex.rest_number;

import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;
import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.info.Info;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

/**
 * OpenAPI Docs <a href="http://localhost:8701/q/openapi">...</a>
 * Swagger <a href="http://localhost:8701/q/swagger-ui/">...</a>
 */
@ApplicationPath("/")
@OpenAPIDefinition(
		info = @Info(title = "Number API",
				description = "Generates ISBN book numbers",
				version = "1.0"
		),
		tags = {
				@Tag(name = "api", description = "Public API that can be used by anybody"),
				@Tag(name = "numbers", description = "Anybody interested in numbers")
		}
)
public class NumberMicroservice extends Application {

}
