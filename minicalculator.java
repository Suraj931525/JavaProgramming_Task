import java.util.*;
public class minicalculator{
public static void main(String []args){

System.out.print("enter value a:");
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
System.out.print("enter value b:");
int b=sc.nextInt();
System.out.print("enter value c:");
int c=sc.nextInt();
int d=a+b;
int e=a+c;
int f=b+c;
System.out.println("Addition a+b :"+ d);
System.out.println("Addition a+c :"+ e);
System.out.println("Addition b+c :"+ f);



int g=a-b;
int h=a-c;
int i=b-c;
System.out.println("substraction a-b :"+ g);
System.out.println("substraction a-c :"+ h);
System.out.println("substraction b-c :"+ i);



int j=a*b;
int k=a*c;
int l=b*c;
System.out.println("mutiplication a*b :"+ j);
System.out.println("mutiplication a*c :"+ k);
System.out.println("mutiplication b*c :"+ l);

int m=a/b;
int n=a/c;
int o=b/c;
System.out.println("division a/b :"+ m);
System.out.println("division a/c :"+ n);
System.out.println("division b/c :"+ o);

}
}
