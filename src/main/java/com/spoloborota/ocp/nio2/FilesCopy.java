package com.spoloborota.ocp.nio2;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesCopy {
	public static void main(String[] args) {
		Path p1 = Paths.get("c:\\temp\\test1.txt");
		Path p2 = Paths.get("c:\\temp\\test2.txt");
		
		Path p3 = Paths.get("\\code\\java\\PathTest.java");
		System.out.println(p3.getName(0));
		System.out.println(p3.getRoot());
	}
}
