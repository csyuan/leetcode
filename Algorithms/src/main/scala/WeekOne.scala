/**
  * Created by Sl.Yuan on 2017/3/14.
  */
class WeekOne {

}

object WeekOne {

  def signum(num : Int) : Int = {
    if (num > 0) 1 else if (num < 0) -1 else 0
  }

  def printNum() : Unit = {
    for(i <- Range(10,-1,-1)) println(i)
  }

  def main(args: Array[String]): Unit = {
    printNum()
  }
}
