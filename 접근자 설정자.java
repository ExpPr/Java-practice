import java.util.Scanner;
class Acount {
	private int regNumber, balance;//오로지 Acount라는 클래스 안에서만 사용가능한 필드
	private String name;//오로지 name라는 클래스 안에서만 사용가능한 필드 (public = 모든곳에서 / default=동일 클래스 내에서 (자식클래스불가능) / protected = 자식클래스 포함한 동일클래스
	public String getName() {//반환자. name은 private이므로 간접적으로 이방식사용 이때 접근권한은 보통 public
		return name;
	}
	public void setName(String name) {//설정자. name은 private이므로 메인에서 접근 불가능. 설정자를 통해 간접수정이 가능. 이때 접근권한은 보통 public
		this.name=name;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance (int balance) {
		this.balance=balance;
	}
	public void deposit(int balance) {
		this.balance+=balance;
	}
}

public class prac {

	public static void main(String[] args) {
		Acount obj=new Acount();
		obj.setName("Tom");
		obj.setBalance(1000000);
		System.out.println("이름은 "+ obj.getName()+"// 통장 잔고는 : "+obj.getBalance()+" 입니다.");
		Scanner il=new Scanner(System.in);
		System.out.print("입금 금액 : ");
		int in=il.nextInt();
		obj.deposit(in);
		System.out.println("통장 잔고는  "+obj.getBalance()+"입니다.");

	}

}
