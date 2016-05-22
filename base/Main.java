package base;

import java.awt.Color;

import javax.swing.ImageIcon;

import base.custom_blocks.SlowBlock;
import fr.pwal.base.physic.Gravity;
import fr.pwal.graphics.base.Application;
import fr.pwal.level.Block;
import fr.pwal.level.Level;
import fr.pwal.level.LevelChain;
import fr.pwal.level.Player;

public class Main {
	public static void main(String args[]) {
		//		Block[] blocks = {new Block('D', "/ressources/textures/blocks/stone_slab_side.png"),
		//						new Block('K', "/ressources/textures/blocks/chorus_plant.png", false), new Block('L', "/ressources/textures/blocks/grass_side_snowed.png"),
		//						new Block('M', "/ressources/textures/blocks/hay_block_side.png"),new Block('N', "/ressources/textures/blocks/ladder.png"),
		//						new Block('O', "/ressources/textures/blocks/log_spruce.png"),new Block('P', "/ressources/textures/blocks/mycelium_side.png"),
		//						new Block('Q', "/ressources/textures/blocks/mycelium_top.png", false),new Block('R', "/ressources/textures/blocks/netherrack.png"),
		//						new Block('S', "/ressources/textures/blocks/planks_oak.png"),new Block('T', "/ressources/textures/blocks/obsidian.png"),
		//						new Block('U', "/ressources/textures/blocks/purpur_block.png"),new Block('V', "/ressources/textures/blocks/tnt_side.png"),
		//						new Block('W', "/ressources/textures/blocks/dirt2.png"),new Block('X', "/ressources/textures/blocks/mycelium_top_ground.png"),
		//						new DamageBlock('Y', "/ressources/textures/blocks/chorus_plant2.png"),new DeathBlock('Z', "/ressources/textures/blocks/lava.png", false, true),};

		//		Application app = new Application("Test", 950, 400, 2.0f, new Level(Gravity.GRAVITY_DOWN, "/ressources", blocks,
		//				new Player[] { new Player("Gagoi", 50, "/ressources/textures/characters/Sprite1.png", new int[] { 90, 81, 83, 68, 32 }, Color.BLUE),
		//								new Player("Denki_le_moche", 50, "/ressources/textures/characters/Sprite2.png", new int[] { 38, 37, 40, 39, 96 }, Color.PINK)
		//	}));

		Block[] w0b = { new Block('A', "/ressources/textures/blocks/w0/grass.png"), new SlowBlock('B', "/ressources/textures/blocks/w0/sand.png"),
						new Block('C', "/ressources/textures/blocks/w0/stone.png"), new Block('E', "/ressources/textures/blocks/w0/in_lower.png", false),
						new Block('F', "/ressources/textures/blocks/w0/in_upper.png", false), new Block('G', "/ressources/textures/blocks/w0/out_lower.png", false),
						new Block('H', "/ressources/textures/blocks/w0/out_upper.png", false), new Block('I', "/ressources/textures/blocks/w0/sky.png", false),
						new Block('J', "/ressources/textures/blocks/w0/dirt.png"),new Block('D', "/ressources/textures/blocks/stone_slab_side.png"),
						new Block('O', "/ressources/textures/blocks/w0/log.png", false), new Block('P', "/ressources/textures/blocks/w0/log2.png"),
						new Block('Q', "/ressources/textures/blocks/w0/leaves.png", false),new Block('R', "/ressources/textures/blocks/w0/game0.png", false),
						new Block('S', "/ressources/textures/blocks/w0/game1.png", false), new Block('T', "/ressources/textures/blocks/w0/game2.png", false),
						new Block('K', "/ressources/textures/blocks/w0/sign.png", false), new Block('L', "/ressources/textures/blocks/w0/planks.png", false),
						new Block('M', "/ressources/textures/blocks/w0/trapdoor.png", false), new Block('N', "/ressources/textures/blocks/w0/snow.png", false),
		};
		Block[] w2b = {};
		Block[] w3b = {};

		Level[] levels = {
//						new Level(Gravity.GRAVITY_DOWN, "/ressources/levels/World0/0", w0b),
//						new Level(Gravity.GRAVITY_DOWN, "/ressources/levels/World0/1", w0b),
//						new Level(Gravity.GRAVITY_DOWN, "/ressources/levels/World0/2", w0b),
//						new Level(Gravity.GRAVITY_DOWN, "/ressources/levels/World0/3", w0b),
						new Level(Gravity.GRAVITY_DOWN, "/ressources/levels/World0/4", w0b),
						new Level(Gravity.GRAVITY_DOWN, "/ressources/levels/World0/5", w0b),
						new Level(Gravity.GRAVITY_DOWN, "/ressources/levels/World0/6", w0b),
						new Level(Gravity.GRAVITY_DOWN, "/ressources/levels/World0/7", w0b),
						new Level(Gravity.GRAVITY_DOWN, "/ressources/levels/World0/8", w0b),
						new Level(Gravity.GRAVITY_DOWN, "/ressources/levels/World0/9", w0b),

						//						new Level(Gravity.GRAVITY_DOWN, "/ressources/levels/World1/0", blocks), 
						//						new Level(Gravity.GRAVITY_DOWN, "/ressources/levels/World1/1", blocks), 
						//						new Level(Gravity.GRAVITY_DOWN, "/ressources/levels/World1/2", blocks), 
						//						new Level(Gravity.GRAVITY_DOWN, "/ressources/levels/World1/3", blocks), 
						//						new Level(Gravity.GRAVITY_DOWN, "/ressources/levels/World1/4", blocks), 
						//						new Level(Gravity.GRAVITY_DOWN, "/ressources/levels/World1/5", blocks), 
						//						new Level(Gravity.GRAVITY_DOWN, "/ressources/levels/World1/6", blocks),
						//						new Level(Gravity.GRAVITY_DOWN, "/ressources/levels/World1/7", blocks),
						//						new Level(Gravity.GRAVITY_DOWN, "/ressources/levels/World1/8", blocks),
						//						new Level(Gravity.GRAVITY_DOWN, "/ressources/levels/World1/9", blocks),
						//						
						//						new Level(Gravity.GRAVITY_DOWN, "/ressources/levels/World2/0", blocks), 
						//						new Level(Gravity.GRAVITY_DOWN, "/ressources/levels/World2/1", blocks), 
						//						new Level(Gravity.GRAVITY_DOWN, "/ressources/levels/World2/2", blocks), 
						//						new Level(Gravity.GRAVITY_DOWN, "/ressources/levels/World2/3", blocks), 
						//						new Level(Gravity.GRAVITY_DOWN, "/ressources/levels/World2/4", blocks), 
						//						new Level(Gravity.GRAVITY_DOWN, "/ressources/levels/World2/5", blocks), 
						//						new Level(Gravity.GRAVITY_DOWN, "/ressources/levels/World2/6", blocks),
						//						new Level(Gravity.GRAVITY_DOWN, "/ressources/levels/World2/7", blocks),
						//						new Level(Gravity.GRAVITY_DOWN, "/ressources/levels/World2/8", blocks),
						//						new Level(Gravity.GRAVITY_DOWN, "/ressources/levels/World2/9", blocks),
		};

		new Application("Participants Wondering About Lands", new ImageIcon(Main.class.getResource("/ressources/textures/icon.jpg")), 950, 440, 2.0f, new LevelChain(levels, "Road to success", new Player[] { new Player("Gagoi", 50, "/ressources/textures/characters/Sprite1.png", new int[] { 90, 81, 83, 68, 32 }, Color.CYAN),
						new Player("Denki", 50, "/ressources/textures/characters/Sprite8.png", new int[] { 38, 37, 40, 39, 96 }, Color.PINK)
		}));
	}
}
