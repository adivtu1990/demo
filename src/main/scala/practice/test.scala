package practice

/* Created By archi On 19/2/18 */
object test {
  def main(args: Array[String]): Unit = {
    val cases = args.map(_.toInt).toList

    grossSalary(cases).foreach(println)
  }
  def grossSalary(basicSalaryList: List[Int]): List[Double] = {

    basicSalaryList.map { bs =>
      if (bs < 1500) bs + bs * .1 + bs * .9
      else bs + 500 + .98 * bs
    }
  }
}