package T5

object Q4 {
  def isEven(num:Int): Boolean = {
    if(num==0){
      true;
    }else if(num==1){
      false;
    }else{
      isEven(num-2);
    }
  }
  def checkTheNumber(num:Int): Unit = {
    if(isEven(num)){
      println(num +" is an even number");
    }else{
      println(num + " is an odd number");
    }
  }
  def main(args:Array[String]): Unit = {
    print("Insert an Integer :");
    val num=scala.io.StdIn.readInt();
    checkTheNumber(num);
  }
}
