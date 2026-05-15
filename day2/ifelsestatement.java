//1.
//Create a program where:
//If balance is greater than withdrawal amount → show “Transaction Successful”
//Else → show “Insufficient Balance”

import java.util.*;
public class ifelsestatement{

public static void main(String[] args){

System.out.println(" Enter balance Amount in yout account");
Scanner sc=new Scanner(System.in);
int balance=sc.nextInt();

System.out.println(" Enter Withdrawal Amount");
int withdrawalamount=sc.nextInt();

if(balance>withdrawalamount){
    System.out.println("Transaction Successful");
}
else{
   System.out.println("Transaction Successful");
}
}
}


