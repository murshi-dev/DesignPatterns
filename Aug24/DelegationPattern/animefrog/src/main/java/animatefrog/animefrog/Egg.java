package animatefrog.animefrog;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public class Egg extends GameObject implements FrogInterface {
	FrogInterface delegate;
	protected int age=0;
	
	
	
	public Egg(double x, double y, GraphicsContext gc) {
		super(x, y, gc);
		img=new Image(Egg.class.getResource("eggs1.png").toExternalForm());
		update();
		delegate = this;
	}	
	public void grow() {
		age+=1;
		if(age==100)
			delegate = new Tadpole(x,y,gc);
		if(age==200)
			delegate = new AdultFrog(x,y,gc);
		delegate.update();	
	}

}



