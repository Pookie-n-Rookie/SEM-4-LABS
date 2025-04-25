import java.util.*;
import java.io.*;

class b{
  static int expo(int a,int b){
    if(b==0)return 1;
    return a*expo(a, b-1);
  }
  public static void main(String args[])throws Exception{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int  a=Integer.parseInt(br.readLine());
    int  b=Integer.parseInt(br.readLine());
    System.out.println(expo(a,b));
  }
}
