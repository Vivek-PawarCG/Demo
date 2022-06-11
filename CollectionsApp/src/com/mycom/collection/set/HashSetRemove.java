package com.mycom.collection.set;

import java.util.HashSet;

public class HashSetRemove {

	public static void main(String[] args) {
HashSet<String> langSet = new HashSet<String>();
		
		//Add elements in the array list
		langSet.add("java");
		langSet.add("Python");
		langSet.add("C++");
		System.out.println("HashSet:" + langSet);
		
		System.out.println("Deleting Java");
		boolean isRemoved = langSet.remove(0);//no error message
		System.out.println("Is langSet(0) removed..?" + isRemoved);
		
		langSet.remove("C++");
		
		System.out.println("Language set after deleting C++");
		System.out.println("HashSet: " + langSet);

	}

}
