package awesome.challenge.implementation;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Arrays;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import awesome.challenge.definition.FizzBuzzable;

public class FizzBuzzImplTest {

	private static FizzBuzzable fizzy;
	
	@BeforeAll
    static void initAll() {
		fizzy = new FizzBuzzImpl();
    }
	
	@Test
	public void test1() {
		int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
		String res1 = fizzy.fizzBuzzMaker(arr1);
		assertAll("Test1 for an ordered positive-value array of integers",
				() -> assertNotNull(res1),
				() -> assertEquals(new Integer(arr1.length),sizeOfStringValues.apply(res1)),
				() -> assertEquals("1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz", res1)
		);
		
	}
	
	@Test
	public void test2() {
		int[] arr2 = {10,9,8,7,6,5,4,3,2,1};
		String res2 = fizzy.fizzBuzzMaker(arr2);
		assertAll("Test2 for a reversed positive-value array of integers",
				() -> assertNotNull(res2),
				() -> assertEquals(new Integer(arr2.length),sizeOfStringValues.apply(res2)),
				() -> assertEquals("1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz", res2)
		);
	}
	
	@Test
	public void test3() {
		int[] arr3 = {-10,-9,-8,-7,-6,-5,-4,-3,-2,-1};
		String res3 = fizzy.fizzBuzzMaker(arr3);
		
		assertAll("Test3 for an ordered negative-value array of integers",
				() -> assertNotNull(res3),
				() -> assertEquals(new Integer(arr3.length),sizeOfStringValues.apply(res3)),
				() -> assertEquals("Buzz, Fizz, -8, -7, Fizz, Buzz, -4, Fizz, -2, -1", res3)
		);
	}
	
	@Test 
	public void test4() {
		int[] arr4 = {-1,-2,-3,-4,-5,-6,-7,-8,-9,-10};
		String res4 = fizzy.fizzBuzzMaker(arr4);
		
		assertAll("Test4 for reversed negative-value array of integers",
				() -> assertNotNull(res4),
				() -> assertEquals(new Integer(arr4.length),sizeOfStringValues.apply(res4)),
				() -> assertEquals("Buzz, Fizz, -8, -7, Fizz, Buzz, -4, Fizz, -2, -1", res4)
		);
	}
	
	@Test
	public void test5() {
		int[] arr5 = {3,6,5,17,1,-1,-2,0,15,50};
		String res5 = fizzy.fizzBuzzMaker(arr5);
		
		assertAll("Test5 for an unordered positive and negative value array of integers",
				() -> assertNotNull(res5),
				() -> assertEquals(new Integer(arr5.length),sizeOfStringValues.apply(res5)),
				() -> assertEquals("-2, -1, FizzBuzz, 1, Fizz, Buzz, Fizz, FizzBuzz, 17, Buzz", res5)
		);
	}
	
	@Test
	public void test6() {
		int[] arr6 = {0,-999750, -999990, 856252, 201525,0, 201525, 999990, 3,3,3,3,2,2,20,30,20};
		String res6 = fizzy.fizzBuzzMaker(arr6);
		
		assertAll("Test6 for an unordered positive and negative value array of large integers",
				() -> assertNotNull(res6),
				() -> assertEquals(new Integer(arr6.length),sizeOfStringValues.apply(res6)),
				() -> assertEquals("FizzBuzz, FizzBuzz, FizzBuzz, FizzBuzz, 2, 2, Fizz, Fizz, Fizz, Fizz, Buzz, Buzz, FizzBuzz, FizzBuzz, FizzBuzz, 856252, FizzBuzz", res6)
		);
	}
	
	@Test
	public void test7() {
		int[] arr7 = hugeArrSupp.get();
		double start = System.currentTimeMillis();
		String res7 = fizzy.fizzBuzzMaker(arr7);
		double end = System.currentTimeMillis();
		System.out.println("Execution time of test7: " + (end - start) / 1000 + " seconds.");
		
		assertAll("Test7 for a huge amount of integers",
				() -> assertNotNull(res7),
				() -> assertEquals(new Integer(arr7.length), sizeOfStringValues.apply(res7))
		);
	}

    @AfterAll
    static void tearDownAll() {
    	fizzy = null;
    }
    
    private static Supplier<int[]> hugeArrSupp = () -> {
		Integer[] integers = new Integer[2000000];
		IntStream.range(-1000000, 1000000).boxed().collect(Collectors.toList()).toArray(integers);
		return Arrays.stream(integers).mapToInt(Integer::intValue).toArray();
	};
    
    private static Function<String, Integer> sizeOfStringValues = (str) -> Arrays.asList(str.split("\\s*,\\s*")).size();

}
