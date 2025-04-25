import java.util.*;
import java.io.*;


class student{
String name;
int m1;
int m2;
int m3;

student(String n,int mm1,int mm2,int mm3){
this.name=n;
this.m1=mm1;
this.m2=mm2;
this.m3=mm3;
}

void  avg(){
double a=(this.m1+this.m2+this.m3)/3;
System.out.println("The average marks of three subjects is :"+ a);
}

void details(){
System.out.println("\n Details are :");
int total=this.m1+this.m2+this.m3;
System.out.println("NAME :"+this.name);
System.out.println("Total marks :"+total);
}
}

class Main{
public static void main(String args[]){
Scanner myobj=new Scanner(System.in);
System.out.println("enter the name and marks of 3 subjects");
String n=myobj.nextLine();
int mm1=myobj.nextInt();
int mm2=myobj.nextInt();
int mm3=myobj.nextInt();
student obj=new student(n,mm1,mm2,mm3);
obj.avg();
obj.details();
}
}
