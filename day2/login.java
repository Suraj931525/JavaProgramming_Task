//2.Instagram Login Verification 📱

import java.util.*;
public class login{
public static void main(String[]args){
	String username="Suraj";
	int password=12345;
	
	System.out.println("enter userid");
	Scanner sc=new Scanner(System.in);
	String userid=sc.next();
	
	System.out.println("enter password");
	int password1=sc.nextInt();
	


	if(userid==username||password==password1){
	System.out.println("Verification successful");
	}
        else{
	System.out.println("verification failed");
       
        }
	

 
}
}