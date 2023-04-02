package Create_obj;
//Taking input from the user (Scanner)
import java.util.Scanner;
public class Minimum_number {
	
public static void main(String args[])
	{
	int a,b,c;
	System.out.println("Enter the 3 number:");
	Scanner sc=new Scanner(System.in);
	a=sc.nextInt();
	b=sc.nextInt();
	c=sc.nextInt();
	if(a<b && a<c)
	{
	System.out.println("The Minimum Number is:"+a);
	}
	else if(b<c && b>a)
	{
	System.out.println("The Minimum Number is:"+b);
	}
	else
	{
	System.out.println("The Minimum Number is:"+c);
	}}}
