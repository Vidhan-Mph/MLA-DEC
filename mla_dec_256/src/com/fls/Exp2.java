package com.fls;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class Exp2 {

	public static void main(String[] args) {
		List<String> data = Arrays.asList("jay", "vidhan", "ishita", "riddhi", "akash", "parth");
		String path = "src/data.txt";
		try (BufferedWriter bw = Files.newBufferedWriter(Paths.get(path))){
			data.stream().forEach(x -> {                      //Consumer objects
				try {
					bw.write(x);
					bw.newLine();
				}catch(IOException ie){
					ie.printStackTrace();
				}
			});
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
