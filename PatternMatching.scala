object PatternMatching extends App {
  val a = 1
  a match {
    case 1 => println("One")
    case 2 => println("Two")
    case _ => println("No")
  }
}
