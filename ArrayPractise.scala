object ArrayPractise extends App {
  val arr1:Array[Int] = new Array[Int](5)
  arr1(0) = 5
  arr1(1)=6
  arr1(2)=4
  arr1(3)=6
  arr1(4)=9
  arr1(4)=10
  println(arr1(4))
  println(arr1) //[I@76273ca1
  for( x<- arr1)
  {
    println(x) //5,6,4,6,10
  }
  val arr2=Array(3,4,5,6,7)
  for( x<- 0 to arr2.length-1)
  {
    println(arr2(x)) //3,4,5,6,7
  }
}
