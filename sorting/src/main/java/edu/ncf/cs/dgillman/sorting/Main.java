package edu.ncf.cs.dgillman.sorting;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class Main {

	public static void main(String[] args) {
		// TODO Generate 10 random numbers. Print. Sort. Print again.
	    int N = 10;
	    int NUMBOUND = 100;
	    
	    List<Integer> numbers = new ArrayList<>();
	    Random r = new Random();
	    for (int i=0; i < N; i++) {
	        numbers.add(r.nextInt(NUMBOUND));
	    }
	    
	    System.out.println("Numbers pre-sort: ");
	    for (int i=0; i < N; i++) {
	        System.out.println(numbers.get(i));
	    }
	    
	    // Create our sorting object.
	    Sort sort = new InsertionSort();
	    
	    // Sort our list of numbers.
	    sort.run(numbers);
	    
	    // Print out the results.
	    System.out.println("Numbers post-sort: ");
        for (int i=0; i < N; i++) {
            System.out.println(numbers.get(i));
        }
	}

}
