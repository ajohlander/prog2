/* 
Inlupp 1, Programmeringsteknik II, Andreas Johlander
*/
import java.awt.*;
import javax.swing.*;

public class Box 
	extends JPanel {
  
	private int size;
	private int circNum;
	private Circle[] circleArray;

  
	public Box(int s,int n) {
		size = s;
		circNum = n;
		setPreferredSize(new Dimension(size,size));
		
//Fills array with circles
		this.circleArray = new Circle[circNum];
		for(int i=0; i<circNum; i++){
			
			double r = (Math.random()*(size/2-size/5)+size/5);
			int x = (int)Math.round(r*Math.cos(Math.PI*2*i/circNum));
			int y = (int)Math.round(r*Math.sin(Math.PI*2*i/circNum));
			Vector posTemp = new Vector(x,y); //Used for velocity calculation
			Vector pos = new Vector(x+size/2,y+size/2);
			Vector vel = new Vector((Math.random()+1.5)*size*y/(posTemp.dot(posTemp)),-(Math.random()+1.5)*size*x/(posTemp.dot(posTemp)));
			this.circleArray[i] = new Circle(this,3, pos, vel);
		}

	}	
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		this.setBackground(Color.BLACK);
		g.setColor(Color.YELLOW);
		g.fillOval(size/2-size/20, size/2-size/20,size/10 , size/10); //The Sun
		for(int i=0; i<circNum; i++){
			circleArray[i].paint(g);
		}
	}


	public void step(){ //Step function
		for(int i=0; i<circNum; i++){
			circleArray[i].move();
			
			Vector origin = new Vector(size/2,size/2);
			double distSun = (circleArray[i].getPos().sub(origin)).norm();
			if(distSun<=size/20){ //Collision with Sun
				removeCircle(i);
			}
		}
		for(int i = 0; i<circNum; i++){
			for(int j = 0; j<circNum; j++){
				if(i!=j && ((circleArray[i].getPos()).sub(circleArray[j].getPos())).norm() < circleArray[i].getR() + circleArray[j].getR()){ //Collision detection
					Circle cNew = circleArray[i].collide(circleArray[j]);
					circleArray[i] = null;
					circleArray[j] = null;
					this.addCircle(cNew);
					}
			}
		}
		repaint();
	}

	public int getWidth(){ //Could no be called getSize()...
		return this.size;
	}

	public void addCircle(Circle c){ //Adds a circle given that two circles are null
		int count = 0;
		Circle[] cTemp = new Circle[circNum];
		for(int i = 0; i<circNum; i++){
			if(circleArray[i]!=null){
				cTemp[count] = circleArray[i];
				count++;
			}
		}
		cTemp[circNum-2] = c;
		this.circleArray = cTemp;
		circNum--;
	}

	public void removeCircle(int index){
		circleArray[index] = null; //removes the circle
		int count = 0;
		Circle[] cTemp = new Circle[circNum];
		for(int i = 0; i<circNum; i++){
			if(circleArray[i]!=null){
				cTemp[count] = circleArray[i];
				count++;
			}
		}
		this.circleArray = cTemp;
		circNum--;
	}
	



}

