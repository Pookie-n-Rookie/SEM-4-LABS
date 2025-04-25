class st {
  public int sum(int x,int y){
    return(x+y);
  }
  public double sum(double x,int y){
    return (x+y);
  }
  public double sum(int x, double y){
    return (x+y);
  }
  public static void main(String arg[]){
    st ob= new st();
    System.out.println(ob.sum(10,20));
    System.out.println(ob.sum(10.5,20));
    System.out.println(ob.sum(10,20.5));
}
  
}
