object Sumlist extends App {
  def Sumlist(ints: List[Int]): Int = {
    def sumAccumulator(ints: List[Int], accum: Int): Int =
      ints match {
        case Nil => accum
        case x :: tail => sumAccumulator(tail, accum + x)
      }

    sumAccumulator(ints, 0)
  }
  print(Sumlist(List(1, 2, 3, 4)))
}
