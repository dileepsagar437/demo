package com.example.demo;
//creating an object along with a constructor 


//an object has both state and behavior ex: a dog has color,breed and hungry,barking
//class is a blue print that describes the behavior and state of the object
//methods is basically a behavior a class has so many methods ,where logics are written data is manuplated and the actions executed

//Programme file name >>exactly match the class name

//*****************************java methods**************************************************



public class Puppy {
	
	//method	
	  static void myMethod() { 
		  //void means that this  method does not have a return value
		  //static represents it belongs to main class not to  object of main class
		  System.out.println("myMethod executed");
		 }
	  
	 //passing a parameter 
	  static void myMethod2(String nature ) { //nature is a parameter
		  //When a parameter is passed to the method, it is called an argument
		System.out.println("its a " + nature + "dog");
	     }
 
	  //passing multiple parameters
	  static void myMethod3(String nature ,int age) {
		  System.out.println("its a " + nature + "dog and its age is" + age );
	  }
	  
	  //return value
	  //in place of void we use primitive data type (such as int, char, etc.) to return a value
	  static int myMethod4(int n) {
		 return 5 + n;
	  }
	  
	  static int myMethod5(int x,int y) {
		  return  x + y;
		  
	  }
	  
	  static int myMethod6(int x,int y) {
		  return  x + y;
		  
	  }
	  
	  //a method with if else 
	  
	  static void myMethod7(int age) {
		  if(age<18) {
			  System.out.println("you are not able to acess");
		  }else {
			  System.out.println("you are old enough to acess");
		  }
		  }
	  //by using different methods we can give same method names
	  
 public Puppy(String name ) {
	 //constructor with an parameter name
	 System.out.println("the name of the dog is" + name);
         }
	
	  public static void main(String[] args) {
		//the following create an object myPuppy
		Puppy myPuppy = new Puppy("tommmy");
		myMethod();
		myMethod2("cute"); //cute is an argument
		myMethod2("angry");
		myMethod3("happy",2);
		System.out.println(myMethod4(3));
		System.out.println(myMethod5(3,5));
		int z = myMethod6(5,5);
		System.out.println(z);
		myMethod7(20);
		
		
	}
	
}
