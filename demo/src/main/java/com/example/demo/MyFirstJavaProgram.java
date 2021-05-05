package com.example.demo;

public class MyFirstJavaProgram {
	

	public static void main(String[] args) {
		
		String name = "john" ;//creating a variable name of type string 
		System.out.println(name);
		
		int numb = 15;
		System.out.println(numb); //creating a variable of type int
		
		int myNumb;
		myNumb = 20;//creating a variable and assigning value later 
		System.out.println(myNumb);
		
		int myNumb1 = 15;
		myNumb1 = 20;//creating a variable and changing the value
		System.out.println(myNumb1);
		
		final int myNumb2 = 1100; //its a final or constant value
		System.out.println(myNumb2);
		
		//data types
		float x = 1.9f;
		char myLetter = 'y';
		
		boolean value = true;
		System.out.println(value);
		
		String y = "hello";
		
		String myname = "dileep" ;
		System.out.println("hello" + myname);
		
		String firstName = "dileep" ;
		String lastName = "sagar";
		System.out.println(firstName + lastName);
		
		int x1 = 5;
		int y1 = 6;
		System.out.println(x1 + y1); 
		
		//Primitive data types - includes byte, short, int, long, float, double, boolean and char
		//Non-primitive data types - such as String, Arrays and Classes 
		
		//Strings
		String txt = "hellothere";
		System.out.println("The length of the txt string is: " + txt.length());
		
		String txt1 = "Hello World";
		System.out.println(txt1.toUpperCase());   
		System.out.println(txt1.toLowerCase()); 
		
		String txt2 = "Please locate where 'locate' occurs!";
		System.out.println(txt2.indexOf("locate")); 
		
		//String Concatination
		String firstName1 = "John";
		String lastName1 = "Doe";
		System.out.println(firstName1 + " " + lastName1);
		
		String firstNam="dileep";
		String lastNam="seg";
		System.out.println(firstNam.concat(lastNam));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("Hello World");
		
		// This is a comment
		/*
		      Multi-line Comments
	     */
	}

}
