package base;

import java.awt.Color;

import base.custom_blocks.DamageBlock;
import fr.pwal.base.physic.Gravity;
import fr.pwal.graphics.base.Application;
import fr.pwal.level.Block;
import fr.pwal.level.Level;
import fr.pwal.level.LevelChain;
import fr.pwal.level.Player;

public class Main {
	public static void main(String args[]) {
		Block[] blocks = { new DamageBlock('A', "/ressources/textures/blocks/grass_side.png"), new Block('B', "/ressources/textures/blocks/sand.png"),
						new Block('C', "/ressources/textures/blocks/cobblestone.png"), new Block('D', "/ressources/textures/blocks/stone_slab_side.png"),
						new Block('E', "/ressources/textures/blocks/door_wood_lower.png", false), new Block('F', "/ressources/textures/blocks/door_wood_upper.png", false),
						new Block('G', "/ressources/textures/blocks/door_iron_lower.png", false), new Block('H', "/ressources/textures/blocks/door_iron_upper.png", false),
						new Block('I', "/ressources/textures/blocks/wool_colored_light_blue.png", false), new Block('J', "/ressources/textures/blocks/dirt.png") };

		//		Application app = new Application("Test", 950, 400, 2.0f, new Level(Gravity.GRAVITY_DOWN, "/ressources", blocks,
		//				new Player[] { new Player("Gagoi", 50, "/ressources/textures/characters/Sprite1.png", new int[] { 90, 81, 83, 68, 32 }, Color.BLUE),
		//								new Player("Denki_le_moche", 50, "/ressources/textures/characters/Sprite2.png", new int[] { 38, 37, 40, 39, 96 }, Color.PINK)
		//	}));

		Level[] levels = {
						new Level(Gravity.GRAVITY_DOWN, "/ressources/levels/World0/0", blocks), 
						new Level(Gravity.GRAVITY_DOWN, "/ressources/levels/World0/1", blocks), 
						new Level(Gravity.GRAVITY_DOWN, "/ressources/levels/World0/2", blocks), 
						new Level(Gravity.GRAVITY_DOWN, "/ressources/levels/World0/3", blocks), 
						new Level(Gravity.GRAVITY_DOWN, "/ressources/levels/World0/4", blocks), 
						new Level(Gravity.GRAVITY_DOWN, "/ressources/levels/World0/5", blocks), 
						new Level(Gravity.GRAVITY_DOWN, "/ressources/levels/World0/6", blocks),
						new Level(Gravity.GRAVITY_DOWN, "/ressources/levels/World0/7", blocks),
						new Level(Gravity.GRAVITY_DOWN, "/ressources/levels/World0/8", blocks),
						new Level(Gravity.GRAVITY_DOWN, "/ressources/levels/World0/9", blocks),
						
						new Level(Gravity.GRAVITY_DOWN, "/ressources/levels/World1/0", blocks), 
						new Level(Gravity.GRAVITY_DOWN, "/ressources/levels/World1/1", blocks), 
						new Level(Gravity.GRAVITY_DOWN, "/ressources/levels/World1/2", blocks), 
						new Level(Gravity.GRAVITY_DOWN, "/ressources/levels/World1/3", blocks), 
						new Level(Gravity.GRAVITY_DOWN, "/ressources/levels/World1/4", blocks), 
						new Level(Gravity.GRAVITY_DOWN, "/ressources/levels/World1/5", blocks), 
						new Level(Gravity.GRAVITY_DOWN, "/ressources/levels/World1/6", blocks),
						new Level(Gravity.GRAVITY_DOWN, "/ressources/levels/World1/7", blocks),
						new Level(Gravity.GRAVITY_DOWN, "/ressources/levels/World1/8", blocks),
						new Level(Gravity.GRAVITY_DOWN, "/ressources/levels/World1/9", blocks),
						
						new Level(Gravity.GRAVITY_DOWN, "/ressources/levels/World2/0", blocks), 
						new Level(Gravity.GRAVITY_DOWN, "/ressources/levels/World2/1", blocks), 
						new Level(Gravity.GRAVITY_DOWN, "/ressources/levels/World2/2", blocks), 
						new Level(Gravity.GRAVITY_DOWN, "/ressources/levels/World2/3", blocks), 
						new Level(Gravity.GRAVITY_DOWN, "/ressources/levels/World2/4", blocks), 
						new Level(Gravity.GRAVITY_DOWN, "/ressources/levels/World2/5", blocks), 
						new Level(Gravity.GRAVITY_DOWN, "/ressources/levels/World2/6", blocks),
						new Level(Gravity.GRAVITY_DOWN, "/ressources/levels/World2/7", blocks),
						new Level(Gravity.GRAVITY_DOWN, "/ressources/levels/World2/8", blocks),
						new Level(Gravity.GRAVITY_DOWN, "/ressources/levels/World2/9", blocks),
		};

		new Application("Test", 950, 400, 2.0f, new LevelChain(levels, "Road to success", new Player[] { new Player("Gagoi", 50, "/ressources/textures/characters/Sprite1.png", new int[] { 90, 81, 83, 68, 32 }, Color.BLUE),
						new Player("Denki_le_moche", 50, "/ressources/textures/characters/Sprite2.png", new int[] { 38, 37, 40, 39, 96 }, Color.PINK)
		}));
	}
}
