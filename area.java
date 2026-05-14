import java.util.*;
public class area{
public static void main(String[] args){
double a=3.14;
System.out.println("enter the radius of circle:");
Scanner sc=new Scanner(System.in);
int r=sc.nextInt();
double result=a*(r*r);
System.out.println("area of circle is the "+ result);
System.out.println("");
System.out.println("enter the width of rectangle:");
int width=sc.nextInt();
System.out.println("enter the length of rectangle:");
int length=sc.nextInt();

int area=width*length;
System.out.println("area of rectangle is the "+ area);


System.out.println("");

System.out.println("enter the breath of triangle:");
int breath=sc.nextInt();
System.out.println("enter the height of triangle:");
int heigth=sc.nextInt();

int c=(breath*heigth)/2;
System.out.println("area of triangle is the "+ c);



System.out.println("");


System.out.println("enter the size  of square side:");
int side=sc.nextInt();

int area1=side*side;
System.out.println("area of square is the "+ area1);





}
}

