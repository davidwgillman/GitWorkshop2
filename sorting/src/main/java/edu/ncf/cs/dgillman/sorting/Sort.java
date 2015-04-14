package edu.ncf.cs.dgillman.sorting;

import java.util.List;
import java.lang.Number;


/** Sort interface for various sorting algorithms
 * 
 *  Poor design: 
 *   just the sorting procedure
 *   just for Integers
 * 
 * @author dgillman
 *
 */
public interface Sort {
	void run( List<Integer> list);
}
