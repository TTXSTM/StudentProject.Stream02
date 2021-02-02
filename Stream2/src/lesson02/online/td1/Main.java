package td1;

import java.util.ArrayList;
import java.util.List;

import td1.abilities.Able;
import td1.abilities.CapableOfRunning;
import td1.abilities.Jumpable;
import td1.entities.Cat;
import td1.entities.Person;
import td1.entities.Robot;
import td1.obstacles.Obstacle;
import td1.obstacles.RunningTrack;
import td1.obstacles.Wall;

public class  Main {

	public static void main(String[] args) {

		Able [] participants = {new Cat(), new Person(), new Robot()};
		Obstacle [] obstacles = {new Wall(2), new RunningTrack(1000), 
				new Wall(3), new RunningTrack(1500), new Wall(15)};
		
		for(Obstacle obstacle: obstacles) {
			System.out.println(obstacle);
			for(int i = 0; i<participants.length; i++) {
				if(participants[i] != null) {
					boolean isSucces = obstacle.createObstacle(participants[i]);
					if(!isSucces) {
						participants[i] = null;
					}	
				}
			}
			System.out.print("Participants restants :");
			printParticipants(participants);
		}		
	}
	
	public static void printParticipants(Able[] participants) {
		for(Able participant: participants) {
			if(participant!=null) {
				System.out.print(" "+participant);
			}
			
		}
	}
		
}
