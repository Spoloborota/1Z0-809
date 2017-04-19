package com.spoloborota.ocp.io;

import java.io.FileWriter;
import java.io.IOException;

public class FileOverwrite {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("text.txt");
		fw.close();
	}

}
