
public class PlayerBullet extends Character{
	public PlayerBullet(double x, double y, double  vx, double vy)
	{
		// Character
		super (x,y,vx,vy);
	}
	public void draw (MyFrame f) {
		f.setColor(0,128,0);
		f.fillRect(x, y+20, 10, 20);
		
	}

}
