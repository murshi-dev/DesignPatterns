package demofactory.demofactoryapp;

import javafx.scene.canvas.GraphicsContext;

public class Factory implements FactoryIF
{
	GraphicsContext gc;

	@Override
	public GameObject createProduct(String discrim, double x, double y) 
	{
		if(discrim.equals("invader"))
			return new Invader(x,y,gc);
		//write subsequent conditions here
		return null;
	}
	public Factory(GraphicsContext gc)
	{
		super();
		this.gc=gc;
	}

}
