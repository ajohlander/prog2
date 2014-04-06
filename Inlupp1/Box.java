/* 
Inlupp 1, Programmeringsteknik II, Andreas Johlander
*/
import java.awt.*;
import javax.swing.*;
import java.util.ArrayList;

public class Box 
	extends JPanel {
  
	private int size;
	private int circNum;
	private ArrayList<Circle> circleArray;// = new ArrayList<Circle>(100);

  
	public Box(int s,int n) {
		size = s;
		circNum = n;
		circleArray = new ArrayList<Circle>(circNum);  
		setPreferredSize(new Dimension(size,size));
		
//Fills array with circles
		for(int i=0; i<circNum; i++){
			
			double r = (Math.random()*(size/2-size/5)+size/5);
			int x = (int)Math.round(r*Math.cos(Math.PI*2*i/circNum));
			int y = (int)Math.round(r*Math.sin(Math.PI*2*i/circNum));
			Vector posTemp = new Vector(x,y); //Used for velocity calculation
			Vector pos = new Vector(x+size/2,y+size/2);
			Vector vel = new Vector((Math.random()+1.5)*size*y/(posTemp.dot(posTemp)),-(Math.random()+1.5)*size*x/(posTemp.dot(posTemp)));
			this.circleArray.add(new Circle(this,3, pos, vel));
		}

	}	
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		this.setBackground(Color.BLACK);
		g.setColor(Color.YELLOW);
		g.fillOval(size/2-size/20, size/2-size/20,size/10 , size/10); //The Sun
		for(int i=0; i<circNum; i++){
			circleArray.get(i).paint(g);
		}
	}


	public void step(){ //Step function
		for(int i=0; i<circNum; i++){
			circleArray.get(i).move();
			
			Vector origin = new Vector(size/2,size/2);
			double distSun = (circleArray.get(i).getPos().sub(origin)).norm();
			if(distSun<=size/20){ //Collision with Sun
				circleArray.remove(i);
				circNum--;
			}
		}

		ArrayList<Circle> circCopy = new ArrayList<Circle>(circNum);
		ArrayList<Integer> ind = new ArrayList<Integer>(circNum);
		ArrayList<Integer> colInd = new ArrayList<Integer>(1);
		int count = 0;
		

		for(int i = 0; i<circleArray.size(); i++){
			int colCount = 0;
			for(int j = 0; j<circleArray.size(); j++){
				if(i!=j && ((circleArray.get(i).getPos()).sub(circleArray.get(j).getPos())).norm() < circleArray.get(i).getR() + circleArray.get(j).getR()){ //Collision detection
					colCount++; //Registers collision
					if(!colInd.contains(j)){
						colInd.add(i);
						Circle cNew = circleArray.get(i).collide(circleArray.get(j));
						circCopy.add(cNew);
					}
				}
			}
			if(colCount==0 && !ind.contains(i)){
				ind.add(i);
			}
		}

		for(int k = 0; k<ind.size(); k++){
			circCopy.add(circleArray.get(ind.get(k)));
		}
		
		circleArray = circCopy;

		circNum = circleArray.size();
		repaint();
	}

	public int getWidth(){ //Could no be called getSize()...
		return this.size;
	}





}

