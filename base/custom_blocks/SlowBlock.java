package base.custom_blocks;

import java.util.Timer;
import java.util.TimerTask;

import fr.pwal.base.physic.BlockEffect;
import fr.pwal.level.Block;
import fr.pwal.level.Player;

public class SlowBlock extends Block implements BlockEffect {

	private static Timer t = new Timer();

	public SlowBlock(char id, String spritePath) {
		super(id, spritePath);
	}

	@Override
	public void doSpecialEffect(Player p, int posX, int posY) {
		if (this.isPlayerInside(p, posX, posY - 1))
			p.setSlow(0.2f);
		t.schedule(new TimerTask() {
			@Override
			public void run() {
				p.setSlow(1);
			}
		}, 800);
	}

}
