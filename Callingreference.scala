// Example of Call by value and Call by name

object Callingreference extends App{
  // Square function
  def square (x: Int) = x * x


  def doubleIt(x: Int) = { x + x } // call by value
  def doubleItbyName(x: => Int) = { x + x } // call by name

  println(doubleIt(square(5))) // square function will be called only once
  print(doubleItbyName(square(5))) // square function will be called twice once for each x
}
