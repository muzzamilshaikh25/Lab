package Positive_neg;
import java.util.Scanner;

public class Pos_neglab {
public static void main(String[] args) {
	
	System.out.println("Enter the number to check Weather it is Positive or Negative number");
	Scanner sc=new Scanner(System.in);
	int no=sc.nextInt();
	if (no>1) {
		System.out.println("The number is Positive  !!!");
	}
	else if(no==0) {
		
		System.out.println("The number is Zero !!!!");
		}
	else {
		System.out.println("The number is Negative !!!!");
		
	}
	
	
}}
