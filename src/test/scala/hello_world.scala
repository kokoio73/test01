/**
  * Created by lg on 2016-07-25.
  */
object hello_world extends App{
  class MyBool(x : Boolean){
    def and(that : MyBool) : MyBool = if(x) that else this
    def or(that : MyBool) : MyBool = if(x) this else that
    def negate : MyBool = new MyBool(!x)
    def not(x : MyBool) = x negate
    def xor(x : MyBool, y : MyBool) = (x or y) and not(x and y)
    override def toString : String = x.toString
  }
  var x = new MyBool(true)
  var y = new MyBool(false)
  println(x and x not y)

}
