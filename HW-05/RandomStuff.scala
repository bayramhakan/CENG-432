import scala.util.control._
trait RandomStuffTrait {
  def transform(list: List[Int], op: (Int) => Int): List[Int];
  def allValid(list: List[Int], op: (Int) => Boolean): Boolean;
  def executeWithRetry(retryCount: Int, op: => Int): Option[Int];
}

object RandomStuff extends RandomStuffTrait {

  override def transform(list: List[Int], op: (Int) => Int): List[Int] = {
    var transformedList: List[Int] = Nil;
    for (x <- list) {
      transformedList = transformedList :+ op(x);
    }
    return transformedList;
  }

  override def allValid(list: List[Int], op: (Int) => Boolean): Boolean = {
    val loop = new Breaks;
    loop.breakable { 
      for( a <- list if(!op(a))){ 
    	  return false;
    	  loop.break();
      }
    }
    true;
  }

  def executeWithRetry(retryCount: Int, op: => Int): Option[Int] = {
    var retVal: Option[Int] = None;
    for (i <- 1 to retryCount) {
      try {
        retVal = Option(op);
      } catch {
        case ex: Exception => { //empty exception
        }
      }
    }
    return retVal;
  }
}
