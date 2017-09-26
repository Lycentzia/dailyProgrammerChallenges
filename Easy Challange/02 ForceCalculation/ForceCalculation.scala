/* Task 2 (Easy):
 * Create a program that helps you to calculate the force you need to move a object.
 * The formula is: F = M * A.
 * It should be also possible to calculate the other elements of the formula.
 */

object ForceCalculation {

  def main(args: Array[String]): Unit = {
    var solution = 0.0
    var run = true
    
    println("Welcome to this force calculator")
    
    while (run) {
      var selection = enterScreen()
      
      if (selection == "1") {
        solution = calculateForce()
        println("The Force is: " + solution)
      } else if (selection == "2") {
        solution = calculateMass()
        println("The Mass is: " + solution)
      } else if (selection == "3") {
        solution = calculateAcc()
        println("The Acceleration is: " + solution)
      } else if (selection == "4") {
        println("Good Bye")
        run = false
      } else {
        println("Please enter a valid number")
      }
    }
    
    def enterScreen() : String = {
      println("")
      println("If you want to calculate the FORCE then enter 1")
      println("If you want to calculate the MASS then enter 2")
      println("If you want to calculate the ACCELERATION then enter 3")
      println("If you want to stop the calculator then enter 4")
      return scala.io.StdIn.readLine();
    }
    
    def calculateForce() : Float = {
      var M = enterMass()
      var A = enterAcc()
      return M * A
    }
    
    def calculateMass() : Float = {
      var F = enterForce()
      var A = enterAcc()
      return F / A
    }
    
    def calculateAcc() : Float = {
      var F = enterForce()
      var M = enterMass()
      return F / M
    }
    
    def enterMass() : Float = {
      println("Please enter the Mass")
      return scala.io.StdIn.readLine.toFloat
    }
    
    def enterAcc() : Float = {
      println("Please enter the Acceleration")
      return scala.io.StdIn.readLine().toFloat
    }
    
    def enterForce() : Float = {
      println("Please enter the Force")
      return scala.io.StdIn.readLine.toFloat
    }

  }

}