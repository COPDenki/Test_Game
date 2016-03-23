package base;

import fr.pwal.graphics.base.Application;
import fr.pwal.level.Block;
import fr.pwal.level.Level;
import fr.pwal.level.Player;

public class Main {
	public static void main(String args[]) {
		Application app = new Application("Test", 1280, 500);

		Block[] blocks = { new Block('A', "/ressources/textures/A.png"), new Block('B', "/ressources/textures/B.png"),
				new Block('C', "/ressources/textures/C.png"), new Block('D', "/ressources/textures/D.png"),
				new Block('E', "/ressources/textures/E.png"), new Block('F', "/ressources/textures/F.png") };
		app.add(new Level("/ressources", blocks, new Player[]{new Player("Gagoi", "/sonic.png", new int[]{1, 2, 3, 4})}));

		// try {
		// app.add(new
		// PWAL_Picture(ImageIO.read(Main.class.getResource("/sonic.png")), 0,
		// 0));
		// } catch (IOException e) {
		// e.printStackTrace();
		// }
	}
}
