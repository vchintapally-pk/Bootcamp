object Higher extends App {

  def cube(x: Int): Int = x * x * x
  def square(x: Int): Int = x * x

  def sumof(f:Int => Int, x: Int, y: Int): Int = {
    def sumaccum(x: Int, y: Int, accum: Int): Int = {
      if (x > y) accum else sumaccum(x+1, y, accum+f(x))
    }
    sumaccum(x, y, 0)
  }
       println(sumof(square,1,3))
       println(sumof(cube,1,3))
}