import java.util.*;

public class practicefile {
	
	public static void main(String[] arge) { //static 객체없이 공통으로 사용함을 의미.
		int p,k,count=0;
		Random r=new Random(); //굳이 객체지향을 조금이라도 더 넣는 방법
		//int k1=(int) (Math.random()*100); <- 아니면 이런식으로 비체식 Math.random 이용 이때 이 random은 0~0.9999999까지
		Scanner sc=new Scanner(System.in);
		p=r.nextInt(100);
		System.out.println(p);
		do {
			System.out.print("정답은 ? ");
			k=sc.nextInt();

			
			if (p>k) {
				System.out.println("정답은 이것보단 높아요 ~ ");
				count++;
			}
			else if (p<k){
				System.out.println("정답은 이것보단 낮아요 ~ ");
				count++;
			}
				
		} while (p!=k);
		
		
		System.out.printf("%d회만에 풀었어요!",count+1);

		
		// r.nextInt(200)-100 하면 -100 부터 99까지 난수.
	}
}



