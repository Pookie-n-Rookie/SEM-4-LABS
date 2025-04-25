import java.util.*;

// // Base interface with a default method
// interface B {
//   default void show() {
//     System.out.println("B1:SHOW");
//   }
// }

// // Two interfaces extending B
// interface C1 extends B { }
// interface C2 extends B { }

// // GC implements both C1 and C2
// class GC implements C1, C2 {
// }

// // Ensure the main method is inside a correctly named class
// class hybrid {
//   public static void main(String args[]) {
//     GC ob = new GC();
//     ob.show();
//   }
// }


class o{
  private String msg="HELLOOOOOOO";
  private void fun(){
    System.out.println("outer fun");
  }
  class i extends o{
    private void fun(){
      System.out.println("inner fun"+msg);
    }
  }
  public static void main(String[] args) {
    o ot=new o();
    i it=o.new.i();
    i.fun();
    o=i;
    o.fun();
  }
}