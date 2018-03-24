package awesome.challenge.implementation;

public class Main {

	public static void main(String[] args) {
		FizzBuzzImpl inst = new FizzBuzzImpl();
		int[] arr6 = {1,2,3,4,5,6,7,8,9,10};
		String res6 = inst.fizzBuzzMaker(arr6);
		System.out.println(res6);
		System.out.println(res6.equals("1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz"));

	}
	
}
