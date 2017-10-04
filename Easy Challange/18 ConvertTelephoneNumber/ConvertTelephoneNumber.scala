/* Task 18 (easy)
 * Often times in commercials, phone numbers contain letters so that they're easy to remember (e.g. 1-800-VERIZON). 
 * Write a program that will convert a phone number that contains letters into a phone number with only numbers.
 */

object ConvertTelephoneNumber {

  def main(args: Array[String]): Unit = {
    
    println("Please enter the telephone number")
    var number = scala.io.StdIn.readLine().split("")

    for (i <- 0 until number.length) {
      number(i).toString match {
        case "A" | "B" | "C"       => number(i) = "2"
        case "D" | "E" | "F"       => number(i) = "3"
        case "G" | "H" | "I"       => number(i) = "4"
        case "J" | "K" | "L"       => number(i) = "5"
        case "M" | "N" | "O"       => number(i) = "6"
        case "P" | "Q" | "R" | "S" => number(i) = "7"
        case "T" | "U" | "V"       => number(i) = "8"
        case "W" | "X" | "Y" | "Z" => number(i) = "9"
        case _ => number(i)
      }
    }
    println("This is your number: " + number.mkString(""))
  }

}