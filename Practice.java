package PracticeJava;

public class Practice {

	public static void main(String[] args) {
		int p = Integer.parseInt("233");
		System.out.println("int p = "+p);//String꼴로 수로 표현된 것을 int로 바꿔줌;
		
		String k=Integer.toString(p);
		System.out.println("String k = "+k);//int 정수를 String으로 바꿔줌
		
		System.out.printf("\n\n%s",Integer.toBinaryString(p)); //10진수 정수를 2진수로 String꼴로 return
		System.out.println(Integer.toOctalString(p));//10진수 정수를 8진수 String으로 return
		System.out.println(Integer.toHexString(p));//10진수 정수를 16진수 String으로 return
		
		System.out.printf("\n\n%d", Integer.parseInt(Integer.toOctalString(p), 16)); //입력된 STring 값을 16진법으로 취굽하여 이를 10진법으로 Int화;
		
		int g =Integer.min(10, 20);//최소값 찾기, 최대값은 max
		
		

	}

}

