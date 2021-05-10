class Shape {
	protected double area;
	public Shape() {};
	public Shape(String msg) {
		System.out.println("Shape 생성자()"+msg);
	}
	public void calcArea(double w,double h) {
		area=0;
	}
	
	public void printArea(Shape obj) {
		if (obj instanceof Rectangle) {
			System.out.println("사각형 넓이 : "+area);
		}
		else
			System.out.println("삼각형 넓이 : "+area);
	}
}

class Rectangle extends Shape {
	public Rectangle() {
		super(" from Rectangle");//명시적으로 수퍼 클래스 생성자를 호출함. 생성자도 메소드임!
		System.out.println("Rectangle 생성자()");
		//super 이용할때 가장 먼저 사용해야 함 안그럼 에러 발생.
	}
	@Override
	public void calcArea(double w,double h) {
		area=w*h;
	}
}

class Triangle extends Shape {
	public void calcArea(double w,double h) {
		area=w*h/2.0;
	}
}
class Shape1 {
	public Shape1() {
		System.out.println("Shape 생성자()");
	}
	
	public Shape1(String msg) {
		System.out.println("Shape 생성자() 인수 있는 경우");
	}
	
}

class Rectangle1 extends Shape1 {
	public Rectangle1() {
	//부모 생성자 호출 super 이용 안한다 해도, 순서가 부모->자식 순으로 생성자 자동 호출이됨.
		//따라서 출력도 Shape 생성자() 자동으로 됨.
	//super() 입력하나 마나 출력을 동일 하게 Shape 생성자() Rectangle 생성자() 로 나옴
	//단 super("Hi")같은식으로 입력하면 다름
	System.out.println("Rectangle 생성자()");
	
	}
}


class People {
	protected String name;
	protected int RRN;
	public People(String name,int RRN) {
		this.name =name; this.RRN=RRN;
	}
	public void PeopleInfo() {
		System.out.println("이름 " +name+" 주민번호  :"+RRN);
	}
}

class Student extends People {
	private int Sno;
	public Student(String Name,int rrn,int Sno) {
		super(Name,rrn);
		this.Sno=Sno;
	}
	public void StudentInfo() {
		System.out.println("학번 :"+ Sno);
	}
}

class Animal {
	public void eat() {
		System.out.println("동물이 먹고잇슴다");
	}
}
class Dog extends Animal {
	@Override
	public void eat() {
		super.eat();//오버라이딩 된 부모 클래스 멤버 접근 방법. super.멤버 식으로 접근
		System.out.println("강아지가 먹고있습니다.");//메소드 오버라이딩
		//오버라이딩된 메소드를 클래스 외부에서 호출하는 방법은 없음. 오로지 내부에서만 가능
	}
}

public class practice {
	public static void main(String[] args) {
		Rectangle1 r=new Rectangle1();
		People p=new Student("홍길동",2018110451,231321);//상위 클래스 참조변수
		p.PeopleInfo();
		//p.StudentInfo()는 안됨. 
		//상위 클래스 참보변수로 참조 할 수 있는 범위는 상위멤버로 인정. 즉 People만 사용가능함.
		
		if (p instanceof Student) {
			System.out.println("Student 타입");
		}
		else
			System.out.println("People 타입");
		
		System.out.println("===================================");
		
		//p 타입은 스튜던트 임. p는 인스턴스임을 기억하자
		
		Dog d = new Dog();
			d.eat();//메소드 오버라이딩 + 부모 클래스 접근법
			
		System.out.println("===================================");
		
		int w=5,h=10;
		
		Shape s=new Rectangle();//참조 변수는 shape이나 객채는 rectangle
		s.calcArea(w, h);//오버라이딩 된것이 최종적으로 적용됨을 확인 가능함.
		s.printArea(s);
		
		s=new Triangle();//이거 가능함을 의미. 참조 변수는 shape이나 객채는 triangle
		s.calcArea(w,h);//다형성
		s.printArea(s);
	}
}
