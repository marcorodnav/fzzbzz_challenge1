package awesome.challenge.implementation;

import java.util.Arrays;
import java.util.stream.Collectors;

import awesome.challenge.definition.FizzBuzzable;

public class FizzBuzzImpl implements FizzBuzzable{

	public String fizzBuzzMaker(int[] arr) {
		// Make uncle bob proud...
		return String.join(", ", Arrays.stream(arr).boxed().sorted().map(n->(n%5==0&&n%3==0?"FizzBuzz":(n%5==0?"Buzz":(n%3==0?"Fizz":String.valueOf(n))))).collect(Collectors.toList()));
		
	}
}
