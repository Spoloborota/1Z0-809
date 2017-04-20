package com.spoloborota.ocp.nio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class MoveTest {

	public static void main(String[] args) throws IOException {
		Path p1 = Paths.get("C:\\Temp\\MockitoTest.rar");
		Path p2 = Paths.get("C:\\Temp\\MockitoTest2.rar");
		Files.move(p1, p2, StandardCopyOption.REPLACE_EXISTING);
		Files.delete(p1);
		System.out.println(p1.toFile().exists()+" "+
				p2.toFile().exists());
	}
}

