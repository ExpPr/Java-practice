import java.util.Arrays;

public class practicefile {
	public static void main(String[] args) {
		int [] att=new int[5];
		int [] report=new int[5];
		
		
		Arrays.fill(att, 10); // Arrays클래스는 static이라서 클래스 자체를 사용. 인스턴스 사용x
	
		Arrays.fill(att, 0,2,10); //인덱스 0부터 2까지 배열 att를 10으로 초기화함. 나머지는 놔둠. 
		
		System.arraycopy(att, 0, report, 0, att.length); //원본 att배열의 0번째 이후 모든 데이터를 report 배열의 0번빼부터로 복사함.
		
		System.out.print("출석 : ");
		for (int i=0;i<att.length;i++) {
			System.out.print(att[i]+" ");
		}
		
		System.out.print("\n과제 : "); //  \n은 printf가 아니어도 사용가능		
		for (int i=0;i<report.length;i++) {
			System.out.print(report[i]+" ");
		}
		
		for (int i=0;i<args.length;i++) {
			System.out.print(args[i]+" ");//메인함수 args에 대입시 run configuration에 가야한다. 콘솔창도 가능
		}
}
}


