package com.tatastrive.collection;

import java.util.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ArrayListEx {
	
	public static void main(String[] args) {

		HashMap<Integer,String> map = new HashMap<Integer, String>();
		map.put(101, "Ram");
		map.put(103, "Pavithra");
		map.put(104, "Harish");
		map.put(105, "Ajay");
		
		
		map.forEach((key,value)->System.out.println(key+":"+value));
		
		

	}

}
