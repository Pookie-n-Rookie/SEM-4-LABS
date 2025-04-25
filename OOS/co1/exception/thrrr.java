import java.util.*;

class m{

void f(int a,int b) throws ArithmeticException{
  if(b==0)throw new ArithmeticException("error");
  else System.out.println(a/b);
}

public static void main(String args[]){
  int x=5,y=0;
  m ob=new m();
  try{
    ob.f(x,y);
  }
  catch(Exception e){
    System.out.println(e);
  }
  finally{
    System.out.println("its working");
  }
}
}