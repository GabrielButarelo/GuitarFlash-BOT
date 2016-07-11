package me.herobrinedobem.guitarbot.release;

import java.awt.AWTException;
import java.awt.Robot;
import me.herobrinedobem.guitarbot.press.RedPress;

public class RedRelease implements Runnable{

	private RedPress press;
	
	public RedRelease(RedPress press) {
		this.press = press;
	}
	
	@Override
	public void run() {
		try{
			while(true){
				if(press.isRedApertado()){
					Robot robo = new Robot();
					robo.keyRelease(83);
					press.setRedApertado(false);
					System.out.println("[VERMELHO] Soltou");
				}
			}
		} catch (AWTException e) {
			e.printStackTrace();
		}
	}

}
