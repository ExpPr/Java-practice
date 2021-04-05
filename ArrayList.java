import java.util.ArrayList; //ArrayList사용하기 위해선 이 작업이 필수임.

public class practicefile {
	public static void main(String[] args) {
		ArrayList<String> list= new ArrayList<>(); //정수는 Integer , long은 Long 식으로 wrapper class쪽으로 기본형은 객체로 바꿔야함
		list.add("철수");//ArrayList 메소드 add, 가장 마지막 부분에 첨가해줌
		list.add("영희");
		list.add("순신");
		list.add("자영");
		
		System.out.println(list);
		System.out.println(list.size()); //ArrayList 크기를 보여줌 - 메소드

		String p=list.remove(2);//인덱스가 2인 ArrayList값이 삭제됨. 이때 삭제된 데이터가 리턴됨.
		System.out.println(list+"   //  삭제된거 : "+p);
		
		list.add(2,"순신");
		System.out.println(list);//인덱스값이 2인 위치에 데이터기입, 이때 원래 있던 자료들은 전부 인덱스값이 하나 늘어남. 즉 자영이란 인덱스값이 1이 커짐
		
		System.out.println(list.get(2)); //2번째 인덱스값인 ArrayList에 있는 데이터를 가져옴
		
		list.clear(); //ArrayList 완전 초기화
		
		
		
		
		ArrayList<String> sub=new ArrayList<>();
		
		sub.add("JAVA");
		sub.add("C");
		sub.add("C++");
		sub.add("English");
		
		for (String s:sub) {//for -each 구문에서 배열뿐만 아니라 ArrayList, List, 등등 다른 것들도 사용 가능하다
			System.out.print(s+'\t');
		}
		
		
	}
}


