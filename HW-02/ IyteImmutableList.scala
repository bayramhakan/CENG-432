case class Cons(head: Int, tail: List) extends List
case object Nil extends List
sealed trait List {
  def add(x:Int): List = {
    def go(list: List, result: List): List = list match {
      case Nil => Cons(x,result)
      case Cons(h, t) => go(t, Cons(f(h), result))
    }
    go(this, Nil)
  }
}
object Main extends App {
  val list: List = Nil
  println(list.add(5))

}
