import java.util.*;
import java.io.*;

class a{
  static void ans(String n){
    String arr[]=n.split(" ");
    int maxi=0;
    String ans="";
    for(String c:arr){
      if(c.equals(ans))maxi++;
      else if(c.length()>ans.length()){
        maxi=1;
        ans=c;
      }
    }
    System.out.println("longest word is "+ans+" and it occurs "+maxi);
  }
  public static void main(String[] args)throws Exception {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    String n=br.readLine();
    ans(n);
  }
}
