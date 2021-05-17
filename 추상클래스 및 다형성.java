abstract class Shape {
	protected double area;
	public abstract void calcArea(double w,double h);
	//area=0 이거 자체가 의미 없음. 즉 area=0 안해도 사용가능
	//추상 클래스 선언하더라도 추상 메소드 지정을 또 해야함 
	
	//추상 클래스는 객체 생성 불가 참조변수는 선언 가능
	//멤버 변수 멤버 메소드 생성자 추상 메소드 구성됨. 클레스 맴버에 추상 메서드 있으면 그 클래스는 반드시 추상 클래스로 선언할 것
	//추상 메소드가 없어도 추상 클래스 선언이 가능함.
}

class Rect extends Shape {
	public void calcArea(double w, double h ) {
		area=w*h;
		System.out.println("사각형 면적 : "+area);
	}

}

class Triangle extends Shape {
	public void calcArea(double w, double h ) {
		area=w*h/2.0;
		System.out.println("삼각형 넓이 : "+area);
}
}
//------------------------------------------------------------------------
//다형성

class Student {
	String name;
	int year;
	public Student(String name,int year) {
		this.name=name;
		this.year=year;
	}
	public String getInfo( ) {return "이름:" +name+" 학년 : "+year;}
}

class Primary extends Student {
	public Primary(String name,int year) {
		super(name,year);
	}
}
class University extends Student {
	double grade;
	String major;//다운 캐스팅 용
	public University(String name,int year,double grade) {//업 캐스팅 설명용
		super(name, year);
		this.grade=grade;
	}
	
	public University(String name, int year, double grade, String major) {//다운 캐스팅용
		super(name,year);
		this.grade=grade;
		this.major=major;
	}
	public String getInfo() {//업 캐스팅
		return "이름 : "+name+" 학년 : "+year+"학점 : "+grade;
	}
	public String getMajor() {//다운 캐스팅 
		return "*** 소속 : "+major;
	}
}

class Circle2 {
	int r;
	public Circle2(int r) {
		this.r=r;
	}
	public Circle2() {
		this(3);
	}
	
	public String toString( ) {//object toString() 재정의. 
		return "Circle(r="+r+")";
	}
}

class Circle {//toString 미지정
	int r;
	public Circle(int r) {
		this.r=r;
	}
	public Circle() {
		this(3);
	}
	
	public boolean equals(Circle c1) {//equals 메소드 재정의
		if(r==c1.r) {
			return true;
		}
		else
			return false;
	}
}

//------------------------------------------------------------------------


public class practice {
	public static void main(String[] args) {
		int w=5, h=10;
		Shape s=new Rect();
		s.calcArea(w, h);
		
		s=new Triangle();
		s.calcArea(w,h);
		
		
		University u=new University("홍길동",2,4.2);
		System.out.println(u.getInfo());
		//출력 :이름 : 홍길동 학년 : 2학점 : 4.2
		Student p=new University("그는",3,3.5);
		System.out.println(p.getInfo());
		//출력 : 이름 : 홍길동 학년 : 2학점 : 4.2 - Upcasting : 상위 클래스 타입 변수가 하위 클래스 인스턴스를 가르킴.
		//업캐스팅 : 상위 클래스 타입 참조변수에 하위 클래스 객채를 대입
		//Student p 로 참조 클래스 지정한다 해도 p type는 University임. 메소드 사용 범위는 Student 클래스, 메소드 안 명령어들은 University로 작동->(만약 오버라이딩이면)
		Primary e=new Primary("박철수",3);
		System.out.println(e.getInfo());
		
		p=new Primary("그는사람",2);
		p=new University("박보검",3,2.3);//이렇게 다형성 생성이 가능 
		
		System.out.println("=======================");
		Student temp[]=new Student[2];
		temp[0]=new Primary("애기",4);
		temp[1]=new University("박권식",2,3.2);
		
		for (int i=0;i<2;i++) {
			System.out.println(temp[i].getInfo());//동적 바인딩. 같은 메소드 명령어지만 출력을 달리 설정 가능
		}
		System.out.println("=======================");
		Student t;
		t=new University("이몽룡",3,3.5,"math");
		System.out.println(t.getInfo());
		//t.getMajor() 바로 할 경우 오류남. 상위클래스의 참조변수이기 때문.
		University ob=(University)(t);//상속에서 업캐스팅된  변수를 명시작으로 하위 클래스 타입으로 타입 바꾸는 것 - 다운 캐스팅
		System.out.println(ob.getMajor());
		
		System.out.println("=======================");
		Circle2 cc=new Circle2();
		Circle c1=new Circle();
		
		System.out.println("cc 타입 " + cc.getClass().getName()); //클래스명 호출
		System.out.println("해쉬코드 : "+cc.hashCode());//해쉬코드 호출
		System.out.println(cc);//자동으로 toString 호출
		System.out.println(cc.toString());//override 된 toString 출력
		System.out.println(c1);//자동으로 object toString 호출
		System.out.println(c1.toString());//object의 toString 출력
		
		System.out.println("=======================");
		
		Circle obj1=new Circle(20);
		Circle obj2=new Circle(20);
		
		Circle2 obj3=new Circle2(1);
		Circle2 obj4=new Circle2(1);
		
		System.out.println(obj1.equals(obj2));//return true
		System.out.println(obj3.equals(obj4));//return false
	}
}
