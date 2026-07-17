package com.example.crudSpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.autoconfigure.DataSourceAutoConfiguration;
import org.springframework.http.converter.json.GsonBuilderUtils;

@SpringBootApplication
public class CrudSpringBootApplication {

	public static void main(String[] args) {

		SpringApplication.run(CrudSpringBootApplication.class, args);

	}

}
