import java.util.*;
import java.io.*;

class st{
  static String ans(int n){
    String a="";
    String b="";

    while(n>0){
      int j=n%16;
      if(j>=10){
        char c='A';
        c+=j%10;
        a+=c;
      }
      else a+=j;
      n/=16;
    }
    for(int i=a.length()-1;i>=0;i--)b+=a.charAt(i);
    return b;
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    System.out.println("hexa is "+ans(n));
  }
}