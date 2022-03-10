package hackerrank

import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import scala.collection.immutable.*
import scala.collection.mutable.*
import scala.collection.concurrent.*
import scala.concurrent.*
import scala.io.*
import scala.math.*
import scala.math.Equiv.Double
import scala.sys.*
import scala.util.matching.*
import scala.reflect.*

object Result {

  /*
   * Complete the 'plusMinus' function below.
   *
   * The function accepts INTEGER_ARRAY arr as parameter.
   */

  def plusMinus(arr: Array[Int]): Unit = {
    // Write your code here
    val size: Double = arr.length
    var plus: Double = 0
    var minus: Double = 0
    var zero: Double = 0
    for (ele: Int <- arr) {
      if (ele > 0) {
        plus = plus + 1
      } else if (ele < 0) {
        minus = minus + 1
      } else zero = zero + 1
    }

    println(plus / size)
    println(minus / size)
    println(zero / size)
  }

}

object Solution {
  def main(args: Array[String]): Unit = {
    val n = StdIn.readLine.trim.toInt

    val arr = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)

    Result.plusMinus(arr)
  }
}
