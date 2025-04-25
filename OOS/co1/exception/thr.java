import java.util.*;

class m{
  public static void main(String arg[]){
   try{

    try{
      throw new Exception("Error");
    }
    catch(Exception e){
      System.out.println(e);
    }
    finally{
    System.out.println("finally inner");
    throw new Exception("out of finally 1");
    }
  }
  catch(Exception e){
    System.out.println(e);
  }
  finally{
    System.out.println("finally outer");

  }
 
}
}