import java.util.Scanner;


public class prac {
	
	public static double minArray(double[] list) {
		double min=list[0];
		
		for (int i=1;i<list.length;i++) {
			if (list[i]<min) {
				min=list[i];
			}
		}
		return min;
	}
	
	public static void main(String[] args ) {
		Scanner sc=new Scanner(System.in);
		int start,end;

		System.out.print("2개 정수 입력");
		start=sc.nextInt();
		end=sc.nextInt();
		System.out.printf(start+"에서 "+end+"까지의 합은 : %d",inc(start,end));
		
		System.out.println("==================================");
		double[] a= {1.1,2.2,3.3,4.4,0.1,23};
		System.out.println("첫번째 배열 최솟값"+minArray(a));
		double[] b= {-2.0,3.0,-9.0,2.9,1.5};
		System.out.println("두번째 배열 최솟값"+minArray(b));
		
		
	}
	
	public static int inc(int s,int e) {//no retrun
		int tot=0;
		for (int i=s;i<=e;i++) {
			tot+=i;
		}
		return tot;
	}
	
}
