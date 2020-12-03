import javax.swing.event.DocumentEvent
// Variable types/ Data types

val x = "Vishal"
val y=x
val z:Float= 10
val z:String="Hello world"
lazy val k=24.9f
print(k)
identity(k)
var a=true //
a=false
print(a)
y.toUpperCase()
"foo".drop(1)
"foo".take(1)
"bar".take(2)
(0 to 10).contains(10)
0.to(12).contains(10)

object Fib extends App{
  def fib( n : Int) : Int = {
    def fibrec( n: Int, a:Int, b:Int): Int = n match {
      case 0 => a
      case _ => fibrec( n-1, b, a+b )
    }
    return fibrec( n, 0, 1)
  }
}

object session{
  1+3
  def abs(x:Double)=if (x<0) -x else x
  def sqrtIter(guess:Double, x:Double): Double=
    if(isGoodEnough(guess,x)) guess else sqrtIter(improve(guess,x),x)
  def isGoodEnough(d: Double, d1: Double)=abs(guess * guess - x) <0.001
  def improve(d: Double, d1: Double)= (guess + x / guess)/2
  def sqrt(x:Double)=sqrtIter(1.0,x)
}


