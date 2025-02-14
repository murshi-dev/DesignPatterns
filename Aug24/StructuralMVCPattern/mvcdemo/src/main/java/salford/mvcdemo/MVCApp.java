package salford.mvcdemo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class MVCApp extends Application {

	Pane pane;
	Scene scene;
	
	Model model;
	View view;
	Controller controller;
	

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("MVC Pattern App");
		pane = new Pane();
		scene = new Scene(pane, 600, 400);
		primaryStage.setScene(scene);
		primaryStage.show();
		
		model = new Model();
		view = new View(pane,model);
		controller = new Controller(model,view);

	}

}
