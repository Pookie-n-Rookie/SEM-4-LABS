import java.util.*;

class out{
  int a=2;
  static int s=5;

  int cal_sum(){
    return(a+s);
  }
}
class demo{
  public static void main(String arg[]){
      out o=new out();
      System.out.println(o.cal_sum());
      System.out.println("a ="+new out().a);
      System.out.println("a ="+new out().cal_sum());
      System.out.println("a="+o.a);
      System.out.println("s="+out.s);
      System.out.println("s="+o.s);
  }
}
// 7
// a =2
// a =7
// a=2
// s=5
// s=5