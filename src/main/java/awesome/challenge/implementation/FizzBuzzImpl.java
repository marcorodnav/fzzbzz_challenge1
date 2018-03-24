package awesome.challenge.implementation;

import java.util.Arrays;
import java.util.stream.Collectors;

import awesome.challenge.definition.FizzBuzzable;

public class FizzBuzzImpl implements FizzBuzzable{

	public String fizzBuzzMaker(int[] arr) {
		// Make uncle bob proud...
		int[] sorted = new int[arr.length];
		int min = arr[0];
	    int max = arr[0];
	    for (int i = 1; i < arr.length; i++) {
	      if (arr[i] < min) {
	        min = arr[i];
	      } else if (arr[i] > max) {
	        max = arr[i];
	      }
	    }
	    int[] counts = new int[max - min + 1];
	 
	    for (int i = 0;  i < arr.length; i++) {
	      counts[arr[i] - min]++;
	    }
	 
	    counts[0]--;
	    for (int i = 1; i < counts.length; i++) {
	      counts[i] = counts[i] + counts[i-1];
	    }
	  
	    for (int i = arr.length - 1; i >= 0; i--) {
	    	sorted[counts[arr[i] - min]--] = arr[i];
	    }
		return Arrays.stream(sorted).boxed().map(n->(n%5==0&&n%3==0?"FizzBuzz":(n%5==0?"Buzz":(n%3==0?"Fizz":String.valueOf(n))))).collect(Collectors.joining(", "));
	}
}
