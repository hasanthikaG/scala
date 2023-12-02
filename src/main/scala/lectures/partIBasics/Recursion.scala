package lectures.partIBasics

object Recursion extends App {
  def factorial(n: Int): Int =
    if (n <= 1) 1
    else n * factorial(n - 1)
} 
