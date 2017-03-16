/**
  * Created by slyuan on 17-3-16.
  */
class Basic2 {

}

//class Person {
//  var name : String = _  //var 生成getter和setter方法
//  val age : Int = 10 // val 只会生成getter方法
//  private [this] val gender = "male" //外部无法访问
//}

//1.参数直接跟在类名后面的是主构造器，主构造器中的参数，最后会编译成字段
//2.主构造器执行的时候，会执行类中的所有语句
//3.声明时候不带val，var，那么相当于private[this]

class Person(val name:String, val age:Int) {
  println("this is a primary constructor !")
  //主构造器会讲里面的方法都执行一遍
  var gender = "male"
  val school = "UESTC"

  //附属构造器，用this,并且第一行必须调用this
  //1.附属构造器名称为this
  //2.每个附属构造器必须首先调用已经存在的子构造器或者附属构造器
  def this(name:String, age:Int, gender : String) {
    this(name,age)
    this.gender = gender
  }

}

//class Person(name:String, val age:Int) {
//  println("this is a primary constructor !")
//  //主构造器会讲里面的方法都执行一遍
//  //外面调用p.name的时候报错，name不是成员变量
//}

//object 是单例
object Basic2 {

//  def main(args: Array[String]): Unit = {
//    val p = new Person
//    p.name = "Jack"
//    print(p.name + " : " + p.age)
//    println(p.gender)  //无法访问，默认的是public
//
//  }


  def main(args: Array[String]): Unit = {
    val p = new Person("Jack",20,"male")
    println(p.name + " : " + p.age + ": " + p.gender)
  }
}


