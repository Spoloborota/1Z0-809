package com.spoloborota.ocp.nio2;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Resolviiiing {

	public static void main(String[] args) {
		Path p1 = Paths.get("/a/b/c/d");
        Path p2 = Paths.get("/a/b");
        Path p3 = p1.resolve(p2);
        System.out.println(p3);
        
        p1 = Paths.get("/a/b");
        p2 = Paths.get("/a/b/c/d");
        p3 = p1.resolve(p2);
        System.out.println(p3);

        p1 = Paths.get("a/b/c/d");
        p2 = Paths.get("/a/b");
        p3 = p1.resolve(p2);
        System.out.println(p3);

        p1 = Paths.get("/a/b/c/d");
        p2 = Paths.get("../a/b");
        p3 = p1.resolve(p2);
        System.out.println(p3);
	}

}
