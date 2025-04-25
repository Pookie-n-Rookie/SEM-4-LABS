package p1;
public class b extends a {
  public void f1(){
    super.f1();
    System.out.println("package a is interface calling from package b which implements a");
  }
  
}
