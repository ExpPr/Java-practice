package PracticeJava;
import java.util.Arrays;

public class Practice {

	public static void main(String[] args) {
		String str="Apple";
		String str2="test";
		boolean startWith=str.startsWith("a");//문자열이 지정한 문자로 시작하는지 판단. 참이면 True
		startWith=str.endsWith("e");//문자열이 지정한 문자로 끝나는지 판단. 참이면 True;
		
		System.out.println(str.equals(str2));//str이랑 str2랑 내용물이 같은지 판단."단순 데이터 비교"
		
		System.out.println(str.indexOf("p"));//지정한 문자가 문자열에 몇번째 있는지판단, 여러개일경우 가장 가까운걸 고름
		
		int k=str.length();//문자열 길이 
		
		String str3="AB CD";
		System.out.println(str3.replace(" ","*"));//문자열에 지정한 문자 " " 를 새로 지정한 문자로 전부 교체
		
		String str4="A:B:C:D:abcd=a23";
		System.out.println(Arrays.toString(str4.split(":"))); //문자열을 지정한 문자로 나눔, 배열로 return 됨
		
		System.out.println(str.substring(0,3));//인덱스가 0부터 3개글자까지 즉 인덱스2까지 출력, 만약 한개 int만 쓸 경우 그 인덱스 부터 뒤 전부 출력됨
		//toLowerCase() : 대문자를 소문자로 toUpperCase() 소문자를 대문자로 toString()그대로 반환
		
		boolean ex=str.contains("le");//str 문자열안에 "le" 이라는 String이 포함되어 있느냐 없느냐 True/False 반환
		
		char c=str.charAt(2);//지정한 index번째에 문자를 char로 반환
		
		int num=123456789;
		String str5=String.format("%,d",num);
		System.out.println(str5);//서식문자열을 이용해서 서식화된 문자열 반환, 이 메소드는 Static임
	}
}

