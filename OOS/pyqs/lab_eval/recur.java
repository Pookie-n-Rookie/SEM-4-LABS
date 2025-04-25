import java.util.*;

class st{
  static int maxi(int arr[],int maxi,int ind){
    if(ind>=arr.length)return maxi;
    if(maxi<arr[ind]){
      maxi=arr[ind];
    }
    return maxi(arr,maxi,ind+1);
  }
  public static void main(String[] args) {
    int arr[]={6,7,4,23,45};
    System.out.println(maxi(arr,-1,0));
  }
}