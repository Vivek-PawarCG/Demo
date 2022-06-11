package com.mycom.collection.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetLanguage {

	public static void main(String[] args) {
		
		//create HashSet
		HashSet<String> langSet = new HashSet<String>();
		
		//Add elements to HashSet
		langSet.add("java");
		langSet.add("Python");
		langSet.add("C++");
		langSet.add("Java");
		langSet.add("C++");
		
		for(String lang : langSet) {
			
			System.out.println(lang);
		}
		System.out.println("Using iterator...");
		Iterator<String> itr =langSet.iterator();
		while(itr.hasNext()) {//is next object available? true/false
			System.out.println(itr.next()) ; //if object available in iterator - get
		}
		

	}

}
