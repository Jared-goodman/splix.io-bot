import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JOptionPane;
public class Bot implements KeyListener{
	@Override
	public void keyPressed(KeyEvent e) {
		System.exit(0);
	}
	public static void main(String[] args)throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Press the \"OK\" button to start the bot.");
		Robot bot = new Robot();
		Thread.sleep(1000);
		
		//These are just to make code easier to read and to use:
		int up = KeyEvent.VK_UP;
		int down = KeyEvent.VK_DOWN;
		int left = KeyEvent.VK_LEFT;
		int right = KeyEvent.VK_RIGHT;
		int[] upDirection = {up, right, up, down, left};
		int[] rightDirection = {right, down, right, left, up};
		int[] downDirection = {down, left, down, up, right};
		int[] leftDirection = {left, up, left, right, down};
		int count = 1;
		int[] currentDirection = upDirection;
		while(true) {
			//Change of direction:
			if(count % 50 == 0) {
				bot.keyPress(currentDirection[3]);
				Thread.sleep(500);
				bot.keyRelease(currentDirection[3]);
			}
			if(count<200) currentDirection = leftDirection;
			if(count<150) currentDirection = downDirection;
			if(count<100) currentDirection = rightDirection;
			if(count<50) currentDirection = upDirection;
			
			if(count>400) count = 0;
			//Key presses:
			bot.keyPress(currentDirection[0]);
			Thread.sleep(200);
			bot.keyRelease(currentDirection[0]);
			bot.keyPress(currentDirection[1]);
			bot.keyRelease(currentDirection[1]);
			Thread.sleep(400);
			bot.keyPress(currentDirection[2]);
			Thread.sleep(200);
			bot.keyRelease(currentDirection[2]);
			bot.keyPress(currentDirection[3]);
			bot.keyRelease(currentDirection[3]);
			Thread.sleep(200);
			bot.keyPress(currentDirection[4]);
			bot.keyRelease(currentDirection[4]);
			Thread.sleep(400);
			count ++;
		}
	}
	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	

}
