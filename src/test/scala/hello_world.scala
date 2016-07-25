/**
  * Created by lg on 2016-07-25.
  */
class Stack[T]{
  var elems : List[T] = Nil
  def push(x : T) {elems = x :: elems}
  def top : T = elems.head
  def pop()  { elems = elems.tail}
}
object hello_world extends App{
  var st = new Stack[Int]
  st.push(10)
  st.push(20)
  println(st.top)
  println(st.top)
}
