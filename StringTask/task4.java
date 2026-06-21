public class task4{
public static void main(String[]args){

String name="om";
String newname="";

for(int i=0;i<name.length();i++){

newname=newname+name.substring(i,i+1)+name.substring(i,i+1);

}
System.out.println(newname);

}
}