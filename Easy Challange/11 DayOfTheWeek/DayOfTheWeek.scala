/* Task 11 (Easy)
 * The program should take three arguments. The first will be a year, the second will be month, and the third will be day. 
 * Then the program should compute the day of the week that date will fall on.
 * 
 * Extra: You can only type in validate days from year 1000 
 */

object DayOfTheWeek {
  def main(args: Array[String]): Unit = {
    println("Please enter the year")
    var year = enterYear()
    
    
    println("Plese enter the month (1 for Januar, 12 for December)")
    var month = enterMonth()
    
    println("Plese enter the day")
    var day = enterDay(month, year).toDouble

    if (month > 10) {
      year -= 1
    }
    
    var century = year.toString.slice(0, 2).toInt
    var yearEnding = year.toString.slice(2, 4).toInt

    var dayNumber = (day + Math.floor(month * 2.6 - 0.2) - 2 * century + yearEnding + Math.floor(yearEnding / 4) + Math.floor(century / 4)) % 7

    var dayName = dayNumber match {
      case 1 => "Monday"
      case 2 => "Tuesday"
      case 3 => "Wednesday"
      case 4 => "Thursday"
      case 5 => "Frieday"
      case 6 => "Saturday"
      case 0 => "Sunday"
    }

    println(dayName)
  }

  def enterYear(): Int = {
    var year = scala.io.StdIn.readLine().toInt
    if (year < 1000) {
      println("Please enter a year greater than thousand")
      enterYear()
    }
    return year
  }

  def enterMonth(): Int = {
    var month = scala.io.StdIn.readLine().toInt
    if (0 > month || month > 12) {
      println("Please enter a month between Januar (1) and December (12)")
      enterMonth()
    }
    return (month * 10) % 12
  }

  def enterDay(month: Int, year: Int): Int = {
    
    var day = scala.io.StdIn.readInt()
    month match {
      case 1 | 3 | 5 | 6 | 8 | 10 | 11 =>
        if (0 > day || day > 31) {
          println("Please enter a day between 1 and 31")
          enterDay(month, year)
        }
      case 2 | 4 | 7 | 9 =>
        if (0 > day || day > 30) {
          println("Please enter a day between 1 and 30")
          enterDay(month, year)
        }
      case 12 =>
        if (year % 4 == 0 && year % 10 != 0 || year % 400 == 0) {
          if (0 > day || day > 29) {
            println("Please enter a day between 1 and 29")
            enterDay(month, year)
          }
        } else {
          if (0 > day || day > 28) {
            println("Please enter a day between 1 and 28")
            enterDay(month, year)
          }
        }
    }
    return day
  }
}