package T5

object Q2 {
  def isPrime(num: Int, index: Int = 2): Boolean = {
    if(num<2){
      false;
    }else if(index<=1){
      true;
    }else if(num%index==0){
      false;
    }else{
      isPrime(num,index-1);
    }
  }

  def printPrime(num: Int): Unit = {
    if(num>=2){
      printPrime(num-1);
      if (isPrime(num, scala.math.sqrt(num).toInt)) {
        print(num + " ")
      }
    }
  }

  def main(args: Array[String]): Unit = {
    print("Insert an Integer: ")
    val num = scala.io.StdIn.readInt()
    printPrime(num)
  }
}


