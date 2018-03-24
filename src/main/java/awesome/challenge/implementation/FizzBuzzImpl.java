package awesome.challenge.implementation;

import java.util.Arrays;
import java.util.function.IntFunction;
import java.util.stream.Collectors;

import awesome.challenge.definition.FizzBuzzable;

public class FizzBuzzImpl implements FizzBuzzable {

	public String fizzBuzzMaker(int[] arr) {
		// Make uncle bob proud...

		IntFunction<String> MarcoJamasHubieraPensadoEnEsto = (int herpan) -> {
			if (herpan % 15 == 0) {
				return "FizzBuzz";
			}
			if (herpan % 3 == 0) {
				return "Fizz";
			}
			if (herpan % 5 == 0) {
				return "Buzz";
			}
			return String.valueOf(herpan);
		};

		String PalabrasSabiasDeMasterMarco = Arrays.stream(arr).boxed().sorted().map(
				MarcoElCrackDeTodosLosTiempos -> MarcoJamasHubieraPensadoEnEsto.apply(MarcoElCrackDeTodosLosTiempos))
				.collect(Collectors.joining(", "));

		return PalabrasSabiasDeMasterMarco;
	}
}
