package com.spoloborota.ocp.collections;

public class Crate <T>{
	private T contents;
	public T emptyCrate() {
		return contents;
	}
	public void packCrate(T contents) {
		this.contents = contents;
	}

	public static <T> Crate<T> ship(T t) {
		System.out.println("Preparing " + t);
		return new Crate<T>();
	}
	
	public static <T> void sink(T t) {
		T cr = t;
		cr.toString();
	}
	
	public static <T> T identity(T t) { return t; }
}
