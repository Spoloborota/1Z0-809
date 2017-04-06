package com.spoloborota.ocp.localization;

import java.util.Enumeration;
import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleMain {

	public static void main(String[] args) {
//		ResourceBundle rb = ResourceBundle.getBundle("pom");
//		rb.keySet().forEach(s -> {
//			System.out.println("key = " + s + " value = " + rb.getString(s));
//		});

		Locale myloc = new Locale.Builder().setLanguage("en").setRegion("UK").build(); //L1
		System.out.println(myloc);
		ResourceBundle msgs = ResourceBundle.getBundle("mymsgs", myloc);

		Enumeration<String> en = msgs.getKeys();
		while(en.hasMoreElements()){
			String key = en.nextElement();
			String val = msgs.getString(key);
			System.out.println(key+" : "+val);
		}

	}

}
