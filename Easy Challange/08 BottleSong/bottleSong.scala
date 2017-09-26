/* Task 8:
 * Write a program that will print the song "99 bottles of beer on the wall".
 */

object bottleSong {

  def main(args: Array[String]): Unit = {
    for (i <- 99 to 0 by -1) {
      if (i > 1) {
        print(i + " bottles of beer on the wall, " + i + " bottles of beer. Take one down and pass it around,")
        if (i > 2) {
          println(i - 1 + " bottles of beer on the wall.")
        } else {
          println("1 bottle of beer on the wall.")
        }
      } else if (i == 1) {
        println("1 bottle of beer on the wall, 1 bottle of beer. Take one down and pass it around, no more bottles of beer on the wall.")
      } else {
        println("No more bottles of beer on the wall, no more bottles of beer. Go to the store and buy some more, 99 bottles of beer on the wall.")
      }
    }
  }

}