package com.spoloborota.ocp.generics;

import java.util.List;

public class TestPreob {

	public static void main(String[] args) {
		List<String> c = dodo();
	}
	
	public static <E> List<E> dodo() {
		List<E> c = null;
		return c;
	}

}
