
public class StraightEnemy extends Enemy{
	int life =5;
	public void draw (MyFrame f) {
		f.setColor(128,128,128);
		f.fillRect(x+8, y, 14, 14);
		
		f.fillRect(x+10, y+15, 10, 15);
		
		
		
		
	}
	public StraightEnemy(double x, double y, double vx, double vy ) {
	super (x,y,vx,vy);
	}

}
