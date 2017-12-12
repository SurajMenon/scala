import scala.io.Source

object String {

  def main(args: Array[String]): Unit ={
    stringConcat("Hello","World")
  }



  //Scala Way to concat string
  def stringConcat(a:String , b:String): Unit = {
    println("\n" + "Testing string concat ....")
    println(s"${a.reverse} ${b.reverse}")
  }
}
