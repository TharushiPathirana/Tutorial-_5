object Q5 {
  def evenSum(n: Int): Int = {
    n match {
      case x if(x < 2) => 0
      case x if(x%2==0) => n + evenSum(n-2)
      case _ => evenSum(n-1)
    }
  }
  def main(args: Array[String]): Unit = {
      println(evenSum(5))
  }
}