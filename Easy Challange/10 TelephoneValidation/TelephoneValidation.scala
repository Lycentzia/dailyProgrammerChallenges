/* Task 10 (easy)
 * Create a program that helps you to validate a telephone number, as if written on an input form. 
 * Telephone numbers can be written as ten digits, or with dashes, spaces, or dots between the three segments, 
 * or with the area code parenthesized; both the area code and any white space between segments are optional.
 * Examples for valid telephone numbers: 
 * 		1234567890, 123-456-7890, 123.456.7890, (123)456-7890, (123) 456-7890 and 456-7890.
 * Examples for not valid telephone numbers:
 *  	123-45-6789, 123:4567890, and 123/456-7890.
 */

import scala.util.matching.Regex

object TelephoneValidation {
  def main(args: Array[String]) : Unit = {
    
    var pattern = new Regex("(\\([0-9]{3}\\)|[0-9]{3})?(-|\\.)?\\s?[0-9]{3}(-|\\.)?\\s?[0-9]{4}")
    
    println("Please enter your telephone number")
    var telephonInput = scala.io.StdIn.readLine()
    
    if (telephonInput.matches(pattern.toString)) {
      println("The number is valide")
    } else {
      println("The number is not valide")
    }
  }
}