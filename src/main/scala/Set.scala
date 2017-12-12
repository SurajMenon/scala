object SetTest {

  def set(): Unit = {
    println("\n" + "Testing set ....")

    //Create set
    var mySet = Set("first","second")

    //Add to set
    mySet +="third"
    mySet = mySet + "fourth"

    println(mySet)


    val myFinalSet = Set("im","mutable")// immutalbe set as using val
    //val result: Nothing = myFinaSet // Should throw compilation error but gives type of myFinal as immutale set
    //myFinaSet = myFinaSet + "test" // should fail as it is an immutable set.

  }

  def main(args: Array[String]): Unit ={
    set()
  }
}
