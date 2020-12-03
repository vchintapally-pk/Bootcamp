class Rat(x: Int, y: Int) {

  def this(x: Int) = this(x, 1)

  def num = x
  def den = y

  override def toString = num + "/" + den

  def + (that: Rat): Rat = {
    new Rat(num*that.den+that.num*den, den*that.den)

  }
}

object Rational extends App {

  val x = new Rat(1, 3)
  val y = new Rat(2, 3)

  println((x + y).toString)

  val z = new Rat(1, 9)
  val w = z + z
  println(w.num + "/" + w.den)

  val c = new Rat(5)
  println(c.toString)
}
