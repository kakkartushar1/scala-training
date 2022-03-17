package hackerrank

import java.io._
import java.math._
import java.security._
import java.text._
import java.util.concurrent._
import java.util.function._
import java.util.regex._
import java.util.stream._
import scala.collection.mutable._
import scala.collection.concurrent._
import scala.concurrent._
import scala.io._
import scala.math._
import scala.sys._
import scala.util.matching._
import scala.reflect._

object ResultLI {

  /*
   * Complete the 'lonelyinteger' function below.
   *
   * The function is expected to return an INTEGER.
   * The function accepts INTEGER_ARRAY a as parameter.
   */

  def lonelyinteger(a: Array[Int]): Int = {
    // Write your code here
    val count = new HashMap[Int, Int]()
    var out = -1
    for(i:Int <- a) {
      if (count.contains(i)) {
        val newcount: Int = count.get(i).get + 1
        count.put(i, newcount)
      } else {
        count.put(i, 1)
      }
    }
    count.foreachEntry((k,v) => if(v.equals(1)){
      out = k
    })
    out
  }

}

object SolutionLI {
  def main(args: Array[String]) = {

    val n = StdIn.readLine.trim.toInt

    val a = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)

    val result = ResultLI.lonelyinteger(a)

    println(result)
  }
}
