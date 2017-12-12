object MapTest {

  def map(): Unit = {
    println("\n" + "Testing map ....")
    //Create a map
    var map = Map.empty[Int, String]
    map += (1 -> "hello")
    map += (2 -> "world")

    //Access map & elemets
    println(map)
    println(map(2))

    //Update map
    map += (2 -> "new")
    println(map(2))

    //Another way to create a map
    val mapNew = Map(1 -> 2)
    println("New map is:" + mapNew)
  }

  def main(args: Array[String]): Unit ={
    map()
  }
}
