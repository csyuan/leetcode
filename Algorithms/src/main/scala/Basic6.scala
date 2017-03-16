/**
  * Created by slyuan on 17-3-16.
  */
class Basic6 {

}



object Basic6 extends App {
  val value = 2

  val result = value match {
    case 1 => "one"
    case 2 => "two"
    case _ => "some other num"
  }

//  println("result is " + result)

   val res = value match {
    case i if i == 1 => "one"
    case i if i == 2 => "two"
    case _ => "some other num"
  }

//  println("res is " + res)

  def t(obj : Any) = obj match {
    case x : Int => println("Int")
    case s : String => println("String")
    case _ => println("unknow")
  }
  t("2")




}
