package com.example.demo;

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
	public static void main(String[] args) {
		Mainconst myObj = new Mainconst(10);
		Mainconst myCar = new Mainconst("benz",1994);
		System.out.println(myObj.a);
		System.out.println(myObj.c);
		System.out.println("car we buyed is "+ myCar.modelName +" and model year is " + myCar.modelYear );
		

	}

}
