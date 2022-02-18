import acm.graphics.*;
import acm.program.*;
import java.awt.Color;
import java.awt.event.*;
import java.util.*;

@SuppressWarnings("serial")
public class MainProgram extends GraphicsProgram
{
  //  CheckerPiece [] pieces = new CheckerPiece[32];
	Piece [] pieceArray = new Piece[8];
    public void init()
    {
	resize(800, 600);
	addKeyListeners();
	addMouseListeners();
    }
    public void run()
    {
    	for(int i=0; i<9; i++)
    	{
    		GLine temp = new GLine(0,0,400,0);
    		temp.setColor(Color.gray);
    		add(temp,0,50*i);
    	}
    	for(int i=0; i<9; i++)
    	{
    		GLine temp = new GLine(0,0,0,400);
    		temp.setColor(Color.gray);
    		add(temp,50*i,0);
    	}
    	Random ran = new Random();
    	for (int i=0; i<pieceArray.length; i++)
    	{
    		pieceArray[i] = new Piece(ran.nextInt(8),ran.nextInt(8));
    		add(pieceArray[i]);
    	}
    	
    	
	String ex1, ex2, ex3, ex4;
	
	ex1 = "[Cc]olou?r";
	ex2 = "[A-Z][^e]+\\.";
	ex3 = "\\d\\d?:\\d\\d(am|pm)";
	ex4 = "\\d{3}-?\\d{3}-?\\d{4}";
	
	//TestRegex(ex1);
	//TestRegex(ex2);
	//TestRegex(ex3);
	//TestRegex(ex4);	
    }

    private void TestRegex(String regex)
    {
	println("Regular expression:");
	println(regex);
	println("------------------");
	for (int i = 1; i <= 4; i++)
	    {
		String s = readLine(i + ") ");
		if (s.matches(regex))
		    println("  MATCH");
		else
		    println("       NO match");
	    }
	println();
    }
    
    
    public void mousePressed(MouseEvent e)
    {
    	for (int i=0; i<pieceArray.length;i++)
    	{
    		if(pieceArray[i].contains(e.getX(),e.getY()))
    		{
    			pieceArray[i].toggle();
    		}
    	}
    }
    public void keyPressed(KeyEvent e)
	{
		if (e.getKeyChar() == 'w')
		{
			for (int i=0; i<pieceArray.length;i++)
	    	{
	    		if(!pieceArray[i].isRed())
	    		{
	    			pieceArray[i].moveUp();
	    		}
	    	}
		}
		else if (e.getKeyChar() == 's')
		{
			for (int i=0; i<pieceArray.length;i++)
	    	{
	    		if(!pieceArray[i].isRed())
	    		{
	    			pieceArray[i].moveDown();
	    		}
	    	}
		}
		else if (e.getKeyChar() == 'a')
		{
			for (int i=0; i<pieceArray.length;i++)
	    	{
	    		if(!pieceArray[i].isRed())
	    		{
	    			pieceArray[i].moveLeft();
	    		}
	    	}
		}
		else if (e.getKeyChar() == 'd')
		{
			for (int i=0; i<pieceArray.length;i++)
	    	{
	    		if(!pieceArray[i].isRed())
	    		{
	    			pieceArray[i].moveRight();
	    		}
	    	}
		}
	}
	
}