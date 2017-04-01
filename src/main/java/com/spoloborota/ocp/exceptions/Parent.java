package com.spoloborota.ocp.exceptions;

public class Parent {
	
	void doSmth() {}

	class Child extends Parent{
		
		@Override
		void doSmth() throws NullPointerException {}
	}
}
