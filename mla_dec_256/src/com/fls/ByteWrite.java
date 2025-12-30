package com.fls;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class ByteWrite {

	public static void main(String[] args)  throws Exception{
		File file = new File("src/bytetest.txt");
		
		FileOutputStream fos = new FileOutputStream(file);
		
		BufferedOutputStream bos = new BufferedOutputStream(fos); //create object based on output file stream
		
		String msg = "This is simple byte stream write and read operations";
		
		bos.write(msg.getBytes());  //converts string msg into byte stream
		
		bos.flush(); //release data into file
		System.out.println("Done. ");
	}

}
