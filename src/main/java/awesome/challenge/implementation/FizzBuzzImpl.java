package awesome.challenge.implementation;

import java.util.Arrays;

import awesome.challenge.definition.FizzBuzzable;

public class FizzBuzzImpl implements FizzBuzzable{

	public String fizzBuzzMaker(int[] arr) {
		// Make uncle bob proud...
		Arrays.sort(arr);
		String res = "";
		for (int n=0;n<arr.length;n++) {
			System.out.println(arr[n]);
			res+= (arr[n]%5==0&&arr[n]%3==0?"FizzBuzz":(arr[n]%3==0?"Fizz":(arr[n]%5==0?"Buzz":String.valueOf(arr[n]))));
			if (n != arr.length -1) res+= ", ";
		}
		return res;
		
	}
}
