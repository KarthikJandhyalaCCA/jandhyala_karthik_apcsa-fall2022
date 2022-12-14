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
import static java.lang.System.out;

import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;

public class Pong extends Canvas implements KeyListener, Runnable
{
	private SpeedUpBall ball;
	private Paddle leftPaddle;
	private Paddle rightPaddle;
	private boolean[] keys;
	private BufferedImage back;
	private Block score;
	private int p1;
	private int p2;

	public Pong()
	{
		//set up all variables related to the game
		
		ball = new SpeedUpBall(100,100,30,50,Color.BLUE,1,1);

		leftPaddle = new Paddle(100,100,30,50,Color.BLUE,6);
		
		rightPaddle = new Paddle(400,100,30,50,Color.BLUE,6);

		keys = new boolean[4];
		
		score = new Block(350, 500, 100, 50, Color.white);
		p1 = 0;
		p2 = 0;

    	setBackground(Color.WHITE);
		setVisible(true);
		
		new Thread(this).start();
		addKeyListener(this);		//starts the key thread to log key strokes
	}
	
   public void update(Graphics window){
	   paint(window);
   }

   public void paint(Graphics window)
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


		ball.moveAndDraw(graphToBack);
		leftPaddle.draw(graphToBack);
		rightPaddle.draw(graphToBack);
		score.drawScore(graphToBack, p1, p2);


		//see if ball hits left wall or right wall
		if(!(ball.getX()>=10 && ball.getX()<=450))
		{
			ball.setXS(-ball.getXS());
			ball.randomColor();
			ball.setXSpeed(ball.getXS());
			ball.setYSpeed(ball.getYS());
		}

		
		//see if the ball hits the top or bottom wall 
		if(!(ball.getY()>=10 && ball.getY()<=450))
		{
			ball.setYS(-ball.getYS());
			ball.randomColor();
			ball.setXSpeed(ball.getXS());
			ball.setYSpeed(ball.getYS());
		}
		
		if(!(ball.getX()>=10)) {
			//player 2 gets a point
			score.draw(graphToBack);
			score.drawScore(graphToBack, p1, p2++);
		}
		
		if(!(ball.getX()<=750)) {
			//player 1 gets a point
			score.draw(graphToBack);
			score.drawScore(graphToBack, p1++, p2);
		}
		
		//see if the ball hits the left paddle
		if((ball.getX() <= leftPaddle.getX()+leftPaddle.getWidth()+Math.abs(ball.getXS())) && (ball.getY()>=leftPaddle.getY() && ball.getY()<=leftPaddle.getY()+leftPaddle.getHeight()|| ball.getY()+ball.getHeight()>=leftPaddle.getY() && ball.getY()+ball.getHeight()<leftPaddle.getY()+leftPaddle.getHeight())) {
			if((ball.getX() <= leftPaddle.getX()+leftPaddle.getWidth()-Math.abs(ball.getXS()))){
				ball.setYS(-ball.getYS());
			}
			else {
				ball.setXS(-ball.getXS());
			}
		}
		
		//see if the ball hits the right paddle
		 
		if((ball.getX() >= rightPaddle.getX()-rightPaddle.getWidth()+Math.abs(ball.getXS())) && (ball.getY()>=rightPaddle.getY() && ball.getY()<=rightPaddle.getY()+rightPaddle.getHeight() || ball.getY()+ball.getHeight()>=rightPaddle.getY() && ball.getY()+ball.getHeight()<rightPaddle.getY()+rightPaddle.getHeight())) {
			if((ball.getX() >= rightPaddle.getX()-rightPaddle.getWidth()-Math.abs(ball.getXS()))){
				ball.setYS(-ball.getYS());
			}
			else {
				ball.setXS(-ball.getXS());
			}
		}
		
		if(!(leftPaddle.getY()>=0)){
			leftPaddle.setY(0);
		}
		else if(!(leftPaddle.getY()+leftPaddle.getHeight()<=570)) {
			leftPaddle.setY(570-leftPaddle.getHeight());
		}
		else if(!(rightPaddle.getY()>=0)){
			rightPaddle.setY(0);
		}
		else if(!(rightPaddle.getY()+rightPaddle.getHeight()<=570)) {
			rightPaddle.setY(570-rightPaddle.getHeight());
		}

		//see if the paddles need to be moved
		
		if (keys[0] == true) {
			leftPaddle.moveUpAndDraw(graphToBack);
			leftPaddle.draw(graphToBack);
		}
		else if (keys[1] == true) {
			leftPaddle.moveDownAndDraw(graphToBack);
			leftPaddle.draw(graphToBack);
		}
		else if (keys[2] == true) {
			rightPaddle.moveUpAndDraw(graphToBack);
			rightPaddle.draw(graphToBack);
		}
		else if (keys[3] == true) {
			rightPaddle.moveDownAndDraw(graphToBack);
			rightPaddle.draw(graphToBack);
		}

		twoDGraph.drawImage(back, null, 0, 0);
	}

	public void keyPressed(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=true; break;
			case 'Z' : keys[1]=true; break;
			case 'I' : keys[2]=true; break;
			case 'M' : keys[3]=true; break;
		}
	}

	public void keyReleased(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=false; break;
			case 'Z' : keys[1]=false; break;
			case 'I' : keys[2]=false; break;
			case 'M' : keys[3]=false; break;
		}
	}

	public void keyTyped(KeyEvent e){}
	
   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(8);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}	
}