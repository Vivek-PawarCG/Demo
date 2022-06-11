package com.mycom.collection.set;

import java.util.HashSet;
public class HashSetLanguageAddAll {

	public static void main(String[] args) {
	
		
		//create array list 
		HashSet<String> langSet = new HashSet<String>();
		
		//add() method without the index parameter
		
		langSet.add("Java");
		langSet.add("C");
		langSet.add("Python");
		System.out.println("HashSet: " + langSet);
		
		HashSet<String> langSet2 = new HashSet<String>();
		langSet2.add("Node JS");
		langSet2.add("Angular JS");
		langSet2.add("node JS");
		System.out.println("Array List 2 " + langSet2);
		System.out.println("Adding langSet2 to langSet...");
		
		langSet.addAll( langSet2 );
		System.out.println("Language list after updation.." + langSet);
		

	}

}
