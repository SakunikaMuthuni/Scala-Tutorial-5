package T5

object Q5 {
  def isEven(num:Int): Boolean = {
    if(num==0){
      true;
    }else if(num==1){
      false;
    }else{
      isEven(num-2);
    }
  }
  def addition(num:Int): Int = {
    if(num>=0){
      if(isEven(num)){
        val sum=num+addition(num-1);
        sum;
      }else{
        addition(num-1);
      }
    }else{
      0
    }
  }
  def main(args:Array[String]): Unit = {
    print("Insert an Integer Nnumber :");
    val num=scala.io.StdIn.readInt();
    val sum=addition(num);
    println("Sum of 1 to "+ num+" even numbers :"+sum);
  }
}
