class Car {
	int speed;
	public void setSpeed(int speed ) {
		this.speed=speed;
	}
}

class SportsCar extends Car {
	boolean turbo;
	
	public void setTurbo(boolean flag ) {
		turbo=flag;
	}
}

class Animal {
	void eat() {
		System.out.println("먹고있음...");
	}
}

class Dog extends Animal {
	void bark() {
		System.out.println("멍멍");
	}
}


class Shape{
	int x,y;
}

class Circle extends Shape {
	int radius;
	public Circle (int radius) {
		this.radius=radius;
		x=0;y=0;
	}
	double clacArea() {
		return 3.14*radius*radius;
	}
}

class People {
	protected String name;
	protected int RRN;//private 할 경우 자식클래스 students의 setSnoRRN 메소드 사용 불가능
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void SetRRN(int RRN) {
		this.RRN=RRN;
	}
	public int getRRN() {
		return RRN;
	}
}


class Student extends People {
	private int Sno;
	public void setSnoRRN(int Sno,int rrn) {
		this.Sno=Sno;
	}
	public int getSno() {
		return Sno;
	}
}


public class practice {
	public static void main(String[] args) {
		SportsCar obj=new SportsCar();
		obj.speed=10;//부모 필드
		obj.setSpeed(60);//부모 메소드
		obj.setTurbo(true);//자체 메소드
		
		Dog d=new Dog();
		d.bark();
		d.eat();
		
		
		Circle c1=new Circle(10);
		System.out.printf("x=%d,y=%d\n",c1.x,c1.y);
		System.out.printf("Area=%.2f",c1.clacArea());
		
		
		
		Student s=new Student();
		s.setName("홍길동");
		System.out.println("Name : "+s.getName());
		s.setSnoRRN(2019001, 991225);
		System.out.println("학번 : "+s.getSno());
		System.out.println("주민번호 : "+s.getRRN());
	}
}
