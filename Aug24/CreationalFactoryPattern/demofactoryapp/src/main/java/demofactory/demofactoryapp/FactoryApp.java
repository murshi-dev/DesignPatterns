package demofactory.demofactoryapp;
import java.util.ArrayList;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class FactoryApp extends Application{

	Pane pane;
	Scene scene;
	Canvas canvas;
	GraphicsContext gc;
	
	ArrayList<GameObject> list=new ArrayList<GameObject>();
	Factory factory;
	
	public static void main(String[] args) {
		launch(args);
	}
	AnimationTimer timer=new AnimationTimer()
	{
		@Override
		public void handle(long now) {
			gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
			
			//update the object status
			for(GameObject obj:list)
			{
				obj.update();
			}
		}
	};
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		pane=new Pane();
		scene=new Scene(pane,800,600);
		canvas=new Canvas(800,600);
		gc=canvas.getGraphicsContext2D();
		primaryStage.setScene(scene);
		primaryStage.show();
		
		pane.getChildren().add(canvas);
		gc.setFill(Color.BLACK);
		gc.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());
		
		factory = new Factory(gc);
		//creates a 6x6 grid pattern
		for(int i=0;i<6;i++)
		{
			for(int j=0;j<6;j++)
			{
				list.add(factory.createProduct("invader", i*50, j*50));
				//i*50 j*50 sets the invaders position in the grid --spaced by 50 units
			}
		}
		timer.start();
		}
}
