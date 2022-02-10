package week3.day2;

import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {
	public static void main(String[] args) {
		int[] data = { 3, 2, 11, 4, 6, 7 };
		int first = 0;
		int second = 0;
		Set<Integer> uniqueNumbers = new TreeSet<Integer>();
		{
			for (int i = 0; i < data.length; i++)

			{
				uniqueNumbers.add(data[i]);
				if (data[i] > first) {
					second = first;
					first = data[i];
				} else if (data[i] > second) {
					second = data[i];
				}
			}
			System.out.println("Second largest:" + second);
		}
	}
}

/*
 * Pseudo Code: 1) Arrange the array in ascending order 2) Pick the 2nd element
 * from the last and print it
 */