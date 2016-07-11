package me.herobrinedobem.guitarbot;

import java.awt.AWTException;
import java.awt.Robot;

public class Special implements Runnable{
	
	private boolean specialApertado = false;

	private String cor;
	
	public Special(String cor) {
		this.cor = cor;
	}
	
	@Override
	public void run() {
		try{
			while(true){
				Robot robo = new Robot();
				if(!robo.getPixelColor(600, 535).toString().equals(cor) && specialApertado == false){
					robo.keyPress(32);
					specialApertado = true;
					System.out.println("[ESPECIAL] Ativado");
				} else {
					if(specialApertado){
						robo.keyRelease(32);
						specialApertado = false;
					}
				}
			}
		} catch (AWTException e) {
			e.printStackTrace();
		}
	}
	
}
