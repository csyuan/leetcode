/**
  * Created by slyuan on 17-3-28.
  */

object WeekThree extends App {


  //one
  var assertionsEnabled = true
  def myAssert(predicate: => Boolean) = {
    if(assertionsEnabled && !predicate)
      throw new AssertionError
  }

  //two
  def doFactorial(n:Int):Long = {
    assert(n > 1,"n must be large than 1 !")
//    1 to n reduceLeft(_ * _) toLong
    1.to(n).reduceLeft(_ * _).toLong
  }

  //three
  val array = Array(1,2,3,4,5,6,7,8,9)
  val f = (x:Int, y:Int) => x max y
//  println(array.reduceLeft(f))
//  array.reduceLeft(_ min _)
//  array.reduceLeft(_ max _)
//  array.reduceLeft((x:Int,y:Int) => if(x > y) x else y)
  println(array.reduceLeft((x,y) => if(x >= y) x else y))
  println(array.reduceRight((y,x) => if(x >= y) x else y))

  //four
  def mat(list : List[Int]){
    list match {
      case (List(1,_*)) => println("beginning with 1")
      case (List(_,2,_)) => println("contains 2")
      case (List(_,3)) => println("end with 3")
      case _ => println("not match")
    }
  }

  //five
  def _find(list : List[Int])(block : List[Int] => List[Int]) : List[Int] = block(list)

  def find = _find(List(1,2,3,4,5,6,7,8))_

  find(xs => xs.filter(_ != 0).filter(_ % 2 == 0))
  find(xs => xs.filter(_ > 2))
  find(xs => xs.map(2 * _))

  val list = List(1,2,3,4,5,6,7,-9,-10)
  list.filter(_ > 0).filter( _ % 2 == 0)


}