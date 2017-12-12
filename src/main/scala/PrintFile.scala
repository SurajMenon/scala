
import scala.io.Source

object PrintFile {

  //Read and print file line by line
  def printFile(): Unit ={
    for(i <- Source.fromFile("/log/logmon/api-proxy.log").getLines()){
      println(i);
    }
  }

  def main(args: Array[String]): Unit ={
    printFile()
  }
}
