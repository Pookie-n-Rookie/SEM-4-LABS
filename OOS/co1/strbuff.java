import java.util.*;

class str{
public static void main(String arg[]) {
  // StringBuffer s1=new StringBuffer("BE IT OOS");
  // s1.ensureCapacity(30);
  // System.out.println("Capacity="+s1.capacity()+"lenght="+s1.length());
  // s1.append("2nd year");
  // System.out.println("Capacity="+s1.capacity()+"lenght="+s1.length()+" "+s1);
  // s1.insert(2,"2nd sem");
  // System.out.println("Capacity="+s1.capacity()+"lenght="+s1.length()+" "+s1);

  // s1.replace(5,8,"Java");
  // System.out.println("Capacity="+s1.capacity()+"lenght="+s1.length()+" "+s1);

//   Capacity=52 lenght=9
//   Capacity=52 lenght=17 BE IT OOS2nd year
//   Capacity=52 lenght=24 BE2nd sem IT OOS2nd year
//   Capacity=52 lenght=25 BE2ndJavam IT OOS2nd year
// }

StringBuffer s1=new StringBuffer();
s1.append("Information");
System.out.println(s1.capacity());
s1.ensureCapacity(40);
System.out.println(s1.capacity());


}
}
