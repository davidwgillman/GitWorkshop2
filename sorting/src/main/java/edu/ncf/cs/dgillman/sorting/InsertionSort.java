package edu.ncf.cs.dgillman.sorting;

import java.util.List;
import java.lang.Number;

public class InsertionSort implements Sort {
	
	public void run(List<Integer> list) {
		for (int i=1; i < list.size(); i++) {
		    int j = i;
		    while (j > 0 && (list.get(j-1) > list.get(j))) {
		        Integer temp = list.get(j-1);
		        list.set(j-1, list.get(j));
		        list.set(j, temp);
		        j--;
		    }
		}
	}

}
