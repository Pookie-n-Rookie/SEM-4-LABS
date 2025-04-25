import java.util.*;
import java.io.*;


class a{
  static void ans(String n) throws Exception{
    String arr[]=n.split(" ");
    for(String c:arr){
      int n1=c.length();
      boolean t=true;
      for(int i=0;i<=c.length()/2;i++){
        if(c.charAt(i)!=c.charAt(n1-i-1)){
          t=false;
          break;
        }
      }
      if(t){
        System.out.println(c+" ");
        Thread.sleep(1000);
      }
      }
    }
  public static void main(String[] args)throws Exception {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    String n=br.readLine();
    ans(n);
  }
}
