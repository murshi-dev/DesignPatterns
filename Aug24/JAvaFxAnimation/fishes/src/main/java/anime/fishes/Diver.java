package anime.fishes;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public class Diver 
{
	//movement variables
	//dx dy change in movement along x and y axis
	double x,y,dx=1,dy=1;
	GraphicsContext gc;
	Image img;
	//Constructor
	public Diver(double x,double y, GraphicsContext gc)
	{
		this.x=x;
		this.y=y;
		this.gc=gc;
		//load the diver image 
		img=new Image(this.getClass().getResourceAsStream("diver.png"));
	}
	
	//move method
	public void move(double dx,double dy)
	{
		x+=dx;
		y+=dy;
		//boundary checks
		if(x>450 ||x<0)
			dx= -dx;  //reverse direction if hit horizontally
		if(y>250 || y<0)
			dy = -dy; //reverse direction if hit vertically
	}
	//draw method
	public void draw()
	{
		gc.drawImage(img, x, y,50,50);
	}
}
