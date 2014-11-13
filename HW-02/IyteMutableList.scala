class IyteMutList {
  var mutList: Array[Int] = new Array[Int](0); 

  def add(val: Int): IyteMutList = {
   
  mutList = Array.concat(mutList, tArray); 
  }
  override def toString(): String = {
    
    if(num == 0) "";
   
    else  if (num < mutList.length) {
        str += ",";
      }
    }
    return str;
  }
}
object IyteMutList extends IyteMutList{
	  def apply = new IyteMutList()
	}
