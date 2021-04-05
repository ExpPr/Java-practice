import java.util.Arrays;
public class practicefile {
	public static void main(String[] args) {
		int [][] s= {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		
		System.out.print(Arrays.deepToString(s)); //다차원 배열을 표현하고 싶을 경우의 Array메소드
		System.out.println("       "+Arrays.toString(s[0]));
		
		System.out.println("============================================");
		
		//for문 출력
		for (int i=0;i<s.length;i++) {
			for (int j=0;j<s[i].length;j++) {
				System.out.print(s[i][j]+"\t");
			}
			System.out.println("");
			
		}
		System.out.println("============================================");
		int[][] nums= {{90},{80,70},{100,60,50}};//자바에서는 각 행의 열 개수가 다를수가 있음... c언어와 다르게 정의된 부분만 배열 생성임! 즉 1행엔 1개 2행엔2개 3행엔 3개임.
		for (int i=0;i<nums.length;i++) {
			for (int j=0;j<nums[i].length;j++) {
				System.out.print(nums[i][j]+"\t");
			}
			System.out.println("");
		}
		System.out.println("============================================"); //for-each방식 2차원배열
		for (int[] ex : nums) {//행반복
			for (int p : ex) {//열반복
				System.out.print(p+"\t");
			}
		System.out.println("");
		}
		
		
	}
}


