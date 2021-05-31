import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;


public class guitest extends JFrame {
	int x=150,y=150;
	JLabel la=new JLabel("<html><p>안녕?</p>\r\n"
			+ "<p><img src=\"https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/db3158a6-3a1d-4822-82e6-98dace01742f/d3fdbxe-185aba56-1269-4b1f-89e7-798b00aed757.gif?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOjdlMGQxODg5ODIyNjQzNzNhNWYwZDQxNWVhMGQyNmUwIiwiaXNzIjoidXJuOmFwcDo3ZTBkMTg4OTgyMjY0MzczYTVmMGQ0MTVlYTBkMjZlMCIsIm9iaiI6W1t7InBhdGgiOiJcL2ZcL2RiMzE1OGE2LTNhMWQtNDgyMi04MmU2LTk4ZGFjZTAxNzQyZlwvZDNmZGJ4ZS0xODVhYmE1Ni0xMjY5LTRiMWYtODllNy03OThiMDBhZWQ3NTcuZ2lmIn1dXSwiYXVkIjpbInVybjpzZXJ2aWNlOmZpbGUuZG93bmxvYWQiXX0.v542xnwOWyrbQ4tLRQLCZsMTHNR2jzjAkx6TdX0Nm20\" alt=\"\" width=\"80\" height=\"72\" /></p</html>");
	
	public guitest() {
		setTitle("마우스 이벤트");
		Container c=new Container();
		c.setLayout(null);
	
		la.setSize(200, 100);
		la.setLocation(30,30);
		
		c.add(la);
		add(c);
		setSize(600,600);
		setVisible(true);
		
		class MyMoustListener extends MouseAdapter {//KeyAdaptor 등등 Adaptor 사용법. 이전처럼 인터페이스 이용방식이 아님. 이게 더 간편할때도 많음
			public void mousePressed(MouseEvent e) {
				int x=e.getX();
				int y=e.getY();
				la.setLocation(x,y);
			}

				
		}
		

		
		
		c.addMouseListener(new MyMoustListener());

		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		
	}
	
	
	public static void main(String[] args) {
		guitest f=new guitest();
	}
}
