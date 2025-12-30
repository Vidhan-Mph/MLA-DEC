package com.fls;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.List;

public class SerialDemo {

	public static void main(String[] args) {
		List<PlayersData> data = Arrays.asList(new PlayersData(1,"JAY", "LB","MUMBAI"),
				new PlayersData(2,"ADI", "RB","PUNE"),
				new PlayersData(3,"ARJUN", "CB","MUMBAI"),
				new PlayersData(4,"NADIR", "GK","GUJARAT"),
				new PlayersData(5,"JEET", "CDM","KOLHAPUR"));
		String path = "src/team.txt";
		
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path)) ){
			oos.writeObject(data);
			oos.flush();
			System.out.println("Done.");
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
