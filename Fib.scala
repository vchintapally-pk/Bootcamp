object Fib extends App{
  def fib( n : Int) : Int = {
    def fibrec( n: Int, a:Int, b:Int): Int = n match {
      case 0 => a
      case _ => fibrec( n-1, b, a+b )
    }
    return fibrec( n, 0, 1)
  }
}
