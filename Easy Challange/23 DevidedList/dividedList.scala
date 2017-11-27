/* Task 23 
 * Input: a list
 * Output: Return the two halves as different lists.
 * If the input list has an odd number, the middle item can go to any of the list.
 * Write the function that splits a list in two halves.
 */

object dividedList {
  def main(args: Array[String]): Unit = {
    
    println("Please enter the list you want to split")
    var input = scala.io.StdIn.readLine()
    val list = input.split(" ").toList.map(_.toInt)
    println(splitting(list))
    
    
  }
  
  def splitting(list1 : List[Int]) : (List[Int],List[Int]) = {
    val listSplit = list1.splitAt(list1.length / 2)
    return listSplit
  }
}