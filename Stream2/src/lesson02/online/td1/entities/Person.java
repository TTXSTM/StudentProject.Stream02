

package td1.entities;

import td1.abilities.CapableOfRunning;
import td1.abilities.Jumpable;

public class Person implements CapableOfRunning, Jumpable{

	private int remainedDistanceForToday=10000;
	private int maxJumpHeight=2;

	@Override
	public String toString() {
		return "Person";
	}


	@Override
	public boolean jump(int height) {
		boolean canJump = height<=maxJumpHeight;
		System.out.println(canJump?"Person is jumping":"Person can't jump");
		return canJump;
	}


	@Override
	public boolean run(int distance) {
		boolean canRun = distance<=remainedDistanceForToday;
		remainedDistanceForToday-=distance;
		System.out.println(canRun?"Person is running":"Person can't run");
		return canRun;
	}	
}
