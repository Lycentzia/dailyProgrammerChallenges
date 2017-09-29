/* Task 13 (easy)
 * Find the number of the year for the given date. For example, January 1st would be 1, and December 31st is 365.
 * There should be also the possibility to calculate leap years.
 */

object coutingDays {
  
  def main(args: Array[String]): Unit = {
    println("Please enter the day of the date")
    var day = scala.io.StdIn.readInt()
    
    println("Please enter the month of the date")
    var month = scala.io.StdIn.readInt()
    
    println("Is this year a leap year? (y/n)")
    var leapYear = scala.io.StdIn.readLine()
    
    var possibleMonthDays = Array(31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)
    var days = day
    
    if (leapYear == "y" && month > 2) {
      days += 1
    }
    
    for (i : Int <- 0 until month-1) {
      days = days + possibleMonthDays(i)
    }
    println(days)
    
  }
}