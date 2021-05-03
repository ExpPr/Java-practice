class Circle {
	class Point {//내부 클래스
		int x,y;
		public Point(int x,int y) {
			this.x=x;
			this.y=y;
		}
	}
		
		int radius;
		Point center;
		
		public Circle(int radius,int x, int y) {
			this.radius=radius;
			this.center=new Point(x,y);
		}
		
		double calcArea() {
			return 3.14*radius*radius;
		}
	}


public class prac {
	public static void main(String[] args ) {
		Circle obj=new Circle(10,2,3);
		System.out.println("원 면적 : "+obj.calcArea());
		System.out.println("원 중심 : x:"+obj.center.x+"/y:"+obj.center.y);
	}
}
