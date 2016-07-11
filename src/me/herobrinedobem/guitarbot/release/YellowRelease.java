package me.herobrinedobem.guitarbot.release;

import java.awt.AWTException;
import java.awt.Robot;
import me.herobrinedobem.guitarbot.press.YellowPress;

public class YellowRelease implements Runnable{

	private YellowPress press;
	
	public YellowRelease(YellowPress press) {
		this.press = press;
	}
	
	@Override
	public void run() {
		try{
			while(true){
				if(press.isYellowApertado()){
					Robot robo = new Robot();
					robo.keyRelease(74);
					press.setYellowApertado(false);
					System.out.println("[AMARELO] Soltou");
				}
			}
		} catch (AWTException e) {
			e.printStackTrace();
		}
	}

}
