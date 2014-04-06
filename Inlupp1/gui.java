/* 
Inlupp 1, Programmeringsteknik II, Andreas Johlander

En mer eller mindre bra modellerad 2-D protoplanetär disk med små planetesimaler i omloppsbana kring en sol. De kan kollidera och bilda större planeter. Om planeterna träffar kanten på fönstret studsar de. Om de träffar solen förintas de. Denna fil innehåller main-metoden, det finns också klasserna Window, Box, Circle och Vector. I GUI:n finns det tre fält där man kan definera storlek på fönstret, antal cirklar och längden på sleepen i timern. Det finns också fyra knappar: "Start" skapar en ny simulering om ingen är igång och återupptar om den är pausad, "Pause" pausar simuleringen, "Quit" stänger hela programmet och "Stop" stänger simuleringsfönstret.
*/



import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.util.Scanner;

public class gui
	extends JFrame
	implements ActionListener
	{

	private JLabel lab1 = new JLabel("Window size ");
	private JLabel lab2 = new JLabel("Number of circles ");
	private JLabel lab3 = new JLabel("Delay ");
	
	private JTextField text1 = new JTextField("1000",10);
	private JTextField text2 = new JTextField("150",10);
	private JTextField text3 = new JTextField("30",10);

	private JButton startB = new JButton("Start");
	private JButton quitB = new JButton("Quit");
	private JButton pauseB = new JButton("Pause");
	private JButton stopB = new JButton("Stop");
	private Window win;

	


	public gui() { //Constructor
		this.setLayout(new FlowLayout());
		startB.addActionListener(this);
		quitB.addActionListener(this);
		pauseB.addActionListener(this);
		stopB.addActionListener(this);
		
				
		this.add(lab1);
		this.add(text1);
		this.add(lab2);
		this.add(text2);
		this.add(lab3);
		this.add(text3);



		this.add(startB);
		this.add(quitB);
		this.add(pauseB);
		this.add(stopB);

		this.setPreferredSize(new Dimension(300,200));
		this.pack();
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent e) {
    	Scanner sc1 = new Scanner(text1.getText());
    	Scanner sc2 = new Scanner(text2.getText());
		Scanner sc3 = new Scanner(text3.getText());

		if (sc1.hasNextInt() && sc2.hasNextInt() && sc3.hasNextInt()) { 
			int winSize = sc1.nextInt();
			int circNum = sc2.nextInt();
			int delay = sc3.nextInt();

			if (e.getSource() == startB){ //Actions depending on button
			if(win==null){
				this.win = new Window("Simulation",winSize,circNum,delay);
				
				this.win.setVisible( true ); 
				this.win.pack();
			}else{
				this.win.start();
			}

			}else if(e.getSource() == quitB){
				if(win==null){
					this.dispose();
				}else{				
					win.dispose();
					this.dispose();
				}
			}else if(e.getSource() == pauseB){
				this.win.pause();
			}else if (e.getSource() == stopB){
				win.dispose();
				win = null;
			}
		}
	}


				



	public static void main(String[] arg) { //Main method
		gui ma = new gui();
	}
}
