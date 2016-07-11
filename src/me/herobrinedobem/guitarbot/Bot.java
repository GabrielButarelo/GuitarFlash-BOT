package me.herobrinedobem.guitarbot;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.IOException;
import me.herobrinedobem.guitarbot.press.GreenPress;
import me.herobrinedobem.guitarbot.press.RedPress;
import me.herobrinedobem.guitarbot.press.YellowPress;
import me.herobrinedobem.guitarbot.release.GreenRelease;
import me.herobrinedobem.guitarbot.release.RedRelease;
import me.herobrinedobem.guitarbot.release.YellowRelease;

public class Bot {

	public Bot() throws AWTException, IOException {
		Robot r = new Robot();
		System.out.println(r.getPixelColor(268, 575).toString());
		GreenPress green = new GreenPress(r.getPixelColor(268, 575).toString());
		Thread t1 = new Thread(green);
		Thread t11 = new Thread(new GreenRelease(green));
		
		RedPress red = new RedPress(r.getPixelColor(345, 575).toString());
		Thread t2 = new Thread(red);
		Thread t22 = new Thread(new RedRelease(red));
		
		YellowPress yellow = new YellowPress(r.getPixelColor(425, 575).toString());
		Thread t3 = new Thread(yellow);
		Thread t33 = new Thread(new YellowRelease(yellow));
		
		
		Thread t4 = new Thread(new Special(r.getPixelColor(600, 535).toString()));
	
		
		t1.start();
		t11.start();
		t2.start();
		t22.start();
		t3.start();
		t33.start();
		t4.start();
	}
	
	public static void main(String[] args) throws AWTException, IOException {
		new Bot();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}