package com.fls;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class CharWrite {

	public static void main(String[] args) {
		try (FileWriter fw = new FileWriter("src/chartest.txt");
				BufferedWriter bw =new BufferedWriter(fw)){
			String msg = "This is simple Write and read char test operations";
			
			bw.write(msg);
			bw.flush();
			System.out.println("Done.");
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
