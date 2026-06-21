import java.util.*;
public class task5{
public static void main(String[]args){

Scanner sc=new Scanner(System.in);
System.out.println("Enter the String");
String name=sc.nextLine();
System.out.println("before removing number :"+name);

String newname=name.replaceAll("[0-9]","");

System.out.println("After removing number :"+newname);

}
}

