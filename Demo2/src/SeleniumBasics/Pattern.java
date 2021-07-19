package SeleniumBasics;

import java.io.IOException;

public class Pattern {

	public static void main(String[] args) throws IOException {
		
		
			for(int col=5;col>0;col--) {
				for(int row=1;row<=col;row++) {
						System.out.print("*");
				}
				System.out.println();
			}
		System.out.println("---------------------------------------");
		System.out.println();
/*    *
   **
  ***
 ****
*****		
			*/
			int x=0;
			for(int row =0 ; row <= 9; row++) {
				if(row<5) {
					x++;
				}else {
					x--;
				}
				for(int col = 0; col < x ; col++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
}
		
		
/*
 *****   row=5 col=5
 ****	 row=4 col=5
 ***	 row=3 col=5
 **		 row=2 col=5
 *		 row=1 col=5
 */
		
		
	
/*
*       row=0
**		row=0 col<1
***		row=0 col<2
****	row=0 col<3
*****
*/

