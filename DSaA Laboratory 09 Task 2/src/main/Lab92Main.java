package main;
import java.util.Random;

import hash.DoubleHash;
import hash.Hash;
import hash.LinearHash;
import hash.QuadraticHash;

public class Lab92Main 
{
	
	public static void main(String[] args) 
	{
		Random random = new Random(101);
		int[] valuesToInput = new int[900];
		Hash linearHash = new LinearHash();
		Hash quadraticHash = new QuadraticHash();
		Hash doubleHash = new DoubleHash();
		
		for (int i=0; i<900; i++)
		{
			valuesToInput[i] = random.nextInt(10000);
		}
		
		for (int i=0; i<700; i++)
		{
			int value = valuesToInput[i];
			linearHash.put(value);
			quadraticHash.put(value);
			doubleHash.put(value);
		}
		
		// Each test is made for 500 keys that are in the array and 500 keys that aren't
		
		System.out.println("Tests for alpha equal 0.7\n");
		for (int i=0; i<500; i++)
		{
			int value1 = valuesToInput[random.nextInt(700)];
			int value2 = 10000 + random.nextInt(10000);
					
			linearHash.get(value1);
			linearHash.get(value2);
			quadraticHash.get(value1);
			quadraticHash.get(value2);
			doubleHash.get(value1);
			doubleHash.get(value2);
		}
		System.out.println("Linear Hash");
		System.out.println("Average number of tries (successful searches) : " + linearHash.getAverageNoTriesSuccess());
		System.out.println("Average number of tries (failed searches) : " + linearHash.getAverageNoTriesFail());
		System.out.println("Average number of tries : " + linearHash.getAverageNoTries() + "\n");
		
		System.out.println("Quadratic hash");
		System.out.println("Average number of tries (successful searches) : " + quadraticHash.getAverageNoTriesSuccess());
		System.out.println("Average number of tries (failed searches) : " + quadraticHash.getAverageNoTriesFail());
		System.out.println("Average number of tries : " + quadraticHash.getAverageNoTries() + "\n");
		
		System.out.println("Double hash");
		System.out.println("Average number of tries (successful searches) : " + doubleHash.getAverageNoTriesSuccess());
		System.out.println("Average number of tries (failed searches) : " + doubleHash.getAverageNoTriesFail());
		System.out.println("Average number of tries : " + doubleHash.getAverageNoTries() + "\n");
		
		linearHash.resetResults();
		quadraticHash.resetResults();
		doubleHash.resetResults();
		
		System.out.println("Tests for alpha equal 0.7\n");
		for (int i=0; i<100; i++)
		{
			int value = valuesToInput[700 + i];
			linearHash.put(value);
			quadraticHash.put(value);
			doubleHash.put(value);
		}
		
		for (int i=0; i<500; i++)
		{
			int value1 = valuesToInput[random.nextInt(800)];
			int value2 = 10000 + random.nextInt(10000);
					
			linearHash.get(value1);
			linearHash.get(value2);
			quadraticHash.get(value1);
			quadraticHash.get(value2);
			doubleHash.get(value1);
			doubleHash.get(value2);
		}
		System.out.println("Linear Hash");
		System.out.println("Average number of tries (successful searches) : " + linearHash.getAverageNoTriesSuccess());
		System.out.println("Average number of tries (failed searches) : " + linearHash.getAverageNoTriesFail());
		System.out.println("Average number of tries : " + linearHash.getAverageNoTries() + "\n");
		
		System.out.println("Quadratic hash");
		System.out.println("Average number of tries (successful searches) : " + quadraticHash.getAverageNoTriesSuccess());
		System.out.println("Average number of tries (failed searches) : " + quadraticHash.getAverageNoTriesFail());
		System.out.println("Average number of tries : " + quadraticHash.getAverageNoTries() + "\n");
		
		System.out.println("Double hash");
		System.out.println("Average number of tries (successful searches) : " + doubleHash.getAverageNoTriesSuccess());
		System.out.println("Average number of tries (failed searches) : " + doubleHash.getAverageNoTriesFail());
		System.out.println("Average number of tries : " + doubleHash.getAverageNoTries() + "\n");
		
		linearHash.resetResults();
		quadraticHash.resetResults();
		doubleHash.resetResults();

		System.out.println("Tests for alpha equal 0.9\n");
		for (int i=0; i<100; i++)
		{
			int value = valuesToInput[800 + i];
			linearHash.put(value);
			quadraticHash.put(value);
			doubleHash.put(value);
		}
		
		for (int i=0; i<500; i++)
		{
			int value1 = valuesToInput[random.nextInt(900)];
			int value2 = 10000 + random.nextInt(10000);
					
			linearHash.get(value1);
			linearHash.get(value2);
			quadraticHash.get(value1);
			quadraticHash.get(value2);
			doubleHash.get(value1);
			doubleHash.get(value2);
		}
		System.out.println("Linear Hash");
		System.out.println("Average number of tries (successful searches) : " + linearHash.getAverageNoTriesSuccess());
		System.out.println("Average number of tries (failed searches) : " + linearHash.getAverageNoTriesFail());
		System.out.println("Average number of tries : " + linearHash.getAverageNoTries() + "\n");
		
		System.out.println("Quadratic hash");
		System.out.println("Average number of tries (successful searches) : " + quadraticHash.getAverageNoTriesSuccess());
		System.out.println("Average number of tries (failed searches) : " + quadraticHash.getAverageNoTriesFail());
		System.out.println("Average number of tries : " + quadraticHash.getAverageNoTries() + "\n");
		
		System.out.println("Double hash");
		System.out.println("Average number of tries (successful searches) : " + doubleHash.getAverageNoTriesSuccess());
		System.out.println("Average number of tries (failed searches) : " + doubleHash.getAverageNoTriesFail());
		System.out.println("Average number of tries : " + doubleHash.getAverageNoTries() + "\n");
		
		linearHash.resetResults();
		quadraticHash.resetResults();
		doubleHash.resetResults();
	}

}
