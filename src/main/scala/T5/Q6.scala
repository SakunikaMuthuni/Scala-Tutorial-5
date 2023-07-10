package T5

object Q6 {
  def printFibonacciSequence(num1:Int,num2:Int,num:Int): Unit = {
    if(num>0){
      print((num1+num2)+" ");
      printFibonacciSequence(num2,(num1+num2),num-1);
    }else{
      print(" ");
    }
  }

  def main(args:Array[String]): Unit = {
    print("Enter count of the number :");
    val num=scala.io.StdIn.readInt();
    val num1=0;
    val num2=1;
    print(num1+" "+num2+" ");
    printFibonacciSequence(num1,num2,num-2);
  }
}
