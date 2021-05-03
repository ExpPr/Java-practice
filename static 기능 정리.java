import java.util.Scanner;

class Pizza {
	private String toppings;
	static int count=0;//정적변수 (클래스변수)
	
	public Pizza(String toppings) {
		this.toppings=toppings;
		count++;
	}
}

class Circle {
	static final double PI=3.14;//더이상 수정하지 않은 변수 : Static - 기호상수 //관례적으로 대문자 사용
	private double radius;
	 
	Circle (double red) {
		radius=red;
	}
	void showPerimeter() {
		double peri=(radius*2)*PI;//메소드 안에서 변수선언이 가능. 단 이 메소드 안에서만 사용가능.
		System.out.printf("둘레 : %.2f\n",peri);
	}
	//static 메소드는 지역변수 혹은 static 필드만 사용가능. 인스턴스 변수 사용 불가능
	void showArea() {
		double area=(radius*radius*PI);
		System.out.printf("넓이 : %.3f\n", area);
	}
	
	
}
class MyMath {
	public static int abs(int x) {
		return x>0?x:-x;
	}
	public static int power(int base, int exponent) {
		int result=1;
		for (int i=1;i<=exponent;i++) {
			result*=base;
		}
		return result;
	}
} 

class CurrencyTr {
	private static double rate;
	public static double toDollar(double won) {
		return won/rate;
	}
	public static double toKWR(double dollar) {
		return dollar *rate;
	}
	public static void setRate(double r) {
		rate=r;
	}
}

public class prac {
	public static void main(String[] args ) {
		Pizza p1=new Pizza("Super Spureme");
		Pizza p2=new Pizza("Cheese");
		Pizza p3=new Pizza("Pepperoni");
		
		System.out.println(Pizza.count);
		System.out.println(p1.count);
		
		System.out.println("==================================================");
		
		Circle c1=new Circle(3);
		c1.showPerimeter();
		c1.showArea();
		System.out.println("==================================================");
		Circle c2=new Circle(5);
		c2.showArea();
		c2.showPerimeter();
		
		System.out.println("10^3 = "+MyMath.power(10, 3));
		System.out.println("-5 절대값 : "+MyMath.abs(-5));
		
		System.out.println("==================================================");
		//Math static 메소드
		int a=3,b=2,c=3;
		System.out.printf("원주율 : %.2f\n",Math.PI);
		System.out.printf("반지름 3인 원 넓이 : %.2f\n",3*3*Math.PI);
		System.out.printf("2 제곱근 : %.4\nf",Math.sqrt(2));
		System.out.printf("2차방정식 판별식 : %.2f\\n",Math.sqrt(b*b-4*a*c));
		double radian30=Math.toRadians(30);
		System.out.printf("sin 30도 : %.2f\n",Math.sin(radian30));
		System.out.printf("3^5 : %.2f\n",Math.pow(3, 5));
		System.out.printf("이차방정식 판별식 %.2f\n",Math.sqrt(Math.pow(b, 2)-4*a*b));
		System.out.println("==================================================");
		
		
		Scanner sc=new Scanner(System.in);
		System.out.print("환율(1달러)");
		double rate=sc.nextDouble();
		CurrencyTr.setRate(rate);
		System.out.printf("백만원은 $%.2f입니다\n",CurrencyTr.toDollar(1000000));
		System.out.printf("$100은 %.2f입니다", CurrencyTr.toKWR(100));
		sc.close();
	}
}
