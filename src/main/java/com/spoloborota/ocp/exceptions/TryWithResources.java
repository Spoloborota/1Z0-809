package com.spoloborota.ocp.exceptions;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;

public class TryWithResources {

	public static void main(String[] args) throws IOException {

		try {
			BufferedReader rdr1 = new BufferedReader(new InputStreamReader(System.in));
			rdr1.close();
		} catch (IOException ioe) {
			
		}
		
		try (InputStreamReader isr = new InputStreamReader(System.in)) {
			System.out.println("");
		} 
	}
	
	public void newApproach(Path path1, Path path2) throws IOException {
		try (BufferedReader in = Files.newBufferedReader(path1);
				BufferedWriter out = Files.newBufferedWriter(path2)) {
			out.write(in.readLine());
			
		}
	}

}
