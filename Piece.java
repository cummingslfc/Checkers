import acm.graphics.GOval;

import java.awt.Color;


public class Piece extends GOval {
	
	private boolean pieceIsRed;
	private int coordX;
	private int coordY;
	
	public Piece(int x,int y)
	{
		super(50,50);
		super.setFilled(true);
		super.setFillColor(Color.red);
		pieceIsRed = true;
		if(x<8 && y<8 && x>=0 && y>=0)
		{
			super.setLocation(x*50, y*50);
			coordX = x;
			coordY = y;
		}
		else
		{
			coordX = 0;
			coordY = 0;
		}
	}
	public boolean isRed()
	{
		return pieceIsRed;
	}
	public void toggle()
	{
		if(pieceIsRed)
		{
			super.setFillColor(Color.black);
			pieceIsRed = false;
		}
		else if(!pieceIsRed)
		{
			super.setFillColor(Color.red);
			pieceIsRed = true;
		}
	}
	public void moveToBoardPosition(int newX, int newY)
	{
		if(newX<8 && newY<8 && newX>=0 && newY>=0)
		{
			super.setLocation(newX*50, newY*50);
			coordX = newX;
			coordY = newY;
		}
		
	}
	public void moveUp()
	{
		if(coordY>0)
		{
			coordY--;
			super.setLocation(coordX*50, coordY*50);
			
		}
	}
	public void moveDown()
	{
		if(coordY<7)
		{
			coordY++;
			super.setLocation(coordX*50, coordY*50);
			
		}
	}
	public void moveLeft()
	{
		if(coordX>0)
		{
			coordX--;
			super.setLocation(coordX*50, coordY*50);
			
		}
	}
	public void moveRight()
	{
		if(coordX<7)
		{
			coordX++;
			super.setLocation(coordX*50, coordY*50);
			
		}
	}
	
}
