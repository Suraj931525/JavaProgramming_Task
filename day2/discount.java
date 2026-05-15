
//5.Swiggy Offer 🍕

//order amount greater than 500 → Give 20% discount ,greater than 300 → Give 10% discount
 //→otherwise No discount

import java .util.*;
public class discount{
public static void main(String []args){
Scanner sc=new Scanner (System.in);
System.out.println("enter amount of order");
int amount=sc.nextInt();

if(amount>500){
System.out.println("20% discount");
int amount1=(amount*20)/100;
amount=amount-amount1;
System.out.println("Discounted price is:"+amount);
}
else if(amount>300 && amount<500){
System.out.println("10% discount");
int amount1=(amount*10)/100;
 amount=amount-amount1;
System.out.println("Discounted price is:"+amount);

}
else{
System.out.println("no discount");
}

}
}