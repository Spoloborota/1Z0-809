package com.spoloborota.ocp.lambdas.javarush;

public interface Defaulable {
	default String notRequired() {
        return "Default implementation";
    }  
}
