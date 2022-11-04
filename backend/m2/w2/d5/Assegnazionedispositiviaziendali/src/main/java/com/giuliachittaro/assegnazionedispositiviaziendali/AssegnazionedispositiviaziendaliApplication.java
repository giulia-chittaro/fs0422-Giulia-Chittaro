package com.giuliachittaro.assegnazionedispositiviaziendali;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.giuliachittaro.assegnazionedispositiviazielndali.entities")
public class AssegnazionedispositiviaziendaliApplication {

	public static void main(String[] args) {
		SpringApplication.run(AssegnazionedispositiviaziendaliApplication.class, args);
		
		System.out.println("Hello");
	}

	
}
