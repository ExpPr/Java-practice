import java.io.*;
import java.util.Scanner;

public class filetext {//바이트 스트림 사용 2진법. 시각적으로 확인이 불가능함
	public static void main(String[] args) throws Exception {
		try(FileOutputStream output=new FileOutputStream("temp.dat",true);) {//만약 글 추가 가능성을 열어둘려면 true 입력이 필수
			for(int i=1;i<10;i++) {
				output.write(i);
			}
			output.close();
		}
		
		//try 뒤에 소괄호 역활은 close()가 자동으로 실행해주는 공간임.
		
		try (FileInputStream input=new FileInputStream("temp.dat");) {
			int value;
			while ((value=input.read())!=-1) {
				System.out.print(value+" ");
			}
		}

	}
}
