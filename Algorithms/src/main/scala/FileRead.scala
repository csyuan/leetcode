/**
  * Created by slyuan on 17-3-16.
  */
import scala.io.Source

class FileRead {
  val file = Source.fromFile("path")
  for(line <- file.getLines()) {
    println(line)
  }

//
//  for(byte <- file) {
//    println(byte) //字节
//  }
}
