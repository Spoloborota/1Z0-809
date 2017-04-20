package com.spoloborota.ocp.innernested;

import com.spoloborota.ocp.innernested.Outsider.Insider;

class Outsider {
	public class Insider{ }
}
public class TestClass {
	public static void main(String[] args) {
		Outsider os = new Outsider();
		Insider in = os.new Insider();	}
}
