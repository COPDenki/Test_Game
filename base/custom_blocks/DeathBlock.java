package base.custom_blocks;

import fr.pwal.base.physic.BlockEffect;
import fr.pwal.level.Block;
import fr.pwal.level.Player;

public class DeathBlock extends Block implements BlockEffect{
	
	public DeathBlock(char id, String spritePath, boolean isHard) {
		super(id, spritePath, isHard);
	}

	@Override
	public void doSpecialEffect(Player p, int posX, int posY) {
		if (isPlayerInside(p, posX, posY)) p.setLife(0);
	}
}
