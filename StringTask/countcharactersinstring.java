//Create a program to count total characters in a string


import java.util.*;
public class countcharactersinstring
{
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter the String");
 char str[] = sc.next().toCharArray();
int count=0;
for(int i=0;i<str.length;i++){
count++;
}
System.out.println("the count of string is:"+count);
}
}


