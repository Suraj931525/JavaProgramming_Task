//4.Train Ticket Eligibility 🚃

//Age greater than 5 → Free Ticket
//Age is between 5–18 → Child Ticket
//Age greater than 60 → Senior Citizen Discount
//Otherwise → Full Ticket



import java.util.*;
public class ticket{
public static void main(String[]args){

Scanner sc=new Scanner(System.in);
System.out.print("Enter your age:");
int age=sc.nextInt();

if(age<5){
System.out.println("free ticket");
}
else if(age>5&&age<18){
System.out.println("Child Ticket");
}
else if(age>60){
System.out.println("Senior citizen discount");
}
else{
System.out.println("Full ticket");
}
}
}