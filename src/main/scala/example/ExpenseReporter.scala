package example

object ExpenseReporter {
  def findMultiplier(report: List[Int], target: Int): Int = {
    var result = 0
    report.foreach(entry => {
      report.find(x => (x + entry) == target) match {
        case Some(i) => result = i * entry
        case _ =>
      }
    })
    result
  }
}

