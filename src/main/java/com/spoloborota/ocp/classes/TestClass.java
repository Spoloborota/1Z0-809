package com.spoloborota.ocp.classes;



interface House{
	public default String getAddress(){
		return "101 Main Str";
	}
}

interface Office {
	public static String getAddress(){
		return "101 Smart Str";
	}
}

interface House2{
	public String getAddress();
}

interface WFH extends House, Office{
}

class HomeOffice implements House, Office{
	public String getAddress(){
		return "R No 1, Home";
	}
}

public class TestClass {

	public static void main(String[] args) {
		Office off = new HomeOffice();  //1
//		System.out.println(off.getAddress()); //2
	}
}

