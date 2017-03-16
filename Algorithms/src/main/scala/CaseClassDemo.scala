/**
  * Created by slyuan on 17-3-16.
  */
class CaseClassDemo {

}


//case class(多用在模式匹配中)
//构造器中每一个类型都为val，不建议用var
//不用new就可以直接产生对象（为什么？apply方法）

object CaseClassDemo extends App {

  def m(p :Person2) {
    p match {
      case Teacher(_) => println("This is Teacher")
      case Student2(_) => println("This is Student")
      case Teacher("AB") => println("this is Teacher AB ")
      case _ => println("Other Type")
    }
  }

  m(Teacher("A"))
}

abstract class Person2

case class Teacher(name:String) extends Person2
case class Student2(name:String) extends Person2
