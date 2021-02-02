package td1.entities;

import td1.abilities.CapableOfRunning;
import td1.abilities.Jumpable;

public class Cat implements CapableOfRunning, Jumpable{
	
	private int remainedDistanceForToday=5000;
	private int maxJumpHeight=5;
	

	@Override
	public String toString() {
		return "Cat ";
	}


	@Override
	public boolean jump(int height) {
		boolean canJump = height<=maxJumpHeight;
		System.out.println(canJump?"Cat is jumping":"Cat can't jump");
		return canJump;
	}


	@Override
	public boolean run(int distance) {
		boolean canRun = distance<=remainedDistanceForToday;
		remainedDistanceForToday-=distance;
		System.out.println(canRun?"Cat is running":"Cat can't run");
		return canRun;
	}
		
}
