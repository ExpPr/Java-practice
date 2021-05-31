import java.io.*;
import java.util.Scanner;

public class filetext {//바이트 스트림 사용 2진법. 시각적으로 확인이 불가능함
	public static void main(String[] args) throws Exception {
		Scanner scan=new Scanner(System.in);
		System.out.print("원본 파일 이름 : ");
		String inputfilename=scan.next();
		
		System.out.print("복사본 이름"); 
		String outputfilename=scan.next();
		
		try(InputStream inputStream=new FileInputStream(inputfilename);
				OutputStream outputStream=new FileOutputStream(outputfilename);) {
			int c;
			while ((c=inputStream.read())!=-1) {
				outputStream.write(c);
			}
		}
		
		System.out.println(inputfilename + "->"+outputfilename);

	}
}
