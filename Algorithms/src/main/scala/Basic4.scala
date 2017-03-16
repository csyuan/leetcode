/**
  * Created by slyuan on 17-3-16.
  */
class Basic4 {

  //声明抽象方法不需要加abstract关键字，只需要不写方法体
  //
}

abstract class Person1 {
  def speak
  val name:String
  var age:Int
}

class Student1 extends Person1 {
  def speak {
    println("Speak ...")
  }
  val name = "AAA"
  var age = 100

}

//trait
//1.字段和行为的集合
//2.混入类中
//3.通过with,一个类可以继承多个特质
//4.特质从左到右被构造

//trait Logger {
//  def log(msg:String) {
//    println("log: " + msg)
//  }
//}

trait Logger {
  def log(msg : String)
}

//子特质重写方法
trait ConsoleLogger extends Logger{
  def log(msg : String) {
    println("save money : " + msg)
  }
}



//如果是第一混入的特质，要用extends(没有继承类)
class Test extends ConsoleLogger{
  def test {
    log("XXX")
  }
}
//如果是第一混入的特质，要用extends(没有继承类)
//class Test extends Logger{
//  def test {
//    log("XXX")
//  }
//}



trait MessageLogger extends ConsoleLogger {
  override def log(msg : String) {
    println("save money to bank " + msg)
  }
}

abstract class Account {
  def save
}

class MyAccount extends Account with ConsoleLogger {
  def save {
    log("100")
  }
}

object Basic4 extends App{
//  val s = new Student1
//  s.speak
//  println(s.name + ": " + s.age)
//
//  val t = new Test
//  t.test

//val acc = new MyAccount
  val acc = new MyAccount with MessageLogger //对象混入对象
  acc.save

}
