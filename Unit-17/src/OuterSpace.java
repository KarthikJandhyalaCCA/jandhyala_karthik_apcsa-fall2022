//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class OuterSpace extends Canvas implements KeyListener, Runnable
{
	private Ship ship;
	private Alien alienOne;
	private Alien alienTwo;
	private Ammo ammo;
	private int count = 0;
	private int shottimer;

	/* uncomment once you are ready for this part
	 */
   private AlienHorde horde;
	private Bullets shots;

	private boolean[] keys;
	private BufferedImage back;

	public OuterSpace()
	{
		setBackground(Color.black);

		keys = new boolean[5];
		
		shottimer = 0;

		//instantiate other instance variables
		//Ship, Alien
		horde = new AlienHorde(5);
		ship = new Ship();
		alienOne = new Alien(100, 50, 50, 50, 3);
		alienTwo = new Alien(600, 50, 50, 50, 4);
		ammo = new Ammo((ship.getX()+40), ship.getY(), 2);
		shots = new Bullets();

		this.addKeyListener(this);
		new Thread(this).start();

		setVisible(true);
	}

   public void update(Graphics window)
   {
	   paint(window);
   }

	public void paint( Graphics window )
	{
		//set up the double buffering to make the game animation nice and smooth
		Graphics2D twoDGraph = (Graphics2D)window;

		//take a snap shop of the current screen and same it as an image
		//that is the exact same width and height as the current screen
		if(back==null)
		   back = (BufferedImage)(createImage(getWidth(),getHeight()));

		//create a graphics reference to the back ground image
		//we will draw all changes on the background image
		
		Graphics graphToBack = back.createGraphics();
		
		graphToBack.setColor(Color.BLACK);
		graphToBack.fillRect(0,0,800,600);

		graphToBack.setColor(Color.BLUE);
		graphToBack.drawString("StarFighter ", 25, 50 );
		
		ship.draw(graphToBack);
		//alienOne.draw(graphToBack);
		//alienTwo.draw(graphToBack);
		horde.drawEmAll(graphToBack);
		horde.moveEmAll();
		
		if(keys[0] == true)
		{
			ship.move("LEFT");
		}
		
		if(keys[1] == true)
		{
			ship.move("RIGHT");
		}
		
		if(keys[2] == true)
		{
			ship.move("UP");
		}
		
		if(keys[3] == true)
		{
			ship.move("DOWN");
		}
		if(keys[4] == true)
		{
			boolean check = true;
			if (check && shottimer>75) {
				shots.add(new Ammo((ship.getX()+40), ship.getY(), 2));
				shottimer = 0;
			}
			//shots.getList().get(count).setExist(true);
			//ammo.setX(ship.getX()+40);
			//ammo.setY(ship.getY());
			ammo.setExist(true);
		}
		
		
		if (ammo.getExist()) {
			shots.drawEmAll(graphToBack);
			shots.moveEmAll();
			shottimer++;
			//Ammo ammo = shots.getList().get(count);
			//ammo.draw(graphToBack);
			//ammo.move("SHOOT");
		}
		
		//alienOne.move("Move");
		//alienTwo.move("Move");
		//add code to move Ship, Alien, etc.

		horde.removeDeadOnes(shots.getList());
		//add in collision detection to see if Bullets hit the Aliens and if Bullets hit the Ship


		twoDGraph.drawImage(back, null, 0, 0);
	}


	public void keyPressed(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			keys[0] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			keys[1] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP)
		{
			keys[2] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			keys[3] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			keys[4] = true;
		}
		repaint();
	}

	public void keyReleased(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			keys[0] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			keys[1] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP)
		{
			keys[2] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			keys[3] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			keys[4] = false;
		}
		repaint();
	}

	public void keyTyped(KeyEvent e)
	{
      //no code needed here
	}

   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(5);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}
}

