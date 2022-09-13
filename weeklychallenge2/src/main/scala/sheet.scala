import scala.collection.mutable.ListBuffer

object sheet extends App{
  def order(arr: Array[Int], order: String): Unit ={
    val strArr = arr.map(_.toString)
    val strNew = new ListBuffer[String]()
    if(order == "asc") {
      for(word <- strArr){
        strNew += word.sorted
      }
    }else if(order == "desc"){
      for(word <- strArr){
        strNew += word.sorted.reverse
      }
    }
    println(strNew.mkString(","))
  }//end of method ascii

  var z = Array(515, 341, 98, 44, 211)
  //order(z, "desc")

  def canPartition(arr: Array[Int]): Boolean ={
    for(i <- 0 to arr.length-1) {
      var prd = 1;
      for(j <- 0 to arr.length-1) {
        if (j == i) {
        } else {
          prd *= arr(j)
        }
      }
      if (prd == arr(i)) return true;
    }
    return false;
  }//end of method
  var y = Array(-1, -10, 1, -2, 20)
  println(canPartition(y))
}
