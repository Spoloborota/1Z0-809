package com.spoloborota.ocp.streams;

import java.util.HashMap;
import java.util.Map;

public class MapStream {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		
		map.entrySet().parallelStream();
	}

}
