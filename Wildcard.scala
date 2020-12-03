
object Wildcard extends App {

  List(1, 2, 3).foreach(println(_))               //> 1
                                                  //| 2
                                                  //| 3

  List(1, 3, 5).foreach(a => println(a))          //> 1
                                                  //| 3
                                                  //| 5
  def mymatchFn(x: Int): String = x match {
    case 1 => "one"
    case 2 => "two"
    case _ => "other number"
  }

  println(mymatchFn(2))
  println(mymatchFn(1))
  println(mymatchFn(5))

  def f(x: Int): Unit = {
    println(x)
  }
  val z = f(5)
  val w = f  _
  val y = w(6)
}