package example

import scala.io.Source

object Application {
  def main(args: Array[String]): Unit = {
    val report = Source.fromResource("expense_report_1.txt").getLines.toList.map(_.toInt)
    println(ExpenseReporter.findMultiplier(report, 2020))
  }
}
