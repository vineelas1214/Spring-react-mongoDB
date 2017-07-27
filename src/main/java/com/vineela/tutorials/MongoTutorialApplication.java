package com.vineela.tutorials;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories("com.vineela.tutorials.repository")
public class MongoTutorialApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(MongoTutorialApplication.class, args);
	}
	
	public void run() {
	}
}
