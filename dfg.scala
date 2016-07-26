import scala.collection.mutable

/**
  * Created by lg on 2016-07-23.
  */
object dfg{
  abstract class AbsIterator {
    type T

    def hasNext: Boolean

    def next: T
  }
  trait RichIterator extends AbsIterator{
    def foreach(f : T=>Unit): Unit ={
      while(hasNext)
        f(next)
    }
  }
  class StringIteraotr(s : String) extends AbsIterator{
    type T = Char
    private var i = 0
    def hasNext = i < s.length
    def next = { val ch  = s charAt i; i += 1; ch}
  }
  def main(args:Array[String]): Unit ={
    class Iter extends StringIteraotr(args(0)) with RichIterator
    val iter = new Iter
    iter foreach println
  }
}
