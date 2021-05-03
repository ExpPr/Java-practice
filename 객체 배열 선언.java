
import java.util.Scanner;
import java.util.ArrayList;
class Rect {
	int width, height;
	public Rect(int w, int h) {
		width=w;
		height=h;
	}
	double calcArea() {
		return (double)width*height;
	}
}

class Movie {
	String title, director;
	public Movie (String title,String director) {
		this.title=title;
		this.director=director;
	}
}

class Person {
	String name;
	String tel;
	
	public Person(String name,String tel) {
		this.name=name;
		this.tel=tel;
	}
}


public class prac {
	public static void main(String[] args ) {
		//일반 클래스 배열 객체 선언식
		Rect[] sq=new Rect[5];
		
		for (int i=0; i<sq.length;i++) {
			sq[i]=new Rect(i,i);
		}
		
		for (int i=0;i<sq.length;i++) {
			System.out.println((i+1)+"번째 사각형 면적"+sq[i].calcArea());
		}
		
		System.out.println("=======================================================");
		
		Scanner sc=new Scanner(System.in);
		System.out.print("영화 작품수 ");
		Movie[] list=new Movie[sc.nextInt()];
		sc.nextLine();//한번 버퍼 비우기. 이거 중요함
		
		for (int i=0;i<list.length;i++) {
			System.out.print("영화 제목 : ");
			String title=sc.nextLine();
			System.out.print("영화 감독 : ");
			String director=sc.nextLine();
			list[i]=new Movie(title,director);
		}
		
		System.out.println("=======================================================");
		
		//ArrayList를 통한 클래스 배열객체 선언 - 수시로 개수가 변한다면 이런 방식 사용 추천함.
		ArrayList<Person> lst= new ArrayList<>();
		lst.add(new Person("홍길동","01012345678"));
		lst.add(new Person("김유신","01023456789"));
		lst.add(new Person("최자영","01045678901"));
		lst.add(new Person("김영희","01012341234"));
		
		for (Person obj:lst) {
			System.out.println(obj.name+"//"+obj.tel);
		}
		
	}
}
