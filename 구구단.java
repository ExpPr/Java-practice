import java.util.Scanner;

public class practicefile {
	
	public static void main(String[] arge) {
		//������
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("���ϴ� �� �� ������? : ");
		int p=sc.nextInt();
		
		for (int i=1; i<=9;i++) {
			System.out.printf("%d x %d = %d%n",p,i,p*i);
		}
}
}
