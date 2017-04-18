package com.spoloborota.ocp.exceptions;

public class ThrowsClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}


	public static void myMethod(int x) throws Exception //Specify throws clause here
	{
		try{
			if(x == 0){
				throw new ClassNotFoundException();
			}
			else throw new NoSuchFieldException();
		}catch(RuntimeException e){
			throw e;
		}
	}
}
