package com.swagger.example.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.servers.Server;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
@RequiredArgsConstructor
public class SwaggerConfig {

	@Bean
	public OpenAPI openAPI() {
		Server server = new Server();
		server.setDescription("server");
		server.setUrl("http://localhost:8080");

		Info info = new Info()
			.title("Swagger Example demo")
			.version("1.0.0")
			.termsOfService("https://swagger.io/terms/")
			.license(new License().name("Apache License Version 2.0").url("https://www.apache.org/licenses/LICENSE-2.0"));

		return new OpenAPI().servers(List.of(server))
							.info(info);
	}
}
