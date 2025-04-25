import java.util.*;
import java.io.*;
import java.lang.reflect.*;

class myres implements AutoCloseable{
  BufferedReader br;
  BufferedWriter bw;

  myres() throws Exception{
    br=new BufferedReader(new FileReader("a.txt"));
    bw=new BufferedWriter(new FileWriter("b.txt"));
  }
  public void writeit()throws Exception{
    String st;
    while((st=br.readLine())!=null){
      bw.write(st);
      bw.newLine(); 
    }
  }

  public void close()throws Exception{
    br.close();
    bw.close();
    System.out.println("ending resources");
  }
}

class ans{
  public static void main(String[] args)throws Exception {
    try(myres r=new myres()){
      System.out.println("reading and writing the file");
      r.writeit();
    }

    
  }
}
