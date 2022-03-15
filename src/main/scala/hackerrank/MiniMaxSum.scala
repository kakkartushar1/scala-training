package hackerrank

import java.io._
import java.math._
import java.security._
import java.text._
import java.util._
import java.util.concurrent._
import java.util.function._
import java.util.regex._
import java.util.stream._
import scala.collection.immutable._
import scala.collection.mutable._
import scala.collection.concurrent._
import scala.concurrent._
import scala.io._
import scala.math._
import scala.sys._
import scala.util.matching._
import scala.reflect._

object ResultSum {

  /*
   * Complete the 'miniMaxSum' function below.
   *
   * The function accepts INTEGER_ARRAY arr as parameter.
   */

  def miniMaxSum(arr: Array[Int]): Unit = {
    // Write your code here
    val sorted = arr.sortWith(_ < _)

    var mini = 0
    var max= 0
    for(i <- 0 to (sorted.length-2)){
      mini += sorted(i)
    }
    for (i <- 1 to (sorted.length-1)){
      max += sorted(i)
    }
    println(mini + " "+ max)
  }

}

object SolutionSum {
  def main(args: Array[String]): Unit = {

    val arr = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)

    ResultSum.miniMaxSum(arr)
  }
}

