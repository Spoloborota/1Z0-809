package com.spoloborota.ocp.lambdas.javarush;

public class OverridableImpl implements Defaulable {
	@Override
	public String notRequired() {
		return "Overridden implementation";
	}
}
