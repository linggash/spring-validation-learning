package com.linggash.spring_validation_learning;

import com.linggash.spring_validation_learning.properties.DatabaseProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties({
		DatabaseProperties.class
})
@SpringBootApplication
public class SpringValidationLearningApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringValidationLearningApplication.class, args);
	}

}
