package base.custom_blocks;

import java.util.Timer;
import java.util.TimerTask;

import fr.pwal.base.physic.BlockEffect;
import fr.pwal.level.Block;
import fr.pwal.level.Player;

public class DamageBlock extends Block implements BlockEffect {

	private boolean canDoDamage = true;

	public DamageBlock(char id, String spritePath) {
		super(id, spritePath);
	}

	@Override
	public void doSpecialEffect(Player p, int posX, int posY) {
		if (this.isPlayerInside(p, posX, posY) && this.canDoDamage) {
			p.decreaseLife(10);
			this.canDoDamage = false;
			new Timer().schedule(new TimerTask() {
				@Override
				public void run() {
					DamageBlock.this.canDoDamage = true;
				}
			}, 1000);
		}
	}

}
