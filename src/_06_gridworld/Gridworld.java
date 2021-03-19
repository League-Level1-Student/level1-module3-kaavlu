package _06_gridworld;

import java.awt.Color;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class Gridworld {
	public static void main(String[] args) {
		World world = new World();
		Bug bug = new Bug();
		Location location = new Location(0, 0);
		
		Bug bug1 = new Bug();
		Location location1 = new Location(1, 1);
		bug1.setColor(Color.blue);
		bug1.setDirection(90);
		
		Flower flower = new Flower();
		Flower flower1 = new Flower();
		Location location2 = new Location(1, 0);
		Location location3 = new Location(1, 2);
		world.show();
		world.add(location, bug);
		world.add(location1, bug1);
		world.add(location2, flower);
		world.add(location2, flower);
		world.add(location3, flower1);
		//world.add(loc, flower);

	}
}
