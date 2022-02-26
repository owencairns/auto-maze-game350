package mazeGame;

import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JComponent;

import java.awt.Graphics;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Font;

public class Maze_GUI extends JComponent{
	
	private int difficulty = 9;
	generateMaze newMaze = new generateMaze();
	private int [][] maze = newMaze.mazeGen(difficulty);
	
	/*
	 * runs the GUI
	 */
	public static void main(String[] args) {
		Maze_GUI board = new Maze_GUI();
		board.GUI();
	}

	/*
	 * creates the GUI for the entire program
	 * adds different swing components to the GUI
	 */
	public void GUI() {
		
		JFrame frame = new JFrame("Maze Game");
	       // JPanel panel = new JPanel();
	        JLabel turns = new JLabel("Turns: ");
	        JLabel diff = new JLabel("Difficulty: ");
	        JLabel h4help = new JLabel("'H' for Help ");
	        JLabel menu = new JLabel("'M' for Menu");
	        JLabel quit = new JLabel("'Q' for Quit");
	        turns.setBounds(450, 20, 800, 100);
	        turns.setFont(new Font("Arial", Font.PLAIN, 32)); 
	        diff.setBounds(450, 20, 800, 250);
	        diff.setFont(new Font("Arial", Font.PLAIN, 32)); 
	        h4help.setBounds(450, 20, 800, 400);
	        h4help.setFont(new Font("Arial", Font.PLAIN, 32)); 
	        menu.setBounds(450, 20, 800, 550);
	        menu.setFont(new Font("Arial", Font.PLAIN, 32)); 
	        quit.setBounds(450, 20, 800, 700);
	        quit.setFont(new Font("Arial", Font.PLAIN, 32)); 
	        frame.add(turns);
	        frame.add(diff);
	        frame.add(h4help);
	        frame.add(menu);
	        frame.add(quit);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setBounds(50, 50, 800, 480);
	        frame.getContentPane().add(new MyCanvas());
	        frame.setVisible(true);
	        frame.getContentPane().setBackground(Color.decode("#a5f1fa"));      
	}
	
	/*
	 * takes the generated maze and displays it
	 * loops through the generated maze in array format, and outputs the values as colored tiles
	 */
	@SuppressWarnings("serial")
	class MyCanvas extends JComponent 
	{
	    public void paint(Graphics g) 
	    {
	        //g.fillRect (20, 20, 400, 400);
	        
	        for (int row = 0; row < maze.length; row++) {
	        	for (int col = 0; col < maze[0].length; col++) {
	        		Color color;
	        		switch (maze[row][col]) {
	        		case 0: color = Color.BLACK; break;
	        		case 9: color = Color.RED; break;
	        		default: color = Color.WHITE;
	        		}
	        		g.setColor(color);
	        		g.fillRect(400/difficulty*col + 20, 400/difficulty*row + 20, 400/difficulty, 400/difficulty);
	        		g.setColor(Color.BLACK);
	        		g.drawRect(400/difficulty*col + 20, 400/difficulty*row + 20, 400/difficulty, 400/difficulty); 
	        	}
	        }
	    }
	}

	//reacts to player icon moving, e = anything
//	public void actionPerformed(ActionEvent e) {
//		// TODO Auto-generated method stub
//		
//	}

}
