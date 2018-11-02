/*
  https://en.wikipedia.org/wiki/Conway%27s_Game_of_Life#Rules
                                *
     ***                        *
		                            *


 */
import javax.swing.*;
import java.awt.*;

public class GameOfLife extends JFrame {
  private byte[][] now;
	private byte[][] future;


  public void step() {
		//i,j
		// now[i-1][j-1] + now[i-1][j] + ...

    byte[][] temp = now;
		now = future;
		future = temp;
	}

	public void paint(Graphics g) {
		//    Graphics2 g2 = (Graphics2)g;

	}
	// kill by closing window
	public static void main(String[] args) {
		GameOfLife gol = new GameOfLife(800,800);
		for (;;) { // while(true)
			gol.step();
			gol.repaint();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
		}
	}

}
