/* 
Inlupp 1, Programmeringsteknik II, Andreas Johlander
*/
import java.awt.*;

public class Circle {
	private int radius; 
	private Vector pos;
	private Vector vel;
	private Box theBox;
	private Color c;
	
	
	public Circle(){ //No parameter constructor
		this.theBox = null;
		this.radius = 10;
		this.pos = new Vector(0,0);
		this.vel = new Vector(0,0);
		this.c = new Color((float)Math.random(),
                     (float)Math.random(),
                     (float)Math.random()); 
	}

	public Circle(Box b, int r, Vector pos, Vector vel){//Constructor with random color
		this.theBox = b;		
		this.radius = r;
		this.pos = pos;
		this.vel = vel;
       c = new Color((float)Math.random(),
                     (float)Math.random(),
                     (float)Math.random()); 
	}


	public Circle(Box b, int r, Vector pos, Vector vel,Color c){//Constructor with color
		this.theBox = b;		
		this.radius = r;
		this.pos = pos;
		this.vel = vel;
       	this.c = c;
	}

	public void move(){
		
			if(pos.getX()+radius > theBox.getWidth() && vel.getX()>0){ //Collision with wall
				this.bounce(2);
			}else if(pos.getX()-radius < 0 && vel.getX()<0){
				this.bounce(2);
			}

			if(pos.getY()+radius > theBox.getWidth() && vel.getY()>0){
				this.bounce(1);
			}else if(pos.getY()-radius < 0 && vel.getY()<0){
				this.bounce(1);
			}
			Vector origin = new Vector(theBox.getWidth()/2,theBox.getWidth()/2);
			Vector r = pos.sub(origin);
			Vector dv = r.mult(theBox.getWidth()/(20*r.dot(r))); //Gravity
			this.vel = vel.sub(dv);	//Explicit Euler
			this.pos = this.pos.add(this.vel);

	}

	public void bounce(int wall){
		//wall: 1.roof or floor 2.right or left
		if(wall==1){
			this.vel.setY(-this.vel.getY());
		} else if(wall==2){
			this.vel.setX(-this.vel.getX());
		}
	}
	
    public void paint(Graphics g) {
		int x = (int)pos.getX();
		int y = (int)pos.getY();
       g.setColor(c);
       g.fillOval(x-radius, y-radius, 2*radius, 2*radius);
    }


	public Circle collide(Circle c){ //Circle collision
		int r = (int)Math.round(Math.sqrt(Math.pow(radius,2) + Math.pow(c.radius,2))); //add areas
		double xPos = (this.pos.getX()*Math.pow(radius,2)+c.pos.getX()*Math.pow(c.radius,2))/(Math.pow(radius,2)+Math.pow(c.radius,2));
		double yPos = (this.pos.getY()*Math.pow(radius,2)+c.pos.getY()*Math.pow(c.radius,2))/(Math.pow(radius,2)+Math.pow(c.radius,2));
		//conservation of momentum		
		double xVel = (this.vel.getX()*Math.pow(radius,2)+c.vel.getX()*Math.pow(c.radius,2))/(Math.pow(radius,2)+Math.pow(c.radius,2));	
		double yVel = (this.vel.getY()+c.vel.getY())/2;
		Vector position = new Vector(xPos, yPos);
		Vector velocity = new Vector(xVel, yVel);


		Color col;
		if(this.radius>=c.radius){ //The largest circle keeps its color
			col = this.c;
		}else{
			col = c.c;
		}
		Circle cNew = new Circle(c.theBox,r, position, velocity, col);
		return cNew;
	}


	public Vector getPos(){
		return this.pos;
	}

	public Vector getVel(){
		return this.vel;
	}

	public int getR(){
		return this.radius;
	}

	public void setPos(Vector v){
		this.pos = v;
	}

	public void setVel(Vector v){
		this.vel = v;
	}
			
}
