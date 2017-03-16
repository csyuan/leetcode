import scala.collection.mutable

/**
  * Created by Sl.Yuan on 2017/3/14.
  */

object WeekOne {

  def signum(num : Int) : Int = {
    if (num > 0) 1 else if (num < 0) -1 else 0
  }

  def printNum() : Unit = {
    for(i <- Range(10,-1,-1)) println(i)
  }

  def countDown(n:Int) : Unit = {
    for(i <- Range(n-1,-1,-1)) println(i)

  }

  def exchangeElem(array:Array[Int]) = {
    for(idx <- 0 until (if(array.length % 2 == 0) array.length else array.length -1 ,2) ){
      val tmp = array(idx)
      array(idx) = array(idx + 1)
      array(idx + 1) = tmp
    }
    array
  }


  def wordCount(content : String) : Map[String, Int] = {
    val countMap = scala.collection.mutable.Map[String,Int]()

    for(word <- content.split(" ")) {
      if (countMap.contains(word))  {
        countMap(word) = countMap(word) + 1
      } else {
        countMap += (word -> 1)
      }
    }

    countMap.toMap
  }

  def main(args: Array[String]): Unit = {
//    countDown(10)
    for(x <- exchangeElem(Array(2,3,4,5,6,7,8,9))) print(x + " ")

  }
}
