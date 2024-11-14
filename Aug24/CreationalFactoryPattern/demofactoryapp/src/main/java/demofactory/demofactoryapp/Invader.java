package demofactory.demofactoryapp;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public class Invader extends GameObject {

	public Invader(double x, double y, GraphicsContext gc) {
		super(x, y, gc);
		img=new Image(Invader.class.getResource("inv1.png").toExternalForm());
		update();//call abstract method
	}
	static double dx=1,yOffset=0;
	double yStart=y;
	//update the x y movements
	public void update()
	{
		x+=dx;
		y=yStart+yOffset;
		if(x>800 || x<0)
		{
			dx=-dx;
			yOffset+=30;
		}
		super.update();
	}
}
