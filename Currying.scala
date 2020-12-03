object Currying extends App{

 // Currying is a  technique of transforming a function that takes multiple arguments into a function that takes a single argument

  // regular function
  def add1(x: Int, y: Int) = x + y
  //Currying
  def add2(x: Int)(y: Int) = x + y

  println(add1(10,20)) // 30
  println(add2(10)(_)) // Currying$$$Lambda$19/0x0000000800c11be0@6aaa5eb0

  val r=add2(2)_
  println(r(10))       // 12

}
