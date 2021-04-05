import java.util.Arrays;

public class practicefile {
	public static void main(String[] args) {
		
		int mat[]= {90,80,470,5,60};
		int rep[]= Arrays.copyOfRange(mat, 0, 3);//복사 메소드. 원본배열 mat의 인덱스가 0부터 2까지 총 3개를 복사함
		//시스템적으로 사용 원할시 System.arraycopy(mat,0,rep,0,mat.length)
		System.out.println(Arrays.toString(rep));
		
		System.out.println(Arrays.toString(mat));//배열에 있는 숫자 데이터를 문자열로 바꾸어줌. 이때 대괄호 콤마는 자동임.
		
		Arrays.sort(mat);
		Arrays.sort(mat,2,mat.length) //인덱스가 2부터 mat.length-1까지"만" 오름차순 정렬"
		System.out.println(Arrays.toString(mat)); //sort 배열정리 기본값은 오름차순
		
		int p=Arrays.binarySearch(mat, 90);
		System.out.println("위치 : "+p); //mat 배열에 470이란 값이 있을 경우, 그 위치를 리턴한다. 만약 그 값이 없을 경우 -1 값이 리턴됨
		

	}
}



