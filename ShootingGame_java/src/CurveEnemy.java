
public class CurveEnemy extends Enemy{
	int life =4;
	public void draw (MyFrame f) {
		f.setColor(128,128,128);
		f.fillOval(x, y, 30, 30);
		f.setColor(250,250,250);
		f.fillOval(x+5, y, 20, 30);
		


		
		
	}
	public CurveEnemy (double x, double y, double vx, double vy) {
		super(x, y, vx, vy);
	}
	public void move() {
		super.move();
		if (x<GameWorld.player.x) {
			x++;//
		}
		if (x>GameWorld.player.x) {
			//
			x--;}
	}

}
