import java.util.*;

public class practicefile {
	
	public static void main(String[] arge) { //static 객체없이 공통으로 사용함을 의미.
		
		for (int i=1;i<=5;i++) {
			for (int p=1; p<=5;p++) {
				if (p<i && i%2==1) {
					System.out.print("  ");
				}
				else if (p<i && i%2==0) {
					System.out.print("k ");
				}
				else
					System.out.print("* ");
			}
			System.out.println();

		}
		
/* 출력물 결과

  * * * * * 
k * * * * 
    * * * 
k k k * * 
        * 

*/
		
	
		
	}
}



