package lectures.partIBasics

import javax.xml.transform.Result

object Functions extends App {
  def aFunction(a: String, b: Int): String =
    a + " " + b

  println(aFunction("hello", 3))

  def aParameterlessFunction(): Int = 42

  println(aParameterlessFunction());

  def aRepeatedFunction(aString: String, n: Int): String = {
    if (n == 1) aString
    else aString + aRepeatedFunction(aString, n - 1)
  }

  println(aRepeatedFunction("Hi", 3))

  def aFunctionWithSideEffects(aString: String): Unit = println(aString)

  def aBigFunction(n: Int): Int = {
    def aSmallerFunction(a: Int, b: Int): Int = a + b
    aSmallerFunction(n, n - 1);
  }

  //1. A greeting function for kids 2 parameters name and age => Hi, My name is $name and I am $age years old.
  //2. Factorial function 1*2*3*...* n (Recursive function)
  //3. A fibonacci function
  //    f(1) = 1
  //    f(2) = 1
  //    f(n) = f(n-1) + f(n-2)
  //4. Tests if a number is prime

  /*
  A greeting function for kids
  @param name name of the child
  @param age age of the child
   */
  def greetingForKids(name: String, age: Int): String = {
    f"Hi, My name is ${name} and I'm ${age} years old"
  }
  val result = greetingForKids("John", 37)
  println(result);

  /*
   Factorial function
   @param number product number
   */
  def getTheFactorial(number: Int): Int = {
    if (number <= 0) 1
    else number * getTheFactorial(number - 1)

  }

  val factorialResult = getTheFactorial(3);

  /* fibonacci function */
  def fibonacci(n: Int): Int = {
    if (n <= 2) 1
    else fibonacci(n - 1) + fibonacci(n - 2)
  }

  val fibonacciResult = fibonacci(8);
  println(fibonacciResult)

  def isPrime(n: Int): Boolean = {
    //Auxiliary function
    def isPrimUntil(t: Int): Boolean = {
      if (t <= 1) true
      else n % t != 0 && isPrimUntil(t - 1)
    }
    isPrimUntil(n / 2)
  }

}

// WHEN YOU NEED LOOPS, USE RECURSION -> SCALA PROGRAMMING
// Need to define return type definitely if its a recursive function
// Auxiliary function
