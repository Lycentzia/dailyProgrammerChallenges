/* Task 4 (easy):
 * Create a random password generator!
 * Allow the user to specify the amount of passwords to generate. 
 * Allow the user to specify the length of the strings he wants to generate!
 */

import scala.util.Random

object passwordGenerator {
  
  def main(args: Array[String]): Unit = {
    println("Please enter how many different passwords you want to generate")
    var times = scala.io.StdIn.readLine().toInt
    
    println("Please enter how long the password(s) should be")
    var length = scala.io.StdIn.readLine().toInt
    
    for (i <- 1 to times) {
      var password = Random.alphanumeric.take(length).mkString
      println(password)      
    }

  }

}