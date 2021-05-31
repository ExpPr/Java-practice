import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

public class filetext {//바이트 스트림 사용 2진법. 시각적으로 확인이 불가능함
	public static void main(String[] args) throws Exception {
		ObjectInputStream in=null;
		ObjectOutputStream out=null;
		
		try {
			out=new ObjectOutputStream(new FileOutputStream("object.dat"));
			out.writeObject(new Date());//객체 직렬화 후 쓰기
			out.flush();
			
			in=new ObjectInputStream(new FileInputStream("object.dat"));
			
			Date d=(Date)in.readObject();//역직렬화 후 읽기
			System.out.println(d);
			
			
		} catch(ClassNotFoundException e ) {}
		finally {
			if (in !=null) in.close();
			if (out!=null) out.close();
		}
	}
}
