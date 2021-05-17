//인터페이스 : 예약어로 선언되는 추상 클래스 . 추상 클래스가 발전한 개념
//인스턴스 생성 불가 , 레퍼런스 변수 선언은 가능, 업캐스팅 타입 사용 가능
//인터페이스는 필드(변수) 선언 불가
//private static 메소드 사용은 java9부터 사용가능 
//java8부터 상수 와 추상메소드 포함가능

//하위 클래스가 상속 받기 위해선 implements 사용 필수
//하위 클래스에서는 여러 인터페이스를 동시에 implements 가능함.

//클래스와 클래스 사이를 연결하는것이 인터페이스

/* 인터페이스 구성요소
 * 상수 : public 만 허용
 * 추상 메소드 : 본체 코드 구현 생략
 * default 메소드 : 인터페이스에 코드가 작성됨.  인터페이스 구현하는 클래스에 자동상속. public 접근지정만 허용
 * private 메소드 : 인터페이스 내에 메소드 코드가 작성되어야함. 인터페이스 내에 있는 다른 메소드에 의해서만 호출가능
 * static : public private 둘다 지정 가능함
 */

interface Shape {
	public static final double PI=3.14;//final : 상수표현임.
	public abstract void calcArea(double w,double h);
	public abstract void calcGirth(double...v);
	
} 
interface Point {
	public default void moveP(int x, int y) {
		System.out.println("x : "+x +", y : "+y+" 위치로 이동");//인터페이스에선 default가 선언되어야함 사용원할 시
	}
}

class Tri implements Shape {
	double len=0;
	@Override
	public void calcArea(double w,double h) {
		System.out.println("삼각형 면적 : "+((w*h)/2.0));
	}
	
	public void calcGirth(double ...v) {
		for (double val:v) {
			len+=val;
		}
		System.out.println("삼각형 둘레 : "+len);
	}
}

class Rect implements Shape {
	double len=0;
	@Override
	public void calcArea(double w, double h) {
		System.out.println("사각형 면적 : "+(w*h));
	}
	public void calcGirth(double ...v) {
		for (double val:v) {
			len+=val;
		}
		System.out.println("사각형 둘레 : "+len);
	}
}

class Circle implements Shape, Point{//다중 인터페이스 상속
	public void calcArea(double r, double r0) {
		System.out.printf("원 면적 %.2f\n", PI*r*r);
	}
	public void calcGirth(double ...v) {
		for (double val:v) {
			System.out.printf("원 둘레 %.2f\n", 2*PI*val);
		}		
	}
}
//상속과 동시에 인터페이스 구현이 가능함. ex: class Circle extends Shape implements Drawable -동적 바인딩 그대로 적용

//인터페이스 간의 관계는 상속 관계. 즉 인터페이스끼리 상속 가능 인터페이스끼리 상속할 때는 extends 이용

interface ITest {
	public abstract void fun();}
interface ITest1 extends ITest {
	public abstract void func1();
}
interface ITest2 extends ITest {
	public abstract void func2();
}//ITest2는 fun func1 func2 3개 메소드 가진꼴

class Child1 implements ITest1,ITest2 {
	public void fun() {
		System.out.println("fun() 메소드");
	}
	public void func1() {
		System.out.println("func1() 메소드");
	}
	public void func2() {
		System.out.println("func2() 메소드");
	}
}


public class practice {
	public static void main(String[] args) {
		Shape s=new Tri();
		Rect r=new Rect();
		
		System.out.println("s.PI : "+Shape.PI);
		s.calcArea(3, 4);
		((Tri)s).calcGirth(3,4,5);
		r.calcArea(5, 6);
		r.calcGirth(5,6);
		
		
		System.out.println("---------------------------------------");
		
		Circle p=new Circle();
		p.calcArea(3, 0);
		p.calcGirth(3);
		p.moveP(4,5);//Point 인터페이스 default 메소드
		
	}
}
