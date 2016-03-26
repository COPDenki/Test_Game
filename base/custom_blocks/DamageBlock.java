package base.custom_blocks;

import java.awt.Color;

import fr.pwal.base.physic.BlockEffect;
import fr.pwal.graphics.base.graphics.level.BlockOverlay;
import fr.pwal.level.Block;
import fr.pwal.level.Player;

public class DamageBlock extends Block implements BlockEffect {

	public DamageBlock(char id, String spritePath) {
		super(id, spritePath);
		this.getSprite().addBlockOverlay(new BlockOverlay(Color.PINK));
	}

	@Override
	public void doSpecialEffect(Player p) {

	}

}
