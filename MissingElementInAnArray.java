package week3.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MissingElementInAnArray {
	public static void main(String[] args) {
		// Here is the input
		int[] arr = { 1, 2, 3, 4, 7, 6, 8 };
		Set<Integer> uniqueNumbers = new TreeSet<Integer>();
		for (int i = 0; i < arr.length; i++) {
			uniqueNumbers.add(arr[i]);
		}
		System.out.println(uniqueNumbers);
		List<Integer> allnum = new ArrayList<Integer>(uniqueNumbers);
		for (int i = 1; i <= allnum.size(); i++) {
			if (i != allnum.get(i - 1)) {
				System.out.println(i);
				break;
			}
		}
	}
}

// Sort the array

// loop through the array (start i from arr[0] till the length of the array)

// check if the iterator variable is not equal to the array values respectively

// print the number

// once printed break the iteration
