/*Task 16 (easy)
 * Write a function that takes two strings and removes from the first string any character that appears in the second string.
 */

object ReplaceChars {
  
  def main(args: Array[String]): Unit = {
    println("Please enter the string you want delete from")
    var str = scala.io.StdIn.readLine()
    
    println("Please enter the char(s) your want to delete")
    var str2 = scala.io.StdIn.readLine()
    
    
    for(i <- 0 until str2.length) {
      str = str2.charAt(i).toString.r.replaceAllIn(str, "")
    }
      
    println(str)
  }
  
}