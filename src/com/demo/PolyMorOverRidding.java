package com.demo;

public class PolyMorOverRidding {

	public static void main(String[] args) {
		Vehicle obj=new Bike();
		obj.start();
	}

}
class Vehicle {

    void start() {
        System.out.println("Vehicle is starting");
    }
}

class Car extends Vehicle {

    @Override
    void start() {
        System.out.println("Car starts with key/button");
    }
}

class Bike extends Vehicle {

    @Override
    void start() {
        System.out.println("Bike starts with self-start");
    }
}