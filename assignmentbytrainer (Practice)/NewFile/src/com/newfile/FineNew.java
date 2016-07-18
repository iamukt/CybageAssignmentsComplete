package com.newfile;

import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FineNew {

	public static void main(String[] args) throws IOException {
		
	Path path1 = Paths.get("d:\\xyz\\HELLO.txt");
	Path path2 = Paths.get("D:\\abc.txt");
	System.out.println("Number of nodes"+path1.getNameCount());
		System.out.println(path1.getFileName());
		System.out.println(path1.getRoot());
		System.out.println(path1.getFileSystem());
		System.out.println(path1.getParent());
		System.out.println(path1.getClass());
		System.out.println(path1.hashCode());
		//Files.copy(path1, path2);
		Files.move(path1, path2);
		//Files.deleteIfExists(path1);
	
	}
	
	
	
	
}
