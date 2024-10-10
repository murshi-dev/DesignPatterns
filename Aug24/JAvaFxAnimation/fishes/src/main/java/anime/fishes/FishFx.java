package anime.fishes;

import java.util.ArrayList;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class FishFx extends Application
{
	Pane pane=new Pane();
	Scene scene=new Scene(pane,500,300);
	Canvas canvas;
	GraphicsContext gc;
	//Fish fish;
	
	//to create a group of fishes
	ArrayList<Fish> fishes = new ArrayList<>();
	Diver diver; //step 1 - declare a diver object
	
	public static void main(String[] args) 
	{
		launch(args);
	}

	@Override
	public void start(Stage stage)
	{
		//set the scene
		stage.setScene(scene);
		//display the stage
		stage.show();
		//initialise the canvas
		canvas=new Canvas(500,300);
		//use graphics context for drawing
		gc=canvas.getGraphicsContext2D();
		//add the canvas to the pane
		pane.getChildren().add(canvas);
		
		//create fish object
		//fish=new Fish(200,150,gc);
		
		//add fishes
		fishes.add(new Fish(10,10,gc));
		fishes.add(new Fish(400,100,gc));
		
		//step 2 - add diver to the tank with initial position
		diver=new Diver(200,150,gc);
		
		//step 4 - invoke handleKeyPress
		scene.setOnKeyPressed(this::handleKeyPress);
		
		//set the animation timer
		AnimationTimer timer = new AnimationTimer()
		{
			@Override
			public void handle(long now)
			{
				//fill the canvas color
				gc.setFill(Color.SKYBLUE);
				gc.fillRect(0, 0,canvas.getWidth(), canvas.getHeight());
				
				//call the move method
				//fish.move();
				//move and draw all fishes
				for(Fish fish:fishes)
				{
					fish.move();
				}
				//step 5  - draw the diver
				diver.draw();
			}
		};
		//start the animation timer
		timer.start();
	}//end of start method
	
	//step 3 - method to handle keypress events
	private void handleKeyPress(KeyEvent event)
	{
		switch(event.getCode())
		{
		case UP:
			diver.move(0,-5);//move diver up
			break;
		case DOWN:
			diver.move(0,5);//move diver down
			break;
		case LEFT:
			diver.move(-5,0);//move diver left
			break;
		case RIGHT:
			diver.move(5,0);//move diver right
			break;
		default:
				break;
		}
	}
}//end of class
