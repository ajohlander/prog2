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
		//System.out.println(circleArray.size());  
		setPreferredSize(new Dimension(size,size));
		
//Fills array with circles
		//this.circleArray = new Circle[circNum];
		for(int i=0; i<circNum; i++){
			
			double r = (Math.random()*(size/2-size/5)+size/5);
			int x = (int)Math.round(r*Math.cos(Math.PI*2*i/circNum));
			int y = (int)Math.round(r*Math.sin(Math.PI*2*i/circNum));
			Vector posTemp = new Vector(x,y); //Used for velocity calculation
			Vector pos = new Vector(x+size/2,y+size/2);
			Vector vel = new Vector((Math.random()+1.5)*size*y/(posTemp.dot(posTemp)),-(Math.random()+1.5)*size*x/(posTemp.dot(posTemp)));
			//this.circleArray[i] = new Circle(this,3, pos, vel);
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
				//removeCircle(i);
				circleArray.remove(i);
				circNum--;
			}
		}

		ArrayList<Circle> circCopy = circleArray;//new ArrayList<Circle>(circNum);
		//ArrayList<Circle> circAdd = new ArrayList<Circle>();
		//ArrayList<Integer> ind = new ArrayList<Integer>();
		int count = 0;

		for(int i = 0; i<circleArray.size(); i++){
			//boolean coll = false;
			for(int j = 0; j<circleArray.size(); j++){
				if(i!=j && ((circleArray.get(i).getPos()).sub(circleArray.get(j).getPos())).norm() < circleArray.get(i).getR() + circleArray.get(j).getR()){ //Collision detection
					System.out.println("This");
					//Circle cNew = circleArray.get(i).collide(circleArray.get(j));
					System.out.println("is");
					if(circCopy.get(i) != null){
						circCopy.set(i,null);
					}
					System.out.println("sparta");
					if(circCopy.get(j) != null){
						circCopy.set(j,null);
					}
					System.out.println("!");
					//circCopy.add(cNew);
					System.out.println("lool");
				}
			}
		}
//		int ds = circCopy.size();
		//circCopy.set(0,null);
		System.out.println("a: " + circCopy.size());
		while(circCopy.remove(null));
		System.out.println("b: " + circCopy.size());

		this.circleArray = circCopy;
System.out.println("1");
		circNum = circleArray.size();
System.out.println("2");
		System.out.println(circNum);
		repaint();
		for(int i = 0; i<circleArray.size(); i++){
			if(circleArray.get(i) == null){
				System.out.println("This is null");
			}
		}
		System.out.println("dssfdsf");
	}

	public int getWidth(){ //Could no be called getSize()...
		return this.size;
	}

	/*public void addCircle(Circle c){ //Adds a circle given that two circles are null
		int count = 0;
		Circle[] cTemp = new Circle[circNum];
		for(int i = 0; i<circNum; i++){
			if(circleArray.get(i)!=null){
				cTemp[count] = circleArray.get(i);
				count++;
			}
		}
		cTemp[circNum-2] = c;
		this.circleArray = cTemp;
		circNum--;
	}*/

/*
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
	}*/
	



}

