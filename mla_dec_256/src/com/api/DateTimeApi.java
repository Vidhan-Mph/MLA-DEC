package com.api;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeApi {

	public static void main(String[] args) {
		
		LocalDate ld = LocalDate.now(); //get the current date
		System.out.println(ld);
		LocalDateTime ldt = LocalDateTime.now(); // current date and time
		System.out.println(ldt);
		
		LocalDate ldsp = LocalDate.of(2000, Month.MARCH, 28); //local date specific date
		System.out.println(ldsp);
		
		LocalDate plsw = ld.plusWeeks(1); //local date + noOfWeeks
		System.out.println(plsw);
		
		Period prd = Period.between(ldsp, plsw); // difference between two days
		System.out.println(prd);
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-mm-yyyy");
		String formatted = ldt.format(dtf);
		System.out.println(formatted);
		
		ZonedDateTime zndt = ZonedDateTime.now();
		System.out.println(zndt);
		
		ZoneId znid = ZoneId.of("Asia/Tokyo");
		System.out.println(znid);
		
		ZonedDateTime tk = ZonedDateTime.now(znid);
		System.out.println(tk);
	}

}
