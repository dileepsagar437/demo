package com.example.demo;
//>>>>>>>>>>>>>>>>>>>>>>inheritance<<<<<<<<<<<<<<<<<<<<<<<
class Vehicel {                                //super class
	  protected String brand = "Ford";        // Vehicle attribute
	  public void honk() {                    // Vehicle method
	    System.out.println("Tuut, tuut!");
	  }
	}

	class Car extends Vehicel {             //subclass by using extends
	  public String modelName = "Mustang"; 
	}// Car attribute
