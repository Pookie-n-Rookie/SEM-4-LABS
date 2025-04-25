import java.util.*;


class m{
  public static void main(String arg[]){
    String s="hello";
    try{
      char c=s.charAt(67);
    }
    catch(Exception e){
      System.out.println(e);
      // e.printStackTrace();
    }
    System.out.println("bahar");
  }
}