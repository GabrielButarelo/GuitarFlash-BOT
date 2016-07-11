package me.herobrinedobem.guitarbot.release;

import java.awt.AWTException;
import java.awt.Robot;
import me.herobrinedobem.guitarbot.press.GreenPress;

public class GreenRelease implements Runnable{

	private GreenPress press;
	
	public GreenRelease(GreenPress press) {
		this.press = press;
	}
	
	@Override
	public void run() {
		try{
			while(true){
				if(press.isGreenApertado()){
					Robot robo = new Robot();
					robo.keyRelease(65);
					press.setGreenApertado(false);
					System.out.println("[VERDE] Soltou");
				}
			}
		} catch (AWTException e) {
			e.printStackTrace();
		}
	}

}
