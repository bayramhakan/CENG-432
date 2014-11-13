class IyteMutableList{ 

var mutList Array[Int] = new Array[Int](0)

def add(vale: Int): IyteMutableList = {
    val atmp = Array(vale);
    mutList = Array.concat(mutableList, atmp); this;
  }
    override def toString: String = {
   
    var str = mutList(0).toString
   
      for (flagNum <- 1 until indexNum) {
        str += "," + mutList(flagNum)
  }
  
object IyteMutableList {
	  def apply = new IyteMutableList()
	}
