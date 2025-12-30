package com.strms;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Exp4 {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(3,5,7,9);
		
		Optional<Integer> opt = nums.stream().findAny();
		if(opt.isPresent()) {
			System.out.println(opt.get());
		}else {
			System.out.println("No data");
		}
		
		List<String> names = Arrays.asList("sky", "kohli" ,"dhoni", "dravid");
		Optional<String> rslt = names.stream().findFirst();
		
		if(rslt.isPresent()) {
			System.out.println(rslt.get());
		}else {
			System.out.println("No Data");
		}
	}

}
