import java.util.Arrays;

public class prac {

	public static void main(String[] args) {
			StringBuffer subject1=new StringBuffer("Java");
			StringBuffer subject2=subject1;
			
			System.out.println("1.subject1 : "+subject1);
			System.out.println("2.subject2 : "+subject2);
			
			subject1.append(" 객체지향");//string과 다르게 진짜로 subject1에 바로 추가하는식 . 즉 새로 객체 생성을 안함.
			
			System.out.println("3.subject1 : "+subject1);
			System.out.println("4.subject2 : "+subject2);
			/* 결과
			 * 3.subject1 : Java 객체지향
			   4.subject2 : Java 객체지향
			 */
			
			subject2.append(" 프로그래밍");
			
			System.out.println("5.subject1 : "+subject1);
			System.out.println("6.subject2 : "+subject2);
			
			/*
			 * 5.subject1 : Java 객체지향 프로그래밍
			6.subject2 : Java 객체지향 프로그래밍
			 * 
			 */
			
		}
	}

