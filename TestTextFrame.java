import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TestTextFrame extends JFrame {
	
	private Enter TestText  = new Enter("HIHI");
	public static void main(String[] args) {

    TestTextFrame frame = new TestTextFrame();
    frame.setTitle("TestTextFrame");
    frame.setSize(300, 300);
    frame.setLocationRelativeTo(null); 
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
	public TestTextFrame(){
		JTextField jtf = new JTextField("Enter your word");
		JPanel panel = new JPanel();
		
		setLayout(new BorderLayout(10,30));
		add(panel,BorderLayout.CENTER);
		panel.add(jtf);
		panel.add(TestText);
		TestText.setFocusable(true);
	}
	static class Enter extends JPanel {
		private int x=80;
		private int y=80;
		private boolean b = true;
		private String message ="";
		
		
		public Enter(String s){
			
			addKeyListener(new KeyAdapter(){
				@Override
				public void keyPressed(KeyEvent e){
					if (e.getKeyCode() == KeyEvent.VK_ENTER){
						message=s;
						System.out.println(message);
					}
				}
				
			
			
			
			});
			
			
			
		}
		@Override 
			protected void paintComponent(Graphics g){
				super.paintComponent(g);
				g.drawString(message, x, y);//paint the result
			}
	}
	
}
