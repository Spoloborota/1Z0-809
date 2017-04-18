package com.spoloborota.ocp.io;

import java.io.Console;
import java.io.IOException;

public class SystemInSample {

	public static void main(String[] args) throws IOException {
//		BufferedReader reader = new BufferedReader(
//				new InputStreamReader(System.in));
//		String userInput = reader.readLine();
//		System.out.println("You entered the following: "+userInput);


		Console console = System.console();
		if(console != null) {
			String userInput2 = console.readLine();
			console.writer().println ("You entered the following XXX: "+userInput2);
		}
	}

}
