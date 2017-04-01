package com.spoloborota.ocp.lambdas.calc;

import java.util.function.BiFunction;

public class Calculator {

	static BiFunction<Double, Double, Double> divide = (a, b) -> a / b;
	static BiFunction<Double, Double, Double> multiply = (a, b) -> a * b;
	static BiFunction<Double, Double, Double> subtract = (a, b) -> a - b;
	static BiFunction<Double, Double, Double> summ = (a, b) -> a + b;
	
	public static void main(String[] args) {
		divide.apply(10.0, 20.0);
	}
	
	

}
