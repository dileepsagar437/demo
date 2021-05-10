package com.example.demo;
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>Java Classes<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

public class Main {
	int x =5;  
	int y=10; //here x is class attribute
	//multiple attributes
	String fName = "trump";
	String lName = "Donald";
	int age = 100;
	
	//ClassMethods
	//diff between static and public (static and non- static)
	static void myMethod() {//we can directly access static type
		System.out.println("hello its static type");
	}
	//for pulic void we cant use println we simply use object . along with method
	public void myMethod1(){//we can only access it through by object we cant access it by directly 
		System.out.println("hello its public type");
	}
	
	//accessing methods with an object
	public void fullThrottle() {
		System.out.println("this car s on full throttle speed");
	}
	public void mySpeed(int speed) {
		System.out.println("this car max speed is "+ speed);
	}
	int z;
	public Main() {
		z = 100;
	}
	 int modelYear;
     String modelName;
     
     public Main(String name,int year) {
  	   modelYear=year;
  	   modelName=name;
     }
	
	
	public static void main(String[] args) {
		Main myObj = new Main();     //To create an object of MyClass, specify the class name, followed by the object name, and use the keyword new
		Main myObj2 = new Main();
		System.out.println(myObj.x); //we can access the attribute by dot(.)Accessing Attributes
		   myObj2.x =20;             //Modify Attributes
		System.out.println(myObj2.y);
		System.out.println(myObj2.x);//changing attribute value of x without effecting the main value
        System.out.println("usa 45th president" +" "+ myObj.fName +" "+ myObj2.lName +"age is " +myObj.age);
        //static and non static
        myMethod();
        myObj.myMethod1();
       //accessing methods with an object
        Main myCar = new Main();
        myCar.fullThrottle();
        myCar.mySpeed(200);
        Main myObjcon= new Main();//calling a constructor	
        System.out.println(myObjcon.z);	
        Main myCar1 = new Main("benz",1994);
        System.out.println("car we buyed is "+ myCar1.modelName +" and model year is " + myCar1.modelYear );
	}

}



