package com.spoloborota.ocp.collections;

import java.util.Arrays;
import java.util.List;

public class ToArray {

	public static void main(String[] args) {
		String[] array = {"xxx", "CCC"};
		List<String> list = Arrays.asList(array);
		list.set(1, "test");
		array[0] = "new";
		list.add("XXX");
		list.remove(1);
		String[] array2 = (String[]) list.toArray();
		list.remove(1);
	}

}
