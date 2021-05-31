import java.io.*;
import java.util.Scanner;

public class filetext {
	public static void main(String[] args) throws IOException {
		String st; int c;
		Scanner s=new Scanner(System.in);
		
		FileWriter fo=new FileWriter("D:\\test.txt");
		for(;;) {
			st=s.next();
			if(st.length()==0) 
				break;
			fo.write(st,0, st.length());//문자열 st에서 0번째 인덱스 부터 n-1번째 인덱스까지 write함
			fo.flush();//버퍼가 가득 차 있지 않더라도 버퍼의 내용을 바로 보내게 함. 거의 필수요소
			//버퍼는 입출력 효율 높이기 위해서, 데이터를 모았다가 한꺼번에 입출력을 하는 것
			fo.write("\r\n",0,2);
		}
		fo.close();//스트림 종료
	}
}
