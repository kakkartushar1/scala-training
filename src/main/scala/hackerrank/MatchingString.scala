package hackerrank;

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

object ResultMatch {
  /*
   * Complete the 'matchingStrings' function below.
   *
   * The function is expected to return an INTEGER_ARRAY.
   * The function accepts following parameters:
   *  1. STRING_ARRAY strings
   *  2. STRING_ARRAY queries
   */

  def matchingStrings(strings: Array[String], queries: Array[String]): Array[Int] = {
    // Write your code here
    val result: Array[Int] = new Array[Int](queries.length)
    val count = new HashMap[String, Int]()
    for (str: String <- strings) {
      if (count.contains(str)) {
        val newcount: Int = count.get(str).get + 1
        count.put(str, newcount)
      } else {
        count.put(str, 1)
      }
    }
    for (i: Int <- 0 to (queries.length-1)) {
      println(queries(i))
      result.update(i, count.get(queries(i)).getOrElse(0))
    }
    result
  }
}

object SolutionMatch {
  def main(args: Array[String]): Unit = {

    val stringsCount = StdIn.readLine.trim.toInt

    val strings = Array.ofDim[String](stringsCount)

    for (i <- 0 until stringsCount) {
      val stringsItem = StdIn.readLine
      strings(i) = stringsItem
    }

    val queriesCount = StdIn.readLine.trim.toInt

    val queries = Array.ofDim[String](queriesCount)

    for (i <- 0 until queriesCount) {
      val queriesItem = StdIn.readLine
      queries(i) = queriesItem
    }

    val res = ResultMatch.matchingStrings(strings, queries)

    println(res.mkString("\n"))

  }
}

