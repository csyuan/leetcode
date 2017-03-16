/**
  * Created by slyuan on 17-3-16.
  */
class WeekTwo {

}



//one
class BankAccount {


  private var account : Int = 0

  def deposit(money:Int){
    account += money
    println(s"...$account yuan in your account")
  }

  def withdraw(money:Int) ={
    assert(money <= account, "the money you withdraw should be less than account")
    account -= money
    println(s"...$account yuan in your account")
  }

  def balance = account
}

//two
class Person4(info:String) {
  val _name = info.split("\\s+")
  val firstName = _name(0)
  val lastName = _name(1)

  override def toString: String = s"first name $firstName , and last name $lastName"

}


////three
//class Point(val x:Int, val y:Int) {
//  override def toString = "Point x : " + x + ", y : " + y
//}
//
//object Point{
//  def apply(x: Int, y: Int): Point = new Point(x, y)
//}



final class point(val x: Int, val y: Int) {
  override def toString: String = s"(x,y) :($x,$y)"
}


//four
abstract class Shape {
  def centerPoint :point
  def className = this.getClass.getSimpleName

  override def toString: String = s"Shape=>$className, Center=>$centerPoint"

}

class Rectangle(val topLeft:point,val bottomRight:point) extends Shape {

  override def centerPoint = new point((bottomRight.x + topLeft.x) / 2, (bottomRight.y + topLeft.y) / 2)

}

class Circle(val centerPoint: point, val radius: Int) extends Shape

object WeekTwo extends App {
  val rect = new Rectangle(new point(0,0), new point(10, 10))
  println(rect)
}



