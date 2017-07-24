package com.kodilla;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalculatorApplication {

	public static void main(String[] args) {
		Calculator myCalculator = new Calculator();
		myCalculator.addAToB(1,2.5);
		myCalculator.substractBFromA(5,1.67);
	}
}
