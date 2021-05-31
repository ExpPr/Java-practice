package testfile;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;//역직렬화에 사용
import java.io.ObjectOutputStream;//직렬화에 사용
import java.io.RandomAccessFile;
//직렬화에 사용되는 ObjectOutputStream도 바이트 스트림중 하나임에 유의하자 역직렬화도 마찬가지임.
import java.io.Serializable;
import java.util.ArrayList;

class Person implements Serializable {
	private String name;
	private String s_no;
	public  int age;
	
	public Person(String name, String s_no,int age) {
		this.name=name; this.s_no=s_no;this.age=age;
	}
	public String toString() {
		return "( Name : "+name+" s_no : "+s_no+" age : "+age+")\n";
	}
}

public class testing {
	static final String info="user.txt";
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		//직렬화
		
		
		
		FileOutputStream f=new FileOutputStream(info);//info라는 파일명 가진 객체 생성
		BufferedOutputStream b=new BufferedOutputStream(f);//스트림 연결 
		ObjectOutputStream out=new ObjectOutputStream(b);//직렬화에 사용될 파일 처리 클래스 객체
		
		//파일처리만큼은 이러한 업스케일링 같은 형식은 업스케일이 아닌 기능 추가라고 생각하기.
		
		ArrayList<Person> list=new ArrayList<>();
		list.add(new Person("홍길동","654873",20));
		list.add(new Person("일지매","875643",21));
		list.add(new Person("고길동","235643",32));
		list.add(new Person("김자바","752143",23));
		
		out.writeObject(list.get(0));//객체 파일에 Person 0번 데이터 입력
		out.writeObject(list.get(1));
		
		out.close();
		
		
		//역직렬화
		FileInputStream f1=new FileInputStream(info);
		BufferedInputStream b1=new BufferedInputStream(f1);
		ObjectInputStream in=new ObjectInputStream(b1);
		
		ArrayList<Person> result=new ArrayList<>();
		result.add((Person)in.readObject());//사용시 에러 ClassNotFoundException 설정 필요 , user.txt에 저장된 데이터중
		//가장 먼저 등록된 Person과 관련된 데이터 입력 , 즉 여기선 홍길동과 관련된 person 필드 데이터들 입력
		result.add((Person)in.readObject());
		
		System.out.println(result.get(0).toString());
		System.out.println(result.get(1).toString());
		
		//RandomAccessFile
		
		RandomAccessFile inout=new RandomAccessFile("randominout.txt","rw");
		//"rw" : 읽기/쓰기 동시지원, 파일이 없을 경우 생성시도
		//"r" : 읽기만 가능, 파일이 없을 경우 에러
		inout.setLength(0);//inout 객체에 들어있는 파일 크기 지정, 0 설정시 파일 데이터 전부 삭제
		
		for (int i=0;i<3;i++) {//String 입력, 정수입력 : writeInt
		inout.writeUTF(list.get(i).toString());
		}
		inout.seek(50);//50번째 바이트를 기준으로 둠, 데이터의 포인터 위치를 지정함 -> 최대 강점임
		System.out.println(new String(inout.readLine().getBytes("ISO-8859-1"),"UTF-8"));
		//이때 포인터 위치는 이거 실행후 자동으로 다음줄의 맨 첫번째 줄로 이동
		System.out.println(new String(inout.readLine().getBytes("ISO-8859-1"),"UTF-8"));
		//일반적으로 readLine()은 파일 데이터의 포인터 위치를 기준부터 동일한 "줄"에 있는 마지막 데이터까지를 읽어서 가져옴.
		//여기 랜덤 엑세스 파일에 한해서 writeUTF한 데이터를 readLine으로 부를 경우 한글이 깨지는 문제 생김
		//new String(String input.getByte("ISO-8859-1"),"UTF-8") 방법으로 한글 출력이 가능함.<- 한글깨질때
		
		/*randominout.txt파일 데이터
		  	+( Name : 홍길동 s_no : 654873 age : 20)
 			+( Name : 일지매 s_no : 875643 age : 21)
 			+( Name : 고길동 s_no : 235643 age : 32)
		  
		  user.txt 데이터 내용
		  ы sr testfile.Person挾궂Dw I ageL namet Ljava/lang/String;L s_noq ~ xp   t 	?띻만?셳 654873sq ~     t 	?쇱?留쨟 875643
		 */
	}
	
}