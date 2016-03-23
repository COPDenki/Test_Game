package base;
import fr.pwal.graphics.base.Application;
import fr.pwal.level.Block;
import fr.pwal.level.Level;

public class Main {
	public static void main(String args[]){
		Application app = new Application("Test", 1280, 500);
		
		Block[] blocks = {new Block('A', "/ressources/textures/A.png"), new Block('B', "/ressources/textures/B.png")};
		app.add(new Level("/ressources", blocks));
		
//		try {
//			app.add(new PWAL_Picture(ImageIO.read(Main.class.getResource("/sonic.png")), 0, 0));
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
	}
}
