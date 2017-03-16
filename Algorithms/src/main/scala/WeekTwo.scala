/**
  * Created by slyuan on 17-3-16.
  */
class WeekTwo {

}

object WeekTwo extends App {
  val p = Point(3,4)
  println(p.toString)
  println(p.x + p.y)
}


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

class Person4(info:String) {
  val _name = info.split("\\s+")
  val firstName = _name(0)
  val lastName = _name(1)

  override def toString: String = s"first name $firstName , and last name $lastName"

}



class Point(val x:Int, val y:Int) {
  override def toString = "Point x : " + x + ", y : " + y
}

object Point{
  def apply(x: Int, y: Int): Point = new Point(x, y)
}

