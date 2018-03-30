package awesome.challenge.implementation;

import java.util.Arrays;
import java.util.stream.Collectors;

import awesome.challenge.definition.FizzBuzzable;

public class FizzBuzzImpl implements FizzBuzzable {

	public String fizzBuzzMaker(int[] arr) {
		// Make uncle bob proud...
		Arrays.sort(arr);

        String fizzBuzzString =  Arrays.stream(arr)
                .boxed()
                .map((Integer i) -> {
                    String result = Integer.toString(i);
                    if(i % 3 == 0 && i % 5 == 0){
                        result =  "FizzBuzz";
                    }else if (i % 5 == 0){
                        result =  "Buzz";
                    }else if(i % 3 == 0){
                        result =  "Fizz";
                    }

                    return result;
                })
                .collect(Collectors.joining(", "));

        return fizzBuzzString;
	}
}
