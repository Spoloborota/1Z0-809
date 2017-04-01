package com.spoloborota.ocp.lambdas.javarush;

import java.util.function.Supplier;

public interface DefaulableFactory {
	static Defaulable create( Supplier< Defaulable > supplier ) {
		return supplier.get();
	}
}
