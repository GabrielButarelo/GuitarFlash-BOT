package me.herobrinedobem.guitarbot.press;

import java.awt.AWTException;
import java.awt.Robot;

public class YellowPress implements Runnable{
	
	private boolean yellowApertado = false;
	private String cor;
	
	public YellowPress(String cor) {
		this.cor = cor;
	}
	
	@Override
	public void run() {
		try{
			while(true){
				Robot robo = new Robot();
				if(!robo.getPixelColor(425, 575).toString().equals(cor) && !robo.getPixelColor(425, 575).toString().contains("java.awt.Color[r=255,g=1")){
					robo.keyPress(74);
					yellowApertado = true;
					System.out.println("[AMARELO] Apertou");
				}
			}
		} catch (AWTException e) {
			e.printStackTrace();
		} 
	}
	
	public boolean isYellowApertado() {
		return yellowApertado;
	}
	
	public void setYellowApertado(boolean yellowApertado) {
		this.yellowApertado = yellowApertado;
	}
	
}
