import ForLoop.forLoop

object Tuples {

  def tuples(): Unit = {
    println("\n" + "Testing tuples ....")

    //Create tuples
    val tup1 = (1,"str",true)
    val tup2 = (2,"str2",false)

    //List of tuples
    val list = tup1 :: tup2 :: Nil

    //Access tuple element
    println(list(0)._1) // prints 1
    println(list(1)._3) // prints false
  }

  def main(args: Array[String]): Unit ={
    tuples()
  }
}
