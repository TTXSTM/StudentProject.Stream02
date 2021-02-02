package td1.obstacles;

import td1.abilities.Able;
import td1.abilities.CapableOfRunning;
import td1.abilities.Jumpable;
import td1.entities.Cat;
import td1.entities.Robot;

public class Wall implements Obstacle{

	private int height;
	
	public Wall(int height) {

		this.height = height;
	}

	@Override
	public boolean createObstacle(Able a) {
		if(!(a instanceof Jumpable)) {
			return false;	
		}
		else {
			return ((Jumpable)a).jump(height);
		}
	}

	@Override
	public String toString() {
		return "\n************************\n"
				+ "Wall of "+height+" meters"+
				"\n************************";
	}
	
}
