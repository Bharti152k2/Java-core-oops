package com.demo;

public class PolyMorOverLoading {
//	String name;
//	String address;
//	String gender;
//	String color;
//	String favNum;
//	String favFood;
	PolyMorOverLoading(String name) {
//		this.name=name;
		System.out.print(name);
		System.out.print("1");
	}
	PolyMorOverLoading(String name,String address) {
//		this.name=name;
//		this.address=address;
		this("Bharti","Hyderabad","RoseGold","15","BroklySoup");
		System.out.print("2");
		System.out.print(name+" "+address);
		
	}
	PolyMorOverLoading(String name,String address,String color, String favNum, String favFood) {
//		System.out.print(name,address,color,favNum,favFood);
		System.out.println(name+" "+address+" "+color+" "+favNum+ " "+favFood);
		System.out.print("3");
	}
//	void methodLoading(String name) {
//		System.out.println(name);
//	}
//	void methodLoading(String gender, String color) {
//		System.out.print(gender+ " " + color);
//	}
	public static void main(String[] args) {
		PolyMorOverLoading obj= new PolyMorOverLoading("Sunny","Jaipur");
//		obj.methodLoading("Bharti");
//		
//		obj.methodLoading("Female","Beauty with brain");
	}
}
