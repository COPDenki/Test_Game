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
		if (isPlayerInside(p, posX, posY) && canDoDamage) {
			p.decreaseLife(10);
			canDoDamage = false;
			new Timer().schedule(new TimerTask() {
				@Override
				public void run() {
					canDoDamage = true;
				}
			}, 1000);
		}
	}

}
