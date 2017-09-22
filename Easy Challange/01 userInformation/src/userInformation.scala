/* Task1:
 * Create a program that will ask the users name, age, and reddit username. 
 * Have it tell them the information back, in the format:
 * 		your name is (blank), you are (blank) years old, and your username is (blank)
 * for extra credit, have the program log this information in a file to be accessed later.*/

import scala.io.StdIn
object userInformation {
  
  def main(args: Array[String]) : Unit = {
    
    println("Please enter your name")
    var name = scala.io.StdIn.readLine()
    println("Please enter your age")
    var age = scala.io.StdIn.readLine()
    println("Please enter your username")
    var username = scala.io.StdIn.readLine()
    
    var text = "Your name is " + name + ", you are " + age + " years old, and your username is " + username
    println(text)
    
    var outputFile = new java.io.FileWriter("output.txt")
    outputFile.write(text)
    outputFile.close()
  }
}