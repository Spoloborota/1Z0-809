package com.spoloborota.ocp.exceptions;

import java.sql.SQLException;

public class Parent {
	void doSmth() {}
	void doSmthExc() throws SQLException {}					//checked
	void doSmthRuntExc() throws IllegalStateException {}	//unchecked

	class Child extends Parent {
//		void doSmth() throws SQLException {}				//checked
		void doSmthExc() {}
		void doSmthRuntExc() {}
	}
	
	class Child2 extends Parent {
		void doSmth() throws IllegalStateException {}		//unchecked
//		void doSmthExc() throws Exception {}				//checked parent
		void doSmthRuntExc() throws RuntimeException {}		//unchecked parent
	}
	
	class Child3 extends Parent {
		
		void doSmthExc() throws IllegalStateException {}		//checked
//		void doSmthRuntExc() throws SQLException {}				//unchecked
	}
}
