package com.spoloborota.ocp.nio2;

import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileSystemTest {

	public static void main(String[] args) throws URISyntaxException {
		URI uri = new URI("file://e:/temp/records");
		System.out.println(uri.getScheme());
		Path p1 = Paths.get(uri);
	}

}
