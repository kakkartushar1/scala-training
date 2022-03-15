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

object Result {

  /*
   * Complete the 'timeConversion' function below.
   *
   * The function is expected to return a STRING.
   * The function accepts STRING s as parameter.
   */

  def timeConversion(s: String): String = {
    // Write your code here
    //    case class time(hh: String, mm: String, ss: String)
    var returntime = ""
    val tokens = s.split(":")
    val secs = tokens(2).substring(0, 2)
    if (tokens(2).substring(2).equals("PM")) {
      if (tokens(0).equals("12")) {
        returntime = tokens(0) + ":" + tokens(1) + ":" + secs
      } else {
        val newhh = tokens(0).toInt + 12
        returntime = newhh.toString + ":" + tokens(1) + ":" + secs
      }
    } else {
      if (tokens(0).equals("12")) {
        returntime = "00:" + tokens(1) + ":" + secs
      } else {
        returntime = tokens(0) + ":" + tokens(1) + ":" + secs
      }
    }
    returntime
  }

}

object Solution {
  def main(args: Array[String]) = {
    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

    val s = StdIn.readLine

    val result = Result.timeConversion(s)

    printWriter.println(result)

    printWriter.close()
  }
}
