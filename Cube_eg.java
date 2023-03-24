//Q.1 Write a program in Java to display the cube of the number upto given an integer provided by the user

package Cube;
import java.util.Scanner;
public class Cube_eg {
	public static void main(String[] args) {
		
		System.out.println("Enter the number to find Cube:");
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		System.out.println("Cube  of number is:"+(no*no*no));
		
		
	}

}
