//예외처리
//오작동이나 결과에 영향을 주는 실행 중 발생하는 오류를 처리함
//Exception class 제공 , java.lang에 제공되므로 따로 import no need

// Exception() : 예외 메시지 없이 예외 클래스 예외생성
// Exception(String message) 예외 생성시 예외 메세지를 예외에 전달
// Exception(String message , Throwable cause) :  예외 생성시 예외 메세지와 원인을 예외에 전달

//메소드 : String getMessage() - 예외 발생 메세지 전달 / Throwable getCause() : 예외 원인 반환 /void printStackTrace() 예외 이력 출력

import java.util.Scanner;
import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;

class Calculator {//throws 이용
	public void DivideFun() throws ArithmeticException {
		System.out.println("메소드시작");
		int x,y;
		Scanner sc=new Scanner(System.in);
		
		x=sc.nextInt();
		y=sc.nextInt();
		
		int result=x/y;
		
		System.out.println("결과 :"+result );
	}
}

class UserDefException extends Exception {//사용자 지정 예외 처리 클랫 ㅡ지정
	private String msg;
	public UserDefException(String msg) {this.msg=msg;}
	public String toString() {return "예외 메세지는 : "+ msg;}
	public String getExcpetionInfo() {
		String errMsg=showTime()+" 예외 : "+msg;
		return errMsg;
	}

	static String showTime() {
		String date=null, time=null;
		Calendar now=Calendar.getInstance();
		SimpleDateFormat p=new SimpleDateFormat("yyyy:MM:dd hh-mm-ss");
		Date no1=now.getTime();
		
		return p.format(no1).toString();
	}
}

class bankAccount {
	String name,password,no;
	int balance;
	
	static int cnt=0;
	
	public bankAccount(Scanner p) {
		System.out.print("\t 예금주 이름은 ?");
		this.name=p.next();
		p.nextLine();
		
		System.out.print("\t계좌 번호 : ");
		this.no=p.next();
		p.nextLine();
		
		System.out.print("\t계좌 비밀 번호 : ");
		this.password=p.next();
		
		this.balance=0;
		
		cnt++;
	}
	
	public void deposit (Scanner w) {
		System.out.print("입금 금액 입력");
		this.balance+=w.nextInt();w.nextLine();
	}
	
	public void withdraw(Scanner w) throws UserDefException {//출금처리 예외 처리 포함
		int t;
		System.out.print("출금금액 : ");
		t=w.nextInt();
		
		if(this.balance<t) {//잔액이 부족한 경우 사용자 지정 예외 처리
			throw new UserDefException("잔액부족");
		}
		else
			this.balance-=t;
		w.nextLine();
	}
	
	public void balanceP() {System.out.println("*** 현재 잔액 " + balance);}
	public static void workFun (bankAccount[] bA,Scanner w) {
		System.out.print("\t계좌번호를 입력하세요");
		String NO=w.next(); w.nextLine();
		System.out.print("\t비번입력하세요 : ");
		String ps=w.next(); w.nextLine();
		
		int i;
		for (i=0;i<cnt;i++) 
			if(bA[i].no.equals(NO)==true && bA[i].password.equals(ps)==true)
				break;
			
		if (i<cnt) {
			System.out.print("\t입금(i) 출금(d) 잔액확인(b) 선택");
			String ss=w.next(); w.nextLine();
			switch(ss) {
			case "i" : bA[i].deposit(w);
						break;
			case "d" :
				try {
					bA[i].withdraw(w);
				} catch(UserDefException e) {
					System.out.println(e.getExcpetionInfo());
				}
				break;
			case "b" : bA[i].balanceP(); break;
				
		}
		}
		else
			System.out.println("존재 안하는 고객");
	}
}



public class practice {
	public static void main(String[] args) {
		int x,y;
		Scanner sc=new Scanner(System.in); 
			
			x=sc.nextInt();
			y=sc.nextInt();
			
		
			try {
				int result=x/y;
				System.out.println(x+"/"+y+"="+result);
			} catch(Exception e) {
				System.out.println("0으로는 못나눔");
			}
			
			System.out.println("the end");
			
			
		int[] array= {1,2,3,4,5};
		int i=0;
		
		try {
			for (i=0;i<=array.length;i++) {
				System.out.println(array[i]);
			}
		} catch(ArrayIndexOutOfBoundsException e) {//인덱스가 넘어선 배열지정시 에러처리
			
		}
		
		//다중 catch문
		//Exception 계층 구조에서 상위 클래스 타입 매개변수를 가지는 catch문은 뒤에 위치해야함.
		//즉 가장 포괄적인 부분이 가장 마지막 catch 에 둬야함
		
		System.out.println("=================================================");
		
		int[] num= new int[2];
		
		try {
			num[0]=1;
			num[1]=2;
			num[2]=3;//ArrayIndexOutOfBoundsExcpetion
			
			num[1]=3/0;//ArithmeticException
			
			System.out.println("Hello");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("인덱스 초과!");
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("오류 발생 상관없이 난 실행되지롱");
		}
		
		System.out.println("World");
		
	
		
		//주의 Exception e가 먼저 맨 앞에 catch문에 오면 밑에 나머지 2개 예외처리는 오류가 뜬다.
		
		/* 출력문
		 * 인덱스 초과!
		   World
		 */
		//num[2]=3 에서 오류가 걸렸으며 ArrayIndexOutOfBoundsException 예외처리가 됨 나머지는 되지 않음.
		//만약 인덱스 에러가 없엇으면 다음 ArithmeticException 예외처리가 일어남 (Exception 처리는 없음)
		
		//finally : 예외발생 없어도 실행이 가능. 생략가능 . 주로 초기화 작업이나 마무리 작업시 주로 사용.
		
		//throws 형식 : 예외 발생시 발생한 예외를 메소드 호출한 곳으로 전달하여 예외처리
		//public 리턴타입 메소드명([매개변수]) throws 예외_클래스명 {} 방식으로 이용
		
		System.out.println("=================================================");
		
		Calculator c=new Calculator();
		
		try {
			c.DivideFun();
		} catch (ArithmeticException e) {
			System.out.println("메인 메소드에서 산술 예외처리");
		}
		
		//사용자 정의 예외 처리 방법. 반드시 Exception 클래스 상속받아야함.
		
		Scanner pp=new Scanner(System.in);
		final int MAX=10; int work;
		bankAccount[] bA=new bankAccount[MAX];
		
		BANK:
			for(;;) {
				System.out.println("\t=======================");
				System.out.println("\t1. 계좌계설");
				System.out.println("\t2 입금 출금 잔액확인");
				System.out.println("\t5. 작업종료");
				System.out.println("\t=======================");
				
				work=pp.nextInt();
				
				if(pp.hasNextLine()) pp.nextLine();
				switch (work) {
				case 1:bA[bankAccount.cnt]=new bankAccount(pp);
				break;
				case 2:bankAccount.workFun(bA, pp);
				break;
				case 5: break BANK;
				default : System.out.println("잘못된 번호를 입력함. 다시 확인 바람");
				}
			}
		pp.close();
		System.out.println("영업 종료");
		
	}
}