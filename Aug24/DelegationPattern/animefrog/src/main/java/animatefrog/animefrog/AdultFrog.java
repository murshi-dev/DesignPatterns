package animatefrog.animefrog;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public class AdultFrog extends GameObject implements FrogInterface {
	FrogInterface delegate;
	protected int age=0;
	public AdultFrog(double x, double y, GraphicsContext gc) {
		super(x, y, gc);
		img=new Image(Egg.class.getResource("frog1.png").toExternalForm());
		update();
		delegate = this;
	}

}
