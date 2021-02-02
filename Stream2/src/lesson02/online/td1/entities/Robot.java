package td1.entities;

import td1.abilities.CapableOfRunning;
import td1.abilities.Jumpable;

public class Robot implements  CapableOfRunning, Jumpable {

	private int petrol = 10000;

	@Override
	public String toString() {
		return "Robot";
	}



	@Override
	public boolean jump(int height) {
		boolean canJump = petrol>=height;
		petrol-=height;
		System.out.println(canJump?"Robot jumped":"Robot can't jump");
		return canJump;
	}



	@Override
	public boolean run(int distance) {
		boolean canRun = petrol>=distance;
		petrol-=distance;
		System.out.println(canRun?"Robot ran":"Robot can't run");
		return canRun;
	}
	
	
}
