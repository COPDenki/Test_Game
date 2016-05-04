package base.custom_blocks;

import fr.pwal.level.Block;

public class CanalPorter extends Block{

	private short channel;
	
	public CanalPorter(char id, String spritePath, short channel) {
		super(id, spritePath, false);
		this.channel = channel;
	}
	
	public short getChannel(){
		return this.channel;
	}

}
