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

public class Pong extends Canvas implements KeyListener, Runnable
{
	private Ball ball;
	private Paddle paddle;
	private boolean[] keys;
	private BufferedImage back;
	private int score;
	private Block board;
	private Block brick;

	
	private boolean gameOver;
	private int level;

	public Pong()
	{
		//set up all variables related to the game
		ball = new Ball(400,350,10,10,Color.BLUE,-2,2);
		paddle = new Paddle(100,350,40,40,Color.YELLOW,3);

		keys = new boolean[4];
		score = 0;
		level = 1;
		
		gameOver = false;
		
		board = new Block(5, 5, 760, 460, Color.WHITE);
    
    	setBackground(Color.BLACK);
		setVisible(true);

		this.addKeyListener(this);	
		new Thread(this).start();	//starts the key thread to log key strokes
	}
	
	public void update(Graphics window){
	   paint(window);
   }

   public void paint(Graphics window)
   {
		//set up the double buffering to make the game animation nice and smooth
		Graphics2D twoDGraph = (Graphics2D)window;

		//take a snap shop of the current screen and save it as an image
		//that is the exact same width and height as the current screen
		if(back==null)
		   back = (BufferedImage)(createImage(getWidth(),getHeight()));

		//create a graphics reference to the back ground image
		//we will draw all changes on the background image
		Graphics graphToBack = back.createGraphics();

		board.draw(graphToBack);

		ball.moveAndDraw(graphToBack);
		paddle.draw(graphToBack);

		//see if ball hits left wall or right wall
		if(!(ball.getX()>=10 && ball.getX()<=750))
		{
			ball.setXSpeed(-ball.getXSpeed());

/*			ball.setXSpeed(0);
			ball.setYSpeed(0);
			
			if (ball.getX() < paddle.getX() && !gameOver) rScore++;
			
			gameOver = true;
			
			ball.draw(graphToBack, Color.WHITE);
			ball.setX(400);
			ball.setY(350);
			ball.draw(graphToBack, Color.BLUE);
			if (lScore > rScore) ball.setXSpeed(2);
			else ball.setXSpeed(-2);
			ball.setYSpeed(2);*/

		}
		else gameOver = false;

		//see if the ball hits the top or bottom wall 
		if(!(ball.getY()>=10 && ball.getY()<=450))
		{
			ball.setYSpeed(-ball.getYSpeed());
		}

		//see if the ball hits the paddle 
		if (((ball.getX() <= paddle.getX() + paddle.getWidth() + Math.abs(ball.getXSpeed()) &&
				ball.getX() > paddle.getX()) || 
				(ball.getX() + ball.getWidth() >= paddle.getX() - Math.abs(ball.getXSpeed())) && 
				(ball.getX() + ball.getWidth() < paddle.getX()+paddle.getWidth())) && 
				((ball.getY() >= paddle.getY() && 
				ball.getY() <= paddle.getY() + paddle.getHeight()) ||
				(ball.getY() + ball.getHeight() >= paddle.getY() &&
				ball.getY() + ball.getHeight() < paddle.getY() + paddle.getHeight())))
		{
			if (((ball.getX() <= paddle.getX() + paddle.getWidth() - Math.abs(ball.getXSpeed())) && 
					ball.getX() + ball.getWidth() >= paddle.getX() + Math.abs(ball.getXSpeed()))) ball.setYSpeed(-ball.getYSpeed());
			else ball.setXSpeed(-ball.getXSpeed());
		}
		
		//see if the ball hits a brick
		
		
		//see if the paddles need to be moved
		if(keys[0] == true)
		{
			//move left paddle up and draw it on the window
			if (paddle.getY() > 55) paddle.moveUpAndDraw(graphToBack);
		}
		if(keys[1] == true)
		{
			//move left paddle down and draw it on the window
			if (paddle.getY() < 370) paddle.moveDownAndDraw(graphToBack);
		}
		if(keys[2] == true)
		{
			if (paddle.getX() > 55) paddle.moveLeftAndDraw(graphToBack);
		}
		if(keys[3] == true)
		{
			if (paddle.getX() < 670) paddle.moveRightAndDraw(graphToBack);
		}
		
		graphToBack.setColor(Color.BLACK);
		graphToBack.fillRect(350, 500, 100, 100);
		
		graphToBack.setColor(Color.WHITE);

		graphToBack.drawString("Level " + level, 350, 525);

		twoDGraph.drawImage(back, null, 0, 0);
	
	}

	public void keyPressed(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=true; break;
			case 'S' : keys[1]=true; break;
			case 'A' : keys[2]=true; break;
			case 'D' : keys[3]=true; break;
		}
	}

	public void keyReleased(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=false; break;
			case 'S' : keys[1]=false; break;
			case 'A' : keys[2]=false; break;
			case 'D' : keys[3]=false; break;
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