package com.tatastrive.collection;

import java.util.*;
import java.util.Map.Entry;

public class TreeSet1 {
	public static void main(String[] args) {
		
		
		Map<Integer, String> empList = new HashMap<Integer, String>();
		
		empList.put(101,"Harish");
		empList.put(102,"Deepak");
		empList.put(103,"Kathir");
		empList.put(104,"Joe");
		empList.put(105,"Ram");
		
	   Set<Entry<Integer,String>> entries=	empList.entrySet();
	   
	  Collection<String> values=  empList.values();
	  
	  values.forEach(System.out::println);

	}
}
