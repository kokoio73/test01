/**
  * Created by Ku on 2016-07-22.
  */
object sum extends App{
  trait Buffer{
    type T
    val element : T
  }
  abstract class SeqBuffer extends Buffer{
    type U
    type T <: Seq[U]
    def length = element.length
  }

  abstract class IntSeqBuffer extends SeqBuffer{
    type U = Int
  }
  def newIntSeqBuf(elem1 : Int, elem2 : Int) : IntSeqBuffer = new IntSeqBuffer{
    type T = List[U]
    val element = List(elem1, elem2)
  }
var shot : Short = 4231
  val buf = newIntSeqBuf(shot, 'a')
  println(buf.element)
}

