import java.util.Arrays;

public class prac {

	public static void main(String[] args) {
		String s1=new String("Java");//원칙
		String s2=new String("Java");
		String s3="Java";//허용
		String s4="Java";
		
		System.out.println("s1 : "+s1);
		System.out.println("s2 : "+s2);
		System.out.println("s3 : "+s3);
		System.out.println("s4 : "+s4);
		
		System.out.println("==================================");
		//========================================================
		
		System.out.println(s1.equals(s2));//결과 : true
		System.out.println(s2.equals(s3));//결과 : true
		System.out.println(s2==s3);//결과 : false , 단순히 ==방식은 참조형에서는 주소를 비교하는 식이므로 , s2와 s3의 주소는 서로 다름을 알 수 있음. 단 s3과 s4의 주소는 같다..! s1과s2는 주소가 다름
		
		System.out.println("==================================");
		//========================================================
		s1="Hello world!";
		s1+=" I'm bob";
		int size=s1.length();
		System.out.println("글자수 "+size);
		
		String name="홍";
		System.out.println(name.concat("길동"));//주의 : name 자체가 홍길동으로 바뀌는것이 아님. 반환의 의미를 잘 생각하기.
		
		
		String sub2="프로그래밍";
		String temp=s3+" "+sub2;
		System.out.println(temp + " : " + 90);
		System.out.println("==================================");
		//========================================================
		s1=null; //강제 쓰레기 처리
		s2=null;
		s3=null;
		s4=null;
		temp=null;
		sub2=null;
		//========================================================
		
		s1="java";
		s2="basic";
		System.out.println(s1.compareTo("python"));//python이 뒤 즉 s1이 앞이므로 음수
		System.out.println(s1.compareTo(s2));//basic이 앞, 즉 s1이 뒤 이므로 양수
		System.out.println(s1.compareTo("java"));//같아서 0
		System.out.println("==================================");
		//========================================================
		//compareTo 메소드 사용 예시
		//특히 점수랑 역였을때!...
		String major[]= {"컴퓨터공학부","경영학부","생명공학부","전자공학부"};
		int[] kor= {90,70,80,100};
		temp="";
		int num;
		
		for (int i=0;i<major.length;i++) {
			for (int j=i+1;j<major.length;j++) {
				if (major[i].compareTo(major[j])>0) {
					temp=major[i];
					num=kor[i];
					major[i]=major[j];
					kor[i]=kor[j];
					major[j]=temp;
					kor[j]=num;
				}
			}
		}
		System.out.println(Arrays.toString(major));//Arrays 클래스 이용. 
		System.out.println(Arrays.toString(kor));
		
		System.out.println("==================================");
		//========================================================
		//indexOf 사용법
		String s="엄홍길";
		int index=s.indexOf("홍");
		
		if (index==0) {
			System.out.println("홍씨입니다"); }
		else {
			System.out.println("홍씨가 아닙니다.");
		}
		
		System.out.println("index=" + index);
		
		System.out.println("==================================");
		//========================================================
		//split 사용법
		
		String sentence="I am a boy.";
		
		String[] tokens=sentence.split(" ");
		System.out.println(Arrays.toString(tokens));
		sentence="I..am....a.....boy .";
		System.out.println(Arrays.toString(sentence.split("[.]{2,}")));//정규식 이용이 가능
		
		System.out.println("==================================");
		//========================================================
		
		String sp1="문자열 관련 메소드에는 concat() 메서드, equals() 메서드 등이 있다";
		String sp2="문자열 관련 메소드에는 concat() 메서드, equals() 메서드 등이 있다";
		
		System.out.println(sp1.replace("서","소"));
		System.out.println(sp2);//주의!! 이런 메소드 방식에서 보면 replace는 sp1를 수정한게 아니라 새로운 객체를 생성한 것임.
		sp1=sp1.replace("서", "소");
		System.out.println(sp1);
		System.out.println(sp2);//이것도 서가 소로 바뀌지 않음! 
		
		System.out.println("==================================");
		//========================================================
		
		String name1="홍";
		String name2="홍";
		
		name2=name2.concat(" 길동");//이때는 또다른 name2에서 홍 길동 이란 새로운 객체를 생성하게 됨... String은 한번생성시 메모리에서 변경이 안됨
		System.out.println(name1);
		System.out.println(name2);
		
		}
	}

