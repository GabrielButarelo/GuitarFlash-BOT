package me.herobrinedobem.guitarbot.press;

import java.awt.AWTException;
import java.awt.Robot;

public class GreenPress implements Runnable{
	
	private boolean greenApertado = false;

	private String cor;
	
	public GreenPress(String cor) {
		this.cor = cor;
	}
	
	@Override
	public void run() {
		try{
			while(true){
				Robot robo = new Robot();
				if(!robo.getPixelColor(268, 575).toString().equals(cor)){
					robo.keyPress(65);
					greenApertado = true;
					System.out.println("[VERDE] Apertou");
				}
			}
		} catch (AWTException e) {
			e.printStackTrace();
		}
	}

	public boolean isGreenApertado() {
		return greenApertado;
	}
	
	public void setGreenApertado(boolean greenApertado) {
		this.greenApertado = greenApertado;
	}
	
}
