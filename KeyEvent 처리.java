import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class guitest extends JFrame {
	int n1,n2,n3;
	JButton bt1,bt2,bt3;
	
	public guitest() {
		setTitle("숫자 생성 프로그램");
		setSize(300,150);
		JPanel panel=new JPanel();
		
		bt1=new JButton(""+n1);
		bt2=new JButton(""+n2);
		bt3=new JButton(""+n3);
		
		panel.add(bt1);
		panel.add(bt2);
		panel.add(bt3);
		
		panel.requestFocus();//키 리스너는 반드시 이 focus가 선행되어야 함. 25,26번줄 2개다 구현해야함
		panel.setFocusable(true);
		
		panel.addKeyListener(new KeyListener() {//키 리스너는 3가지 추상 메소드 일단 구현은 해야한다. 3개 다.

			@Override
			public void keyTyped(KeyEvent e) {	
			}

			@Override
			public void keyPressed(KeyEvent e) {
				int keycode=e.getKeyCode();
				
				if(keycode==KeyEvent.VK_ENTER) {
					n1=(int)(Math.random()*10);
					n2=(int)(Math.random()*10);
					n3=(int)(Math.random()*10);
					
					bt1.setText(""+n1);
					bt2.setText(""+n2);
					bt3.setText(""+n3);
				
			}
			}

			@Override
			public void keyReleased(KeyEvent e) {
			}

		});
		
		add(panel);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
	}
	
	
	public static void main(String[] args) {
		guitest f=new guitest();
	}
}
