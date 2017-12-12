object MultiForLoop {

  def splitMultiString(str :List[String]): List[String] ={
    val mySplit = for {
      s<-str
      if(s.contains(";"))
      x <- s.split(";").toList //Note: don't need to define x as a val
      y <- x.split(",")
    } yield (y)
    mySplit
  }

  def main(args:Array[String]): Unit = {
    val str = List("abc,def,geh;hig,jkg,jjj", "hjd,jfo,kth;hjd,jfo,kth")
    val mySplit = splitMultiString(str)
    print(mySplit)

    val myList = List(1, 2, 3, 4, 5, -1, -3, -5, 0)
    // Use of filter
    println("\n"+myList.filter(x => x > 0)) //Anonymous function's
    println(myList.filter(_ < 0)) //Placeholder

  }
}
