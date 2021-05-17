import java.math.BigInteger; //매우 큰 정수 표현하기 위한 클래스
import java.math.BigDecimal;//오차 없는 실수 표현 위한 클래스
//wrapper class
public class practice {
	public static void main(String[] args) {	
		System.out.println(Character.toLowerCase('A'));
		char c1= '4',c2='F';
		
		if (Character.isDigit(c1)) {
			System.out.println(c1 + "는 숫자임 ");
		}
		if (Character.isAlphabetic(c2)) {
			System.out.println(c2 + "는 알파벳 ");
		}
		
		
	System.out.println(123+Integer.parseInt("-21"));
	
	System.out.println("반지름 3인 원 넓이 : "+Double.parseDouble("3.1415")*9);
	
	System.out.println(Integer.toBinaryString(280));
	System.out.println(Integer.bitCount(280));//3개나옴
	
	Integer i0b=Integer.valueOf(2);//직접 박싱하는것
	Integer pi=3;//자동으로 박싱됨 - 오토 박싱
	
	int num1=i0b.intValue();//직접 언박싱 하는 것 doubleValue floatValue 등등 있음
	int num2=pi;//자동으로 언박싱 됨 - 오토 언박싱
	
	System.out.println("int 정수 최대값 : "+Integer.MAX_VALUE);
	System.out.println("int 정수 최소값 : "+Integer.MIN_VALUE);
	
	int p=Integer.sum(2, 42);
	String se=Integer.toOctalString(p);
	
	
	BigInteger b1=new BigInteger("1000000000000000000000000000000000");
	BigInteger b2=new BigInteger("-999999999999999999999999999999999");
	
	BigInteger t1=b1.add(b2);//덧셈
	BigInteger t2=b1.multiply(b2);//곱셈
	
	System.out.println(b2);
	
	//BigInteger형을 int로 변환
	System.out.println(t1.intValueExact());
	
	double d1=1.6, d2=0.1;
	
	BigDecimal bd1=new BigDecimal("1.6");
	BigDecimal bd2=new BigDecimal("0.1");
	
	System.out.println("BigDecimal 덧셈 이용 "+bd1.add(bd2));
	System.out.println("double 덧셈 : "+(d1+d2));
	}
}
