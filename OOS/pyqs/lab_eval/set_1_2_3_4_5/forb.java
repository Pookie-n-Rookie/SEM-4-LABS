import java.util.*;
import java.io.*;
import java.lang.reflect.*;

 class st{
 private final int b=1;
 private final void show(){
  System.out.println(b);
 } 
  }

  class a{
    public static void main(String[] args)throws Exception {
      st ob=new st();
      Class c=ob.getClass();
      Field b1=c.getDeclaredField("b");
      Method m1=c.getDeclaredMethod("show");
      m1.setAccessible(true);
      m1.invoke(ob);
      b1.setAccessible(true);
      b1.setInt(ob,100);
      System.out.println(b1.getInt(ob));
    }
  }

