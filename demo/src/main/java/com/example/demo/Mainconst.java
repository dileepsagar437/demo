package com.example.demo;
import java.util.Scanner;//importing a scanner class 
import java.util.*;//importing a whole package

public class Mainconst {
	
	//Constructor Parameters
	int a;
	int c;
       public Mainconst(int b) {
    	   a=b;
    	   c=100;
    	   System.out.println(a); //we can print value like this also in constructor
       }
       
       //as many parameters as you want
       int modelYear;
       String modelName;
       public Mainconst(String name,int year) { 
    	   modelYear=year;
    	   modelName=name;
       }
       
       /*>>>>>>>>>>Modifiers<<<<<<<<<<
       modifiers>>1.access modifiers 2.non access modifiers
       1.access modifiers
       >For classes, you can use either public or default
       >For attributes, methods and constructors, you can use public,private, default and protected 
       2.Non-Access Modifiers
       >For classes, you can use either final or abstract
       >For attributes and methods, you can use final static abstract 
       >>>>>>>>encapsulation<<<<<<<
       
       >>>>>>>>java packages<<<<<<<
       Built-in Packages (packages from the Java API)
       User-defined Packages (create your own packages)
       import package.name.Class;   // Import a single class
       import package.name.*;   // Import the whole package
       ex:Import a Class. scanner class
       java.util is a package, while Scanner is a class of the java.util package. 
       and here using one of its methods ex:: nextLine()
       To import a whole package, end the sentence with an asterisk sign (*).
       ex::import java.util.*;
       User-defined Packages i.e.,creating our own package
       we need to understand that Java uses a file system directory to store our own packages
       └── root
          └── mypack
            └── MyPackageClass.java
        To create a package, use the "package" keyword  
          
        >>>>>>>>>>>>>>>Java Inheritance (Subclass and Superclass)<<<<<<<<<<<<<<<<<<<<<<<<<<<<
        In Java, it is possible to inherit attributes and methods from one class to another.
        subclass (child) - the class that inherits from another class
        superclass (parent) - the class being inherited from
        To inherit from a class, use the extends keyword.
        
       */
      
    	  
    	   
       
       
	public static void main(String[] args) {
		
		
        
		Mainconst myObj = new Mainconst(10);
		Mainconst myCar = new Mainconst("benz",1994);
		System.out.println(myObj.a);
		System.out.println(myObj.c);
		System.out.println("car we buyed is "+ myCar.modelName +" and model year is " + myCar.modelYear );
		//encapsulation
		Person myPerson = new Person();
        myPerson.setName("sagar");
        System.out.println(myPerson.getName());
        //javapackages imported scanner and using nextLine method
//        Scanner myObj1 = new Scanner(System.in);
//        System.out.println("Enter anyname here:");
//        String anyName = myObj1.nextLine();
//        System.out.println(anyName);
	}

}
