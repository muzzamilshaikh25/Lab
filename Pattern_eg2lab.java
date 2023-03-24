/*Q.4 Write a java program to generate a following @'s triangle.

@@@@@
@@@@
@@@
@@
@
*/

package Pattern_eg2lab;

public class Pattern_eg2lab {
	public static void main(String[] args) {
		int ro=5;
				
		for (int i=1;i<=ro;i++) {
			for(int j=6;j>i;j--) {
				System.out.print("@");
				
			}
				System.out.println();
		}
	}

}
