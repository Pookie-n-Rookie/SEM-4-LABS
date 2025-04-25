import java.util.*;

class st {
  void change(char a[],String b){
    for(int i=0;i<a.length;i++){
      a[i]='a';
    }
    b+="JU";
  }
  public static void main(String args[]) {
    // String s1 = "Java";
    // String s2 = "JAvajaaaja";
    
    // System.out.println("compareTo Result: " + s2.compareTo(s1)); 
    // System.out.println("Equals Result: " + s2.equalsIgnoreCase(s1));
    // System.out.println("Cocnat Result: " + s1.concat(s1));
    // System.out.println("index Result: " + s2.indexOf("ja"));
    // System.out.println("starts with " + s2.startsWith("JA"));

    // char a[][]=new char[3][];
    // for(int r=0;r<a.length;r++){
    //   a[r]=new char[r+3];
    //   for(int c=0;c<r+3;c++){
    //     a[r][c]='*';
    //   }
    // }
    // for(int r=0;r<a.length;r++){
    //   for( int c=0;c<a[r].length;c++){
    //     System.out.println(a[r][c]+" ");
    //   }
    //   System.out.println('\n');
    // }


  //   char a[][] = new char[3][]; // Creating a 2D jagged array

  //   // Filling the 2D array with stars
  //   for (int r = 0; r < a.length; r++) {
  //     a[r] = new char[r + 3];  // Each row gets an increasing number of stars
  //     for (int c = 0; c < a[r].length; c++) {
  //       a[r][c] = '*';
  //     }
  //   }

  //   // Printing the 2D array as a triangle
  //   for (int r = 0; r < a.length; r++) {
  //     for (int c = 0; c < a[r].length; c++) {
  //       System.out.print(a[r][c] + " "); // Use print() instead of println()
  //     }
  //     System.out.println(); // Move to the next line after printing each row
  //   }
  // }
    st s=new st();
    char arr[]=new char[5];
    String str=new String("hi");
    String str1=new String("hi");
    str1+="JU";
    s.change(arr,str);
    for(int i=0;i<arr.length;i++){
      System.out.print(" "+arr[i]+" ");
    }
    System.out.println(str+ " "+str1);
    
}
}
