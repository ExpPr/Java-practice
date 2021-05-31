import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class guitest extends JFrame {
	int x=150,y=150;
	
	public guitest() {
		setTitle("자동차 움직이기");
		setSize(600,300);
		JButton button=new JButton("");
		ImageIcon icon=new ImageIcon("D:\\cars\\car.jpg");
		button.setIcon(icon);
		button.setLocation(x,y);
		
		JPanel panel=new JPanel();
		panel.add(button);
		panel.requestFocus();
		panel.setFocusable(true);
		
		panel.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				x=e.getX()-100;
				y=e.getY()-58;
				button.setLocation(x,y);
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		

		
		add(panel);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		
	}
	
	
	public static void main(String[] args) {
		guitest f=new guitest();
	}
}
