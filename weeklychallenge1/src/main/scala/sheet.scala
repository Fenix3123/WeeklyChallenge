object sheet extends App{
  def gap(arr:Array[Int]):Unit={
    var num = 0
    var num2 = 0
    for(i <- 0 to arr.length-1){
      for(j <- 0 to arr.length-1) {
        if(arr(i) == arr(j)){

        }else{
          if(arr(i) > arr(j)){
            num2 = arr(i) - arr(j)
            if(num2 > num){
              num = num2
            }
          }
          else{
            num2 = arr(j) - arr(i)
            if(num2 > num){
              num = num2
            }
          }
        }//end of else 1
      }//end of for loop 2
    }//end of for loop 1
    if(arr.length == 2){
      if(arr(0) > arr(1)){
        num = arr(0) - arr(1)
      }else{
        num = arr(1) - arr(0)
      }
    }//end of length 2
    println(num)
  }//end of method gap

  var z = Array(-3,-4,-5,6)
  gap(z)

  def subsum(arr:Array[Int]): Unit ={
    var num = 0
    var num2 = 0
    for(i <- 0 to arr.length-1){
      for(j <- 0 to arr.length-1) {
        num2 = arr.slice(i,j).sum
        if(num2 > num){
          num = num2
        }
      }
    }
    println(num)
  }//end of method
  var y = Array(-2, 1, -3, 4, -1, 2, 1, -5, 4)
  subsum(y)
}
