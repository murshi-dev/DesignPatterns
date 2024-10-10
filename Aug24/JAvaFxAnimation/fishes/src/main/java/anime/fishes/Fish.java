package anime.fishes;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public class Fish 
{
	//movement variables
	//dx dy change in movement along x and y axis
	double x,y,dx=1,dy=1;
	GraphicsContext gc;
	Image img;
	//Constructor
	public Fish(double x,double y, GraphicsContext gc)
	{
		this.x=x;
		this.y=y;
		this.gc=gc;
		//load the fish image 
		img=new Image(this.getClass().getResourceAsStream("fish.png"));
	}
	//move the fish
	public void move()
	{
		x+=dx;
		y+=dy;
		
		//boundary checks
		if(x>450 ||x<0)
			dx= -dx;  //reverse direction if hit horizontally
		if(y>250 || y<0)
			dy = -dy; //reverse direction if hit vertically
		gc.drawImage(img,x,y,50,50);
	}

}
