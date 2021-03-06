package main;
import hash.DoubleHash;
import hash.Hash;
import hash.LinearHash;
import hash.QuadraticHash;

public class Lab91Main 
{
	public static void main(String[] args) 
	{
		System.out.println("Tests for linear hash\n");
		Hash linearHash = new LinearHash();
		linearHash.put(1);
		linearHash.put(2);
		linearHash.put(235);
		linearHash.put(345);
		linearHash.put(67);
		linearHash.put(324);
		linearHash.put(456);
		linearHash.put(234);
		linearHash.put(53);
		linearHash.put(324);
		linearHash.put(435);
		linearHash.put(546);
		linearHash.put(35);
		linearHash.put(234);
		
		System.out.println("Trying to access element that isn't in the array");
		System.out.println(linearHash.get(4));
		System.out.println("Trying to access element that is in the array");
		System.out.println(linearHash.get(546));
		System.out.println("Checking if element 4 is in the array");
		System.out.println(linearHash.containsKey(4));
		System.out.println("Checking if element 546 is in the array");
		System.out.println(linearHash.containsKey(546));
		System.out.println("Size of the array");
		System.out.println(linearHash.size());
		System.out.println("Is array empty?");
		System.out.println(linearHash.isEmpty());
		System.out.println("Showing the whole array");
		linearHash.dump();
		
		System.out.println("\n\nTests for quadratic hash\n");
		Hash quadraticHash = new QuadraticHash();
		quadraticHash.put(1);
		quadraticHash.put(2);
		quadraticHash.put(235);
		quadraticHash.put(345);
		quadraticHash.put(67);
		quadraticHash.put(324);
		quadraticHash.put(456);
		quadraticHash.put(234);
		quadraticHash.put(53);
		quadraticHash.put(324);
		quadraticHash.put(435);
		quadraticHash.put(546);
		quadraticHash.put(35);
		quadraticHash.put(234);
		
		System.out.println("Trying to access element that isn't in the array");
		System.out.println(quadraticHash.get(4));
		System.out.println("Trying to access element that is in the array");
		System.out.println(quadraticHash.get(546));
		System.out.println("Checking if element 4 is in the array");
		System.out.println(quadraticHash.containsKey(4));
		System.out.println("Checking if element 546 is in the array");
		System.out.println(quadraticHash.containsKey(546));
		System.out.println("Size of the array");
		System.out.println(quadraticHash.size());
		System.out.println("Is array empty?");
		System.out.println(quadraticHash.isEmpty());
		System.out.println("Showing the whole array");
		quadraticHash.dump();
		
		System.out.println("\n\nTests for double hash\n");
		Hash doubleHash = new DoubleHash();
		doubleHash.put(1);
		doubleHash.put(2);
		doubleHash.put(235);
		doubleHash.put(345);
		doubleHash.put(67);
		doubleHash.put(324);
		doubleHash.put(456);
		doubleHash.put(234);
		doubleHash.put(53);
		doubleHash.put(324);
		doubleHash.put(435);
		doubleHash.put(546);
		doubleHash.put(35);
		doubleHash.put(10);
		
		System.out.println("Trying to access element that isn't in the array");
		System.out.println(doubleHash.get(4));
		System.out.println("Trying to access element that is in the array");
		System.out.println(doubleHash.get(546));
		System.out.println("Checking if element 4 is in the array");
		System.out.println(doubleHash.containsKey(4));
		System.out.println("Checking if element 546 is in the array");
		System.out.println(doubleHash.containsKey(546));
		System.out.println("Size of the array");
		System.out.println(doubleHash.size());
		System.out.println("Is array empty?");
		System.out.println(doubleHash.isEmpty());
		System.out.println("Showing the whole array");
		doubleHash.dump();
	}
}
