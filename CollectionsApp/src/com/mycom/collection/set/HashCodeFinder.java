package com.mycom.collection.set;

public class HashCodeFinder {

	public static void main(String[] args) {
		String str1 = "Hello"; //hash code is asigned
		String str2 = "Hello";
		
		String str3 = new String("Hello");
		//HashCode is the address of an object in heap memory
		
		System.out.println("Hash code of str1 - " + str1.hashCode());
		System.out.println("Hash code of str2 - " + str2.hashCode());
		System.out.println("Hash code of str3 - " + str3.hashCode());
		
		Student student1 = new Student(1001, "Kumar"); //hash code is different
		Student student2 = new Student(1001, "Kumar"); // hash code is different
		
		// 2nd object is created as hashCodes of 1st object and 2nd objects are unique
		// if 2nd object has same HashCode then 2nd object will not be created - hashCodes are compared with equals() method
		
		System.out.println("Hash code of student1- " + student1.hashCode());
		System.out.println("Hash code of student2- " + student2.hashCode());
	}

}
