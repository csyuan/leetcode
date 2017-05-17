/**
  * Created by slyuan on 17-3-16.
  */
class Basic5 {

}

class ApplyTest {
  def apply() = "apply"
  def test {
    println("test")
  }

}

//本身就是个单例
object ApplyTest {
  def apply() = new ApplyTest

  var count = 0


  def static: Unit = {
    println("i'm a static method")
  }

  def incr = {
    count += 1
  }
}



object Basic5 extends App {
//  ApplyTest.static
//  val a = ApplyTest() //类名后面加括号(),表示调用了对象apply()方法, 99%都这样用
//  a.test

//  val t = new ApplyTest
//  println(t()) //对象加()调用的类的apply()方法
  for(i <- 1 to 10) {
    ApplyTest.incr
  }
  println(ApplyTest.count)

}

/**
  * 包，可以查看快学scala
  *     package com.chinahadoop {
  *       //-------------
  *       package spark {
  *       }
  *     }
  *
  * 重命名引入成员
  *   import java.util.{HashMap => JavaHashMap}
  *   HashMap => _
  *
  *    package aa.bb.cc.dd

  *    class XXX {
  *     private[dd] def assset = {} //只有在dd下面才能访问
  *    }
  *
  */

