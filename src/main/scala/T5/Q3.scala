package T5

object Q3 {
  def addition(num:Int): Int = {
    if(num<=0) {
      return 0;
    }else{
      val sum=num+addition(num-1);
      sum;
    }
  }
  def main(args:Array[String]): Unit = {
    print("Insert a Integer :");
    val num=scala.io.StdIn.readInt();
    val sum=addition(num);
    println("sum of 1 to "+num+" : "+sum);
  }
}
