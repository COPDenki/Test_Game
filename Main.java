import java.awt.Color;
import java.io.IOException;

import javax.imageio.ImageIO;

import fr.pwal.graphics.base.Application;
import fr.pwal.graphics.base.graphics.window.PWAL_Label;
import fr.pwal.graphics.base.graphics.window.PWAL_Picture;

public class Main {
	public static void main(String args[]){
		Application app = new Application("Test", 500, 500);
		app.add(new PWAL_Label("TESTETESTETETETETETE", 50, 50).setColor(Color.BLUE));
		try {
			app.add(new PWAL_Picture(ImageIO.read(Main.class.getResource("/sonic.png")), 0, 0));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
