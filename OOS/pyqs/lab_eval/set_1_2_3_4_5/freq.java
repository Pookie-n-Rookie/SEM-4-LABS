import java.util.*;
import java.io.*;

class st{
  static void freq( int arr[]){
    int n=arr.length;
    for(int i=0;i<n-1;i++){
      for(int j=i+1;j<n;j++){
        if(arr[i]>arr[j]){
          int temp=arr[i];
          arr[i]=arr[j];
          arr[j]=temp;
        }
      }
    }
    int prev=arr[0];
    int cnt=1;
    for(int i=1;i<n-1;i++){
      if(prev==arr[i])cnt++;
      else{
        System.out.println(prev+"-->"+cnt);
        prev=arr[i];
        cnt=1;
      }
    }
    System.out.println(prev+"-->"+cnt);
 
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    freq(arr);
  }
}