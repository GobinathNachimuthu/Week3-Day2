package week3.day2;

import java.util.Set;
import java.util.TreeSet;

public class FindIntersection {
	public static void main(String[] args) {
		int[] array = { 3, 2, 11, 4, 6, 7 };
		int[] array1 = { 1, 2, 8, 4, 9, 7 };
		Set<Integer> num1 = new TreeSet<Integer>();
		for (int i = 0; i < array.length; i++) {
			num1.add(array[i]);

		}
		Set<Integer> uniqueNumbers2 = new TreeSet<Integer>();
		for (int j = 0; j < array1.length; j++) 
		{
			uniqueNumbers2.add(array1[j]);
		}
		for (int i = 0; i < array.length; i++) 
		{
			for (int j = 0; j < array1.length; j++) 
			{
				if (array[i] == array1[j]) 
				{
					System.out.println(array[i]);

				}
			}
		}
	}
}

/*
 * Pseudo Code
 * 
 * a) Declare An array for {3,2,11,4,6,7}; b) Declare another array for
 * {1,2,8,4,9,7}; c) Declare for loop iterator from 0 to array length d) Declare
 * a nested for another array from 0 to array length e) Compare Both the arrays
 * using a condition statement
 * 
 * f) Print the first array (shoud match item in both arrays)
 */