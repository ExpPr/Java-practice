import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.io.Serializable;


public class filetext {
	public static void main(String[] args) throws Exception {
		RandomAccessFile raf=new RandomAccessFile("scores.txt","r");
		raf.seek(0);
		String temp=null;
		while((temp=raf.readLine())!=null) {
			System.out.println(temp);
		}
		raf.close();
		
	}
}
