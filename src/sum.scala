/**
  * Created by Ku on 2016-07-22.
  */
object sum extends App{
  case class ListNode[+T](h : T, t : ListNode[T]){
    def head : T = h
    def tail : ListNode[T] = t
    def prepend[U >: T](elem : U) : ListNode[U] =
      ListNode(elem, this)
    def next: ListNode[T] = {
     tail
    }
  }
  def loop(body : =>Unit): Unit = {
    try {
      while (true) {
        body
      }
    }catch{
      case a : NullPointerException =>
    }
  }
  var empty : ListNode[Null] = ListNode(null, null)
  var strList : ListNode[String] = empty.prepend("hello").prepend("world")
  var anyList : ListNode[Any] = strList.prepend(12345)

  loop{
    println(anyList.head)
    anyList = anyList next
  }
}