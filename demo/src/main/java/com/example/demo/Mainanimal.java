package com.example.demo;
//>>>>>>>>>>>>>>>>>>>>>>>>>>java polymorphism<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
//Polymorphism means "many forms",that when we have many classes that are related to each other by inheritance.



class Mainanimal{
	public static void main(String[] args) {
		Animal myAnimal = new Animal();
		Animal myPig = new Pig();
		Animal myDog = new Dog();
		myAnimal.animalSounds();
		myPig.animalSounds();
		myDog.animalSounds();
		
	}
}