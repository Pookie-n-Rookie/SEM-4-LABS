import java.util.*;
import java.io.*;


class Complex{
  double real;
  double img;

  Complex(){
    this.real=0;
    img=0;
  }
  Complex(double r){
    real=r;
    img=0;
  }
  Complex(double r,double i){
    real=r;
    img=i;
  }
  Complex add(Complex q2){
    return new Complex(real+q2.real,img+q2.img);
  }
  Complex multiply(Complex q2){
    double nr=real*q2.real-(img*q2.img);
    double nimg=real*q2.img+(img*q2.real);
    return new Complex(nr,nimg);
  }
  void disp(){
    if (img >= 0) {
      System.out.println(real + " + " + img + "i");
  } else {
      System.out.println(real + " - " + Math.abs(img) + "i");
  }
  }


public static void main(String[] args) {

  Complex num1 = new Complex(3, 2);
  Complex num2 = new Complex(4,-2);

  
  System.out.print("First Complex Number: ");
  num1.disp();
  System.out.print("Second Complex Number: ");
  num2.disp();

  
  Complex sum = num1.add(num2);
  System.out.print("Sum: ");
  sum.disp();

  
  Complex product = num1.multiply(num2);
  System.out.print("Product: ");
  product.disp();
}

}