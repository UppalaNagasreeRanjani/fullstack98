package com.Day13;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.CopyOption;
import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.WatchService;
import java.nio.file.attribute.UserPrincipalLookupService;
import java.nio.file.spi.FileSystemProvider;
import java.util.Set;

public class Nio {
	public static void main(String[] args) throws IOException {
	FileSystem fs=FileSystems.getDefault();
	
	Path path=fs.getPath("C:\\Users\\Lenovo\\Desktop\\Day13\\new.txt");
 Path p1=fs.getPath("C:\\Users\\Lenovo\\Desktop\\Day13\\da.txt");
	
	//Files.createFile(path);
	//Files.createDirectory(path);
//Files.exists(path);
//Files.notExists(path);
Files.copy(path,p1 );
//Files.move(path,p1);

	//Files.delete(path);
	
	
	
	
	System.out.println("name count:"+path.getNameCount());
	System.out.println("is absolutre:"+path.isAbsolute());
	
	System.out.println("nameon index:"+path.getName(2));
	
	}	
	

}
