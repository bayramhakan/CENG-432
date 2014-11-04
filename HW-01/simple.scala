object Simple extends App (){
  
  val arrayNumbers = Array(10,25,30)
  arrayNumbers.foreach((i: Int) {
  if(i%2 == 0) 
  newNum=i*2
  println(newNum)
   else if(i%2 == 1) 
   newNum=i*3
   println(newNum)
  
   })
}
