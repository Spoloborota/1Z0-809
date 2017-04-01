package com.spoloborota.ocp.lambdas;

import java.util.function.Supplier;

public class Overload {

	public static void printSmth(Supplier<String> s) {
		
	}
	
	public static void printSmth(StringBuilder s) {
		
		
		
	}
	
	
	public static void main(String[] args) {
		Overload.printSmth(() -> new String());
		
	}
}
