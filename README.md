# Fizz Buzz challenge

Fizz buzz is a word game, where the goal is to show the numbers from 1 to 100. In the process of showing the 
sequence, there are some conditions:

1 - For each number that is divisible by 3, you must replace it with the word "Fizz"

2 - For each number that is divisible by 5, you must replace it with the word "Buzz"

3 - For each number that fulfills conditions 1 and 2 at the same time, you must replace it with the word "FizzBuzz"

## The Challenge
The challenge is to come up with a method that receives as an argument an N-size array of integers (posibly unordered) and then it
should return a string of characters withe the corresponding FizzBuzz sequence (according to the rules described previously).

### Input rules
An an array of ints, with any integer (positive or negative) number, including **ZERO**

Sample input:

**[-1,2,-3,15,6]**

### Output rules
A string with the values corresponding to the rules, separated by a comma and a blank space

Corresponding output:
**"Fizz, -1, 2, Fizz, FizzBuzz"**

By cloning this repository you'll get a simple maven project to solve the challenge.

It already has the tests for assuring the completion of the challenge.

You must add the implementation for the method *fizzBuzzMaker* located inside the class *FizzBuzzImpl*

To test your solution, execute the command:

```
mvn clean test 
```

From the command line or from your IDE of preference
