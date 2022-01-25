package com.api.BaseAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@PropertySources({
		@PropertySource(value = "file:C:\\Users\\isaac\\Documents\\Java APIs\\APIBase Config\\application.properties",
				ignoreResourceNotFound = true)
})
@SpringBootApplication
public class BaseApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(BaseApiApplication.class, args);
	}

}
