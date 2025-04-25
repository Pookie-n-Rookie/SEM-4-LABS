import java.io.*;
import java.util.*;

// class d{
//   public static void main(String arg[]) throws Exception{
//     FileInputStream f=null;
//     FileOutputStream f1=null;
//     int nxt;
//     try{
//       f=new FileInputStream("a.txt");
//       f1=new FileOutputStream("b.txt");
//       while((nxt=f.read())!=-1){
//         f1.write((char)nxt);
//       }
//     }
//     finally{
//       try{
//         f.close();
//       }
//       finally{

//       }
//     }

//   }
// }
// class d{
//   public static void main(String arg[]) throws Exception{
//     BufferedReader br=null;
//     int nxt;
//     try{
//       br=new BufferedReader(new InputStreamReader(System.in));
//       String str=br.readLine();
//       System.out.println("the string is ="+str);
//     }
//     finally{
//       try{
//         br.close();
//       }
//       finally{

//       }
//     }

//   }
// }
class d{
  public static void main(String arg[]) throws Exception{
    InputStreamReader st=new InputStreamReader(System.in);
    BufferedReader br= new BufferedReader(st);
    System.out.println("enter roll");
    int r=Integer.parseInt(br.readLine());
    System.out.println("Enter name");
    String name=br.readLine();
    System.out.println("name ="+name+" roll="+r);


  }
}