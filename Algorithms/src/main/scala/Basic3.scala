/**
  * Created by slyuan on 17-3-16.
  */
class Basic3 {

}

class Student(name:String, age:Int, val major: String) extends Person(name,age) {
  println("this is the subclass of person, major is " + major)
  override val school = "BJX"
  override def toString = "override test ..." // 父类有的方法，之类要调用它，一定要加override
}

object Basic3 {

  def main(args: Array[String]): Unit = {
    val s = new Student("Justin",30,"Math")
    println(s.name + " ：　" + s.age + " : " + s.gender)
    println(s.toString)
  }

}
