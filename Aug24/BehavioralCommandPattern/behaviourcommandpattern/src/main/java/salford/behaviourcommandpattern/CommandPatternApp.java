package salford.behaviourcommandpattern;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class CommandPatternApp extends Application{
	
	Pane pane;
	Scene scene;
	Canvas canvas;
	GraphicsContext gc;
	
	CommandPattern commandpattern =  new CommandPattern();
		
	EventHandler<MouseEvent> mousehandler=new EventHandler<MouseEvent>()
			{

				@Override
				public void handle(MouseEvent event) {
					//gc.strokeRect(event.getX(), event.getY(), 3, 3);
					DrawCommand d=new DrawCommand(gc,event.getX(),event.getY());
					commandpattern.addCommand(d);
			}};
	EventHandler<KeyEvent> keyboardhandler = new EventHandler<KeyEvent>()
			{

				@Override
				public void handle(KeyEvent event) {
					//if(event.getCode()==KeyCode.G) 
					//{
					//	gc.setStroke(Color.GREEN);
					//}
					if(event.getCode()==KeyCode.R)
					{
						commandpattern.redo();
					}
					if(event.getCode()==KeyCode.U)
					{
						commandpattern.undo();
					}
					
			}};
	public static void main(String[] args) {
		launch(args);

	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		primaryStage.setTitle("Drawing App");
		pane=new Pane();
		scene=new Scene(pane,600,400);
		primaryStage.setScene(scene);
		primaryStage.show();
		
		canvas = new Canvas(600,400);
		pane.getChildren().add(canvas);
		
		gc = canvas.getGraphicsContext2D();
		gc.setFill(Color.YELLOW);
		gc.fillRect(0, 0, 600, 400);
		
		gc.setStroke(Color.BLUE);
		gc.setLineWidth(5);
		gc.strokeOval(100, 100, 400, 200);
		
		scene.setOnMouseDragged(mousehandler);
		
		scene.setOnKeyPressed(keyboardhandler);
		
	}

}
