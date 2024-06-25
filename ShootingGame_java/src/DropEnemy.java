
public class DropEnemy extends Enemy{
	int life =5;
	public DropEnemy(double x, double y, double vx, double vy) {
		super (x,y, vx,vy);
	}
	public void move() {
		super.move();
		vy=vy+0.1;
	}

}
