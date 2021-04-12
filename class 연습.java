package PracticeJava;
import java.util.Scanner;
class Student {
	String name;//이름
	int num;//학번;
	int age;//나이;
	
	Student() {
		Scanner sc=new Scanner(System.in);
		System.out.println("이름 : ");
		name=sc.next();
		System.out.println("학번 : ");
		num=sc.nextInt();
		System.out.println("나이 : ");
		age=sc.nextInt();
		
		System.out.println("이름 : "+name+"// 학번 : "+num+"// 나이 : "+age);
		sc.close();
	}
}

class Date {
	int year,month,date;
	String mon;
	Date(int y,int m,int d) {
		year=y;
		month=m;
		date=d;
	}
	
	
	
	void print1() {
		System.out.printf("%d.%d.%d\n",year,month,date);
	}
	void print2() {
		switch (month) {
		case 1:
			mon="Jen";
			break;
		case 2:
			mon="Feb";
			break;
		case 3:
			mon="Mar";
			break;
		case 4:
			mon="Apr";
			break;
		case 5:
			mon="May";
			break;
		case 6:
			mon="Jun";
			break;
		case 7:
			mon="July";
			break;
		case 8:
			mon="Aug";
			break;
		case 9:
			mon="Sep";
			break;
		case 10:
			mon="Oct";
			break;
		case 11:
			mon="Nov";
			break;
		case 12:
			mon="Dec";
			break;
		}
		System.out.printf("%s %d %d\n",mon,date,year);
		
		
		
		
	}
}

class Account {
	int balance;//계좌있는돈
	Account(int k) {
		balance=k;
		System.out.println("새로운 계좌가 생성되었습니다.");
	}
	Account() {
		this(0);
		System.out.println("새로운 계좌가 생성되었습니다.");
	}

	
	void withdraw(int amount) {
		balance-=amount;
		System.out.println("계좌에 "+amount+"만큼 인출되었습니다");
	}
	void deposit(int amount) {
		balance+=amount;
		System.out.println("계좌에 "+amount+"만큼 입금되었습니다");
	}
}



	
	
public class Practice {
	public static void main(String args[]) {

	}
}

