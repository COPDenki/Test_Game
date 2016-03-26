package base;

import java.awt.Color;

import base.custom_blocks.DamageBlock;
import fr.pwal.graphics.base.Application;
import fr.pwal.level.Block;
import fr.pwal.level.Level;
import fr.pwal.level.Player;

public class Main {
	public static void main(String args[]) {
		Block[] blocks = { new DamageBlock('A', "/ressources/textures/blocks/grass_side.png"), new Block('B', "/ressources/textures/blocks/sand.png"),
						new Block('C', "/ressources/textures/blocks/cobblestone.png"), new Block('D', "/ressources/textures/blocks/stone_slab_side.png"),
						new Block('E', "/ressources/textures/blocks/door_wood_lower.png"), new Block('F', "/ressources/textures/blocks/door_wood_upper.png"), 
						new Block('G', "/ressources/textures/blocks/door_iron_lower.png"), new Block('H', "/ressources/textures/blocks/door_iron_upper.png"), 
						new Block('I', "/ressources/textures/blocks/wool_colored_light_blue.png"),new Block('J', "/ressources/textures/blocks/dirt.png") };

		Application app = new Application("Test", 950, 400, 2.0f,  new Level("/ressources", blocks, new Player[] { new Player("Gagoi", "/ressources/textures/sonic.png", new int[] { 90, 81, 83, 68, 32 }, Color.BLUE), new Player("Denki", "/ressources/textures/knuckles.png", new int[] { 38, 37, 40, 39, 96 }, Color.RED) }));

		// try {
		// app.add(new
		// PWAL_Picture(ImageIO.read(Main.class.getResource("/sonic.png")), 0,
		// 0));
		// } catch (IOException e) {
		// e.printStackTrace();
		// }
	}
}
