package model.type;

import java.io.IOException;

import javax.imageio.ImageIO;

import model.Block;
import model.Model;

public class Diamond extends Block {

	private boolean falling = false;
  // Constructeur
	public Diamond(int posX, int posY) {
    super(posX, posY);
    try {
    	this.setSprite(ImageIO.read(Model.class.getResource("/diamond.png")));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }
	
	public void walkOn() {
		try {
	    	this.setSprite(ImageIO.read(Model.class.getResource("/voidGround.png")));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public boolean isFalling() {
		return falling;
	}

	public void setFalling(boolean falling) {
		this.falling = falling;
	}
	
	
  
}
