// Given a sorted array arr[] of positive integers, the task is to find the frequency 
// for each element in the array. Assume all elements in the array are less than some constant M

// Input: arr[] = [1, 1, 1, 2, 3, 3, 5, 5, 8, 8, 8, 9, 9, 10]
// Output: 
// Element 1 occurs 3 times
// Element 2 occurs 1 times
// Element 3 occurs 2 times
// Element 5 occurs 2 times
// Element 8 occurs 3 times
// Element 9 occurs 2 times
// Element 10 occurs 1 times

import java.io.*;
import java.util.*;
class GFG {
	public static void findFrequencies(int[] ele, int n) {
		int freq = 1;
		int idx = 1;
		int element = ele[0];
		while (idx < n) {
			if (ele[idx - 1] == ele[idx]) {
				freq++;
				idx++;
			}
			else {
				System.out.println(element + " " + freq);
				element = ele[idx];
				idx++;
				freq = 1;
			}
		}
		System.out.println(element + " " + freq);
	}
	public static void main(String[] args) {

		System.out.println(
			"---frequencies in a sorted array----");
		int[] arr = { 10, 20, 30, 30, 30, 40, 50, 50, 50, 50, 70 };
		int n = arr.length;
		findFrequencies(arr, n);
	}
}
