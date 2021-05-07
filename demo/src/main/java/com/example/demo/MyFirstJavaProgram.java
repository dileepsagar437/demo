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
		
		//Math
		int a = 2;
		int b = 4;
		System.out.println(Math.max(a,b));
		
		int a1 = 5;
		int b1 = 10;
		System.out.println(Math.min(a1, b1));
		
		System.out.println(Math.sqrt(64));
		
		int randomNum = (int)(Math.random() * 101); 
		System.out.println(randomNum);
		
		//Boolean
		int x2 = 10;
		int y2 = 9;
		System.out.println(x2 > y2);
		    
		//if else
		int q=20;
		if(q>49) {
			System.out.println("its true");
		} else {
			System.out.println("its false");
		}
		//else if
		int clock = 22;
		if (clock < 10) {
		  System.out.println("Good morning.");
		} else if (clock < 20) {
		  System.out.println("Good day.");
		} else {
		  System.out.println("Good evening.");
		}
		
		//switch
		int u = 4 ;
		switch (u) {
		case 1 : 
			System.out.println("its day 1");
			break;
		case 2 :
			System.out.println("its day 2");
			break;
		case 3 :
			System.out.println("its day 3");
			break;
		case 4 :
			System.out.println("its day 4");
			break;
		default :
			System.out.println("its weekend");
			break;
		}		
		
		
		//while loop
		int d = 1;
		while(d<5) {
			System.out.println(d);
			d++;
		}
		
     	int d1 = 0;
		do{
			System.out.println(d1);
			d1++;
			}
		while(d1<5);
		
		//for
		for(a=0;a<=10;a=a+2) {
			System.out.println(a); 
			
		}
		
		String[] cars = {"bagauti", "BMW", "Ford", "tayota"};
		for (String i : cars) {
		  System.out.println(i);
		}
		
		
		int r ;//break used to break the loop
		for (r=0;r<=10;r++) {
			if(r==2) {
				continue; //continue used to skip one iteration
			}
			if(r==5) {
				break;
			}
			
			System.out.println(r);
		}
		
		//strings
		String[] cars1 = {"benz","ford","rolce" };
		System.out.println(cars1[0]);
		cars1[1]= "tata";
		System.out.println(cars1[1]);
		System.out.println(cars1.length);
		for(int o=0;o<3;o++)
		{
			System.out.println(cars1[o]);
		}
		
		
		
		
		
		System.out.println("Hello World");
		
		// This is a comment
		/*
		      Multi-line Comments
	     */
	}

}
