/* Task 20 (Easy)
 * Create a program that will find all prime numbers below 2000
 */

object primeNumbers {
  def main(args: Array[String]): Unit = {
    for (i <- 1 until 2000) {
      var prime = true
      for (j <- 2 until i-1) {
        if (i % j == 0) {
          prime = false
        }
      }
      if (prime == true) {
        println(i)
      }
    }
  }
}