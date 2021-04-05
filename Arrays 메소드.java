import java.util.Arrays;
import java.util.Collections;

public class practicefile {
	public static void main(String[] args) {
		
		int [] att=new int[5];
		int [] report=new int[5];
		
		
		Arrays.fill(att, 10); // Arrays클래스는 static이라서 클래스 자체를 사용. 인스턴스 사용x
		Arrays.fill(att, 0,2,10); //인덱스 0부터 2까지 배열 att를 10으로 초기화함. 나머지는 놔둠. 
		
		
		System.arraycopy(att, 0, report, 0, 3); //원본 att배열의 0번째 이후 모든 데이터를 report 배열의 0번빼부터 3개 즉 2인덱스까지 복사. 이명령어는 Arrays 클래스가아님
		
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
		
			
			
		int mat[]= {90,80,470,5,60};
		int rep[]= Arrays.copyOfRange(mat, 0, 3);//복사 메소드. 원본배열 mat의 인덱스가 0부터 2까지 총 3개를 복사함
		System.out.println("복사본 "+Arrays.toString(rep));
		
		System.out.println(Arrays.toString(mat));//배열에 있는 숫자 데이터를 문자열로 바꾸어줌. 이때 대괄호 콤마는 자동임.
		
		Arrays.sort(mat);
		Arrays.sort(mat,2,mat.length); //인덱스가 2부터 mat.length-1까지"만" 오름차순 정렬"
		System.out.println("오름차순 : "+Arrays.toString(mat)); //sort 배열정리 기본값은 오름차순
	
		
		
		Integer[] java_s= {90,80,700,40,85};//객체형, wrapper class 기초 자료형을 객체로 포장하는 것이라고 생각하면 편함.
		Arrays.sort(java_s,Collections.reverseOrder());//내림차순 사용시, 이런 wrapper class 사용하거나 객체를 사용해야함
		System.out.println("내림차순 "+Arrays.toString(java_s));
		
		
		
		int score[]= {90,80,100,70,50};
		int d;
		Arrays.sort(score);
		System.out.println(Arrays.toString(score));
		d=Arrays.binarySearch(score, 100);
		System.out.println("100 인덱스 : "+d);
		d=Arrays.binarySearch(score, 99);
		System.out.println("99 인덱스" + d); //mat 배열에 470이란 값이 있을 경우, 그 위치를 리턴한다. 만약 그 값이 없을 경우 음수 값이 리턴됨
		//이때 탐색 방법은 이미 "정렬"된 상태여야 효율이 좋아짐. 주의할 것. 중앙 기준을 잡음. (대상 인덱스들의 맨 처음 + 마지막)/2를 비교하여 일부를 제거하면서 비교, 제어탐색이며 이중 하나는 이진탐
	}
}
}

