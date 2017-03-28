import scala.collection.{immutable, mutable}

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

  def mulBy(factor:Double) = (x:Double) => factor * x //也可以称为闭包
  val by3 = mulBy(3)
  println(by3(20))


  val list = List(1,2,3,4)
  list.map((x:Int) => x + 1)
  list.map((x) => x + 1)
  list.map(x => x + 1)
  list.map(_ + 1)


  //偏函数
  def addp(x:Int, y:Int, z:Int) : Int ={
    x + y + z
  }

  val partialFunction1 = addp(1,3,_:Int)
  partialFunction1(3)
  val partialFunction2 = addp(_:Int,3,_:Int)
  partialFunction2(1,3)

  //颗粒化
  def addk(x:Int, y:Int): Int = {
    x + y
  }

  def addK(x:Int)(y:Int): Int = {
    math.pow(x,y).toInt
  }


  //右边下划线不能省
  addK(1)_


  //------------------------
  val a = Array(1,2,3,4,5,6,7,8)
  a.map( 2 * _)
  a.filter(_ > 4)
  a.reduce((x:Int,y:Int) => x + y)
  a.reduce(_ + _)
  a.reduceLeft(_ + _)
  a.reduceRight(_ + _)

  a.fold(0)(_ - _)
  a.fold(100)(_ + _)

  //以下区别
//  def test(flag: Boolean): Unit = {
//    println(flag)
//  }
//
//  test( 3 > 1)

  //用到的时候才会去求值，以上会立马求值，延迟计算的过程
  def test(flag: => Boolean): Unit = {
    println(flag)
  }

  //丑陋的写法
  def fun(block:() => Unit): Unit = {
    block()
  }
  fun(() => println("XXX"))

//  def fun(block : => Unit): Unit = {
//    block
//  }
//  fun(println("XXX"))
//  fun{println("XXXX")}

  val s: Set[Int] = Set(1, 2, 3, 4)
  s + 6

//  val list = List(List(1,2),List(3,4),List(5,6))
//  list.flatten
//  list.flatMap(_.map(_ * 2)) //踩平
//  list.map(_.map( _ * 2))






}


