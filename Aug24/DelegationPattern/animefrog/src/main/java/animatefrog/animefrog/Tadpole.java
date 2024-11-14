package animatefrog.animefrog;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public class Tadpole extends GameObject implements FrogInterface {
	FrogInterface delegate;
	protected int age=0;
	public Tadpole(double x, double y, GraphicsContext gc) {
		super(x, y, gc);
		img=new Image(Egg.class.getResource("tadpole1.png").toExternalForm());
		update();
		delegate = this;
	}

}
