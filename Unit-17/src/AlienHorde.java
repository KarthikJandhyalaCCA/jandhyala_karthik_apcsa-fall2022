//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.List;

public class AlienHorde
{
	private List<Alien> aliens;

	public AlienHorde(int size)
	{
		int x = 100;
		aliens = new ArrayList<Alien>();
		for (int i = 0; i<size; i++) {
			aliens.add(new Alien(x, 50, 50, 50, 3));
			x=x+70;
		}
	}

	public void add(Alien al)
	{
		aliens.add(al);
	}

	public void drawEmAll( Graphics window )
	{
		for (Alien a: aliens) {
			a.draw(window);
		}
	}

	public void moveEmAll()
	{
		for (int i = 0; i<aliens.size(); i++) {
			if (aliens.get(i).getX() < 5 || aliens.get(i).getX() > 780) {
				aliens.get(i).setSpeed(aliens.get(i).getSpeed() * (-1));
				aliens.get(i).move("RIGHT");
			}
			else {
				aliens.get(i).move("RIGHT");
			}
		}
	}

	public void removeDeadOnes(List<Ammo> shots)
	{
		for (int i = 0; i < shots.size(); i++) {
			for (int j = 0; j<aliens.size(); j++) {
				if ((shots.get(i).getX() > (aliens.get(j).getX())-20) && (shots.get(i).getX() < (aliens.get(j).getX())+20)){
					if ((shots.get(i).getY() > (aliens.get(j).getY())-20) && (shots.get(i).getY() < (aliens.get(j).getY())+20)) {
						aliens.remove(j);
					}
				}
			}
		}
	}

	public String toString()
	{
		return "";
	}
}
