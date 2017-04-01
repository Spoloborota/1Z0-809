package com.spoloborota.ocp.localization;

import java.util.ResourceBundle;

public class ResourceBundleMain {

	public static void main(String[] args) {
		ResourceBundle rb = ResourceBundle.getBundle("pom");
		rb.keySet().forEach(s -> {
			System.out.println("key = " + s + " value = " + rb.getString(s));
		});
	}

}
