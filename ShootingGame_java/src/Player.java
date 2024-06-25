
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
public class Player  extends Character implements KeyListener{
	
	public Player(double x, double y, double vx, double vy) {
		super(x, y, vx, vy);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public void draw (MyFrame f){
		f.setColor(0, 128,0);
		f.fillRect(x, y+20, 30, 10);
		f.setColor(200, 200,0);
		f.fillRect(x+10, y, 10, 30);
		
		
	}
	
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode()==KeyEvent.VK_LEFT) {
			vx=-5;
		}
		if (e.getKeyCode()==KeyEvent.VK_RIGHT) {
			vx=5;
			}
		
		if (e.getKeyCode()==KeyEvent.VK_SPACE) {
			
			GameWorld.playerBullets.add(new PlayerBullet(x,y,5,-10));
			GameWorld.playerBullets.add(new PlayerBullet(x,y,0,-10));
			GameWorld.playerBullets.add(new PlayerBullet(x,y,-5,-10));
			
			System.out.println("の数"+GameWorld.playerBullets.size());
		}
		if (e.getKeyCode()==KeyEvent.VK_ENTER) {
			System.out.println("Enterキーが押されました");
			GameWorld.enterPressed=true;
		}
	}
	public void keyRelrased(KeyEvent e) {
		if (e.getKeyCode()==KeyEvent.VK_LEFT) {
			vx=0;}
		
		if (e.getKeyCode()==KeyEvent.VK_LEFT) {
			vx=0;}
	}

	public void keyTyped(KeyEvent e) {}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		
	}
	
	

}
