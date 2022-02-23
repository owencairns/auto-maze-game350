import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JComponent;

import java.awt.Graphics;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
import java.awt.Color;

public class Maze_GUI extends JComponent{
	
	public static void main(String[] args) {
		Maze_GUI board = new Maze_GUI();
		board.GUI();
	}

	public void GUI() {
		
        JFrame frame = new JFrame("Maze Game");
       // JPanel panel = new JPanel();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(50, 50, 800, 480);
        frame.getContentPane().add(new MyCanvas());
        frame.setVisible(true);
        frame.getContentPane().setBackground(Color.decode("#a5f1fa"));
        
	}
	
	@SuppressWarnings("serial")
	class MyCanvas extends JComponent 
	{
	    public void paint(Graphics g) 
	    {
	        g.fillRect (20, 20, 400, 400);
	    }
	}

	//reacts to player icon moving, e = anything
//	public void actionPerformed(ActionEvent e) {
//		// TODO Auto-generated method stub
//		
//	}

}
