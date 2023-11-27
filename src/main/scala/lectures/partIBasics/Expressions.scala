package lectures.partIBasics

object Expressions extends App {
  val x = 1 + 2; // EXPRESSION
  println(x);

  print(2 + 3 * 4); // + - * / &

  println(1 == x);
  // == != > >= < <=

  println(!(1 == x))
  // ! && ||

  var aVariable = 2;
  aVariable += 3; // also works with -=, *=, /=
  println(aVariable)

  // Instructions (DO) vs expressions (VALUE)
  // Instructions -> do something

  val aCondition = true;
  val aConditionValue = if (aCondition) 5 else 3; // IF EXPRESSION
  println(aConditionValue)

//  var i = 0;
//  while (i < 10) {
//    println(i);
//    i += 1;
//  }
//Everything in scala is an expression

  val aWeirdValue = (aVariable = 3) // Unit === void
  println(aWeirdValue)

  // side effects: println(), whiles, reassigning

  //code blocks
  // code block is an expression
  // value of the last expression
  val aCodeBlock = {
    val y = 2
    val z = y + 1

    if (z > 2) "hello" else "goodbye"
  }

  println(aCodeBlock)

  // side effects ->  there are expressions returning units
  // 1. difference between String "hello world" vs println("hello world")?
  // ---> println is an expression side effects returning a unit, print to the console
  //  ----> String "hello world" is a value of type string

  //2. what is the value ----> true
  val someValue = {
    2 < 3
  }
  println(someValue);
  // 3. what is the value -----> 42
  val someOtherValue = {
    if (someValue) 239 else 986
    42
  }

  println(someOtherValue)

}
