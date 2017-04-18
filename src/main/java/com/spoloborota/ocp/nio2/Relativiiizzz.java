package com.spoloborota.ocp.nio2;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Relativiiizzz {

	public static void main(String[] args) {
        Path p1 = Paths.get("/a/b");
        Path p2 = Paths.get("/a/b/c/d");
        Path p3 = p1.relativize(p2);
        System.out.println(p3);

	}

}
