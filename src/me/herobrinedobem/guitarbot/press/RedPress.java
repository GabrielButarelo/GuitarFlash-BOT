package me.herobrinedobem.guitarbot.press;

import java.awt.AWTException;
import java.awt.Robot;

public class RedPress implements Runnable{
	
	private boolean redApertado = false;
	private String cor;
	
	public RedPress(String cor) {
		this.cor = cor;
	}
	
	@Override
	public void run() {
		try{
			while(true){
				Robot robo = new Robot();
				if(!robo.getPixelColor(345, 575).toString().equals(cor)){
					robo.keyPress(83);
					redApertado = true;
					System.out.println("[VERMELHO] Apertou");
				}
			}
		} catch (AWTException e) {
			e.printStackTrace();
		} 
	}
	
	
	public boolean isRedApertado() {
		return redApertado;
	}
	
	public void setRedApertado(boolean redApertado) {
		this.redApertado = redApertado;
	}
	
}
