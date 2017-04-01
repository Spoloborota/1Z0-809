package com.spoloborota.ocp.innernested;

public class StaticMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static SomeClass getSomeStaticClass()
	  {
	     return new SomeClass()
	        {
	            public void m1() { }
	        };
	  }
	
	public SomeClass getSomeNonStaticClass()
	  {
	     return new SomeClass()
	        {
	            public void m1() { }
	        };
	  }

}


abstract class SomeClass {
		public abstract void m1();
	}