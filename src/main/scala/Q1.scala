object Q1 {
  def gcd(a: Int, b: Int): Int = {
    b match {
      case 0 => a
      case x if x > a => gcd(x, a)
      case _ => gcd(b, a % b)
    }
  }

  def prime(p: Int, n: Int =2): Boolean = {
    if (p <= 1) {
      return false
    }
    n match {
      case x if (x == p) => true
      case x if gcd(p,x)>1 =>false
      case x => prime(p, x+1)
    }
  }
  def main(args: Array[String]): Unit = {
    println(prime(1))
    println(prime(2))
    println(prime(3))
    println(prime(4))
  }
}