import java.util.Scanner;

class Pizza {
	int radius;
	Pizza(int r) {
		radius=r;
	}
	Pizza whosLargest1(Pizza p1,Pizza p2) {//반환  타입이 Pizza임을 기억하자. call by reference (객체 주소값을 복사함)
		if (p1.radius>p2.radius) {//반환  타입이 클래스일수도 있음. 꼭 String int char 등등 이런것만 쓰는 것이 아님. 다만 이렇게 중복해서 사용할 필요가 있을까?
			return p1;
		}
		else
			return p2;
	}
	
	Pizza whosLargest2(Pizza p2) {//this 또다른 활용법. 자기자신 객체를 return을 시킴 이 방식으로 파라미터 한개 줄일 수 있음.
		if (radius>p2.radius) {
			return this;
		}
		else
			return p2;
	}
}

class VarArg{//가변길이 인수, ...을 붙이면 됨. 그리고 메소드에서 v를 마치 배열처럼 사용함 (단 index를 사용하는 방식은 불가능한듯)
	void print(int...v) {
		System.out.print("인수 개수 :" + v.length+"개");
		System.out.print("값들 : ");
		for (int x:v) {
			System.out.print(x + " ");
		}
		System.out.println();
	}
}

class VarArg2 {
	void print(int a, String...arg) {//지정된 파라미터 이후에 가변길이 인수를 사용해야함. 즉 가변길이 변수는 가장 마지막에 사용해야하며, 단 한번만 사용이 가능
		System.out.print(a+"학년");
		for (String num:arg) {
			System.out.print(num + " ");
		}
		System.out.println();
	}
}


public class prac {
	
	public static double minArray(double[] list) {//메소드에 배열이 전달될 때 사용방법, 객체처럼 참조형 "주소"를 복사하는 식.
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
		System.out.printf(start+"에서 "+end+"까지의 합은 : %d\n",inc(start,end));
		
		System.out.println("==================================");
		double[] a= {1.1,2.2,3.3,4.4,0.1,23};
		System.out.println("첫번째 배열 최솟값 "+minArray(a));//배열의 실인수가 전달이 됨. 즉 배열의 변수 이름
		double[] b= {-2.0,3.0,-9.0,2.9,1.5};
		System.out.println("두번째 배열 최솟값 "+minArray(b));
		System.out.println("==================================");
		Pizza obj1=new Pizza(14);
		Pizza obj2=new Pizza(18);
		
		Pizza largest=obj1.whosLargest1(obj1, obj2);//이것도 조심하자. 
		System.out.println(largest.radius + "인치 피자가 더 큼");
		Pizza large=obj1.whosLargest2(obj2);//this 이용한 방식
		System.out.println(large.radius + "인치 피자가 더 큼");
		System.out.println("==================================");
		VarArg c= new VarArg();
		c.print(3,7);
		c.print(3,4,5,6,7,8,9);
		System.out.println("==================================");
		VarArg2 e=new VarArg2();
		e.print(3,"홍길동");
		e.print(3,"ㄱ","ㄴ","ㄷ");
		
		
		
		
		
	}
	
	public static int inc(int s,int e) {//no retrun
		int tot=0;
		for (int i=s;i<=e;i++) {
			tot+=i;
		}
		return tot;
	}
	
}
