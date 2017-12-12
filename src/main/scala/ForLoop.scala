object ForLoop {

  // One of Scala for loops
  def forLoop(): Unit = {
    println("\n" + "Testing for loop ....")
    for(i <- 0 to 2)
      println("Hello")
  }

  def main(args: Array[String]): Unit ={
    forLoop()
  }
}
