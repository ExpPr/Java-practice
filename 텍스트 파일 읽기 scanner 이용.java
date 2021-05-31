import java.io.*;
import java.util.Scanner;

public class filetext {
	public static void main(String[] args) throws Exception {
		File file=new File("scores.txt");
		Scanner s=new Scanner(file);
		
		while(s.hasNext()) {
			String a=s.next();
			String b=s.next();
			int c=s.nextInt();
			System.out.println(a + "  / "+b+" / "+c);
		}
	}
}
