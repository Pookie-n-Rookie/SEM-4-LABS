import java.util.*;
import java.io.*;


class Room{
int hei,wid,bre;
Room(int h,int w,int b){
this.hei=h;
this.wid=w;
this.bre=b;
}
int volume(){
int v=this.hei*this.wid*this.bre;
return v;
}

void disp(){
System.out.println("volume of the room is "+this.volume());
}

}

class RoomDemo{
public static void main(String args[]){
System.out.print("Enter the height,width and breadth of the room :");
Scanner myobj=new Scanner(System.in);
int h=myobj.nextInt();
int w=myobj.nextInt();
int b=myobj.nextInt();

Room obj=new Room(h,w,b);
obj.disp();
}
}

