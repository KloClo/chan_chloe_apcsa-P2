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
		aliens = new ArrayList<Alien>();
		int x = 50;
		int y = 50;

		for (int j = 0; j < (size/10); j++) //each row
		{
			x = 50;
			for(int i = 0; i < size; i++) // each one in a row
			{
				Alien a = new Alien(x, y, 50, 50,5);
				aliens.add(a);
				x += 60;
			}
			y += 60;
		}
	}

	public void add(Alien al)
	{
		aliens.add(al);
	}

	public void drawEmAll( Graphics window )
	{
		for (Alien a : aliens) a.draw(window);
	}

	public void moveEmAll()
	{
	}

	public void removeDeadOnes(List<Ammo> shots)
	{
		if (shots.size() > 0)
		{
			for (int i = 0; i < shots.size(); i++)
			{
				for (int j = 0; j < aliens.size(); j++)
				{
					Ammo b = shots.get(i);
					Alien a = aliens.get(j);
					if (((b.getX() <= a.getX() + a.getWidth() + Math.abs(b.getSpeed()) &&
							b.getX() > a.getX()) || 
							(b.getX() + b.getWidth() >= a.getX() - Math.abs(b.getSpeed())) && 
							(b.getX() + b.getWidth() < a.getX()+a.getWidth())) && 
							((b.getY() >= a.getY() && 
							b.getY() <= a.getY() + a.getHeight()) ||
							(b.getY() + b.getHeight() >= a.getY() &&
							b.getY() + b.getHeight() < a.getY() + a.getHeight())))
					{
						shots.remove(i);
						aliens.remove(a);
					}
					if (shots.size() == 0) break;
				}
			}
		}
	}

	public String toString()
	{
		return "";
	}
}
