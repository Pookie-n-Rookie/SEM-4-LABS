import java.util.*;
import java.io.*;


class res{
  boolean is_t=true;
   synchronized void printeven(int i)throws Exception{
    while(is_t)wait();
    System.out.print(i+" ");
    Thread.sleep(1000);
    is_t=!is_t;
    notify();
   }
   synchronized void printodd(int i)throws Exception{
    while(!is_t)wait();
    System.out.print(i+" ");
    Thread.sleep(1000);
    is_t=!is_t;
    notify();
   }
}
class even extends Thread{
  res t;
  even(res t){
    this.t=t;
    start();
  }
  public void run(){
    for(int i=2;i<=20;i+=2){
      try{
        t.printeven(i);
      }
      catch(Exception e){
        e.printStackTrace();
      }
    }
  }
}

class odd extends Thread{
  res t;
  odd(res t){
    this.t=t;
    start();
  }
  public void run(){
    for(int i=1;i<=19;i+=2){
      try{
        t.printodd(i);
      }
      catch(Exception e){
        e.printStackTrace();
      }
    }
  }
}

class ans{
  public static void main(String[] args) {
    res r=new res();
    odd t1=new odd(r);
    even t2=new even(r);

  }
}