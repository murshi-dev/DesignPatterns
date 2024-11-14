package animatefrog.animefrog;
import java.util.ArrayList;
import java.util.Random;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class DelegationApp extends Application{
	Pane pane;
	Scene scene;
	
	Canvas canvas;
	GraphicsContext gc;
	
	
	ArrayList<GameObject> list = new ArrayList<GameObject>();
	Random rnd = new Random(System.currentTimeMillis());
	int count=0;

	
	AnimationTimer timer = new AnimationTimer() {

		@Override
		public void handle(long now) {
			if(count++ > 10) {
				list.add(new Egg(rnd.nextInt(800),rnd.nextInt(600),gc));
				count=0;
			}
			for(GameObject obj : list)
				((Egg)obj).grow();

			
		} };

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		pane=new Pane();
		scene=new Scene(pane,800,600);
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
		canvas = new Canvas(800,600);
		gc = canvas.getGraphicsContext2D();
		gc.setFill(Color.LIGHTCYAN);
		gc.fillRect(0,0,canvas.getWidth(),canvas.getHeight());

		pane.getChildren().add(canvas);
		
		timer.start();
		
	}
}




