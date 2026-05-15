//3. Uber cab booking fare 🚗
//If distance < 5 km → ₹150
//Else if < 15 km → ₹300
//Else → ₹800
//Add:
//Night charges after 11 PM




import java.util.*;
public class booking
{
public static void main(String[]args){
System.out.println("Uber cab Booking");

Scanner sc=new Scanner(System.in);
System.out.println("Enter Distance to travel");
int distance=sc.nextInt();
System.out.println("Enter the booking hour (0 to 23)");
int hour=sc.nextInt();

int fare;


if (distance < 5){
 fare=150;
}
else if(distance < 15){
 fare=300;
}

else{
 fare=800;
}


if(hour > 23){
System.out.println("night charges apply");
fare=fare+100;
System.out.println("apply charges with extra night charges"+fare);
}
else {
System.out.println("apply charges"+fare);
}





}
}