import java.util.Scanner;

public class practicefile {
	
	public static void main(String[] arge) {
		//구구단 
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("원하는 몇 단 구구단 ?: ");
		int p=sc.nextInt();
		
		for (int i=1; i<=9;i++) {
			System.out.printf("%d x %d = %d%n",p,i,p*i);
		}
		
		
		//구구단 2*1 ~ 9*9
		for (int i=1;i<=9;i++) {
			for (int p=2;p<=9;p++) {
				System.out.printf("%d x %d = %d\",p,i,p*i);
			}
			System.out.println("");
		}
}
}
