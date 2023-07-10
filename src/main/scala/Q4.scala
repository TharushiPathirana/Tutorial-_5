object Q4 {
  def isEven(n : Int): Boolean ={
    n match {
      case 0 => true
      case _ => !isEven(n-1)
    }
  }
  def main(args: Array[String]): Unit = {
    if(isEven(10)) println("Even")
    else println("Odd")
  }
}