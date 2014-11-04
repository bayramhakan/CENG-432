object Simple extends App (){
  
  val arrayNumbers = Array(10,25,30)
  arrayNumbers.foreach((i: Int) {
  
   if(i % 2 == 0) println(i * 2)
   else if(i % 2 == 1) println(i * 3)
  
   })
}
