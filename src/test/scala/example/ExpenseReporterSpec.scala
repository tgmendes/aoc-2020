package example

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.must.Matchers.convertToAnyMustWrapper

class ExpenseReporterSpec extends AnyFlatSpec {
  "get2020SumResult" should "get correct value" in {
    val report: List[Int] = List(1721, 979, 366, 299, 675, 1456)
    val result = ExpenseReporter.findMultiplier(report, 2020)

    result mustEqual 514579
  }
}
