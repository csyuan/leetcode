/**
  * Created by hadoop on 17-3-27.
  */
class Basic7 {

}

object Basic7 extends App{
  //值函数
  def add(x:Int, y:Int) = x + y
  //值函数，add _
  val _add = add _

  println(_add(1,2))

  //def 嵌套def
  def add3(x:Int, y:Int, z:Int) : Int = {
    def add2(x:Int, y:Int): Int = {
      x + y
    }
    add2(add2(x,y),z)
  }
  println(add3(1,2,3))

  //匿名函数
  (x:Int) => x + 2

  val fun = (x:Int) => x + 2
  fun(10)
  println(fun(10))

  val l = List(1,2,3,4)
  l.map((x:Int) => 2 * x)
  l.map(2 * _)

  //放函数
  def aa = (x:Int) => 2 * x
  val ab = (x:Int) => 2 * x
  l.map(aa)

  //一个接收函数的函数称为高阶函数
  def function(f: (Int, Int) => Int) : Int = f(1,2)
  function((x:Int,y:Int) => x+y)
  function((x:Int,y:Int) => x-y)

  def mulBy(factor:Double) = (x:Double) => factor * x
  val by3 = mulBy(3)
  println(by3(20))




}
