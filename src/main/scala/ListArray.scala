object ListArray {

  def listAndArray(): Unit ={
    println("\n" + "Testing list and arrays ....")
    //Create a list
    val list = 1::2::3::Nil

    //Create an Array
    val arr = Array(1,2,3)

    //Convert array to list & compare
    println(list == arr.toList)
  }

  def main(args: Array[String]): Unit ={
    listAndArray()
  }
}
