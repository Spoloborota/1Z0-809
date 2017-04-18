package com.spoloborota.ocp.classes;

public class Inheritance {

	int getStatusCode(Object obj) throws NullPointerException
	{
		if(obj != null ) return 1;
		else return 0;
	}

	class ParallelTask extends Inheritance
	{
		@Override
		int getStatusCode(Object obj) throws NullPointerException {
			// TODO Auto-generated method stub
			return 0;
		}
	}

}
