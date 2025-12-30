package com.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Exp1 {

	public static void main(String[] args) {
		Map data = new HashMap();
		
		data.put("java", "spring");
		data.put(101, "php");
		data.put('w', 100);
		data.put(84,  99.43f);
		data.put(false, "yes");
		data.put("java", "hibernate"); //Overrides previous data
		data.put(101, "Jay"); //Overrides previous data
		data.put(null, null);
		
		System.out.println(data);
		System.out.println(data.size());
		System.out.println(data.get('w'));
		
		Iterator<Map.Entry> itr = data.entrySet().iterator();
		
		while(itr.hasNext()) {
			Entry et = itr.next();
			System.out.println(et.getKey() + " = " + et.getValue());
		}
		
		data.keySet().forEach(x -> System.out.println(x+ " <=> " +data.get(x)));

	}

}
