import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Change extends JFrame{
	
	ChangeMess M = new ChangeMess("Java is fun");//new object "Java is fun"
	
	public Change(){
		add(M);//constructor
	}
	
	

	
	class ChangeMess extends JPanel{
		private String message = "Java is fun";//initial the message
		private int x = 80;//set x,y location
		private int y = 100;
		private boolean a = true;
		
		
		public ChangeMess(String s){
			message = s;
			addMouseListener(new MouseAdapter(){
				public void mouseClicked(MouseEvent e){
					a = !a;
					if(!a)
						message = "Java is powerful";// press your mouse and it will change "Java is fun"
					else
						message = "Java is fun";
					repaint();
				}
			});
			
			
		}
		
		@Override
		protected void paintComponent(Graphics g){
			super.paintComponent(g);
			g.drawString(message, x, y);//paint the result
		}
	
		
	}
	public static void main(String[] args) {
		Change frame = new Change();
		frame.setTitle("c8c8");//title
		frame.setSize(200,200);//size
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);//visible
	}
	

}
