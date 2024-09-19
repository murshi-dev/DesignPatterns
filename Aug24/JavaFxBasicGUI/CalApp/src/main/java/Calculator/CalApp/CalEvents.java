package Calculator.CalApp;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
//import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class CalEvents extends Application{
	
	//declare required controls
	Label first=new Label("First Number");
	Label second=new Label("Second Number");
	Label result=new Label("Result");
	
	TextField n1=new TextField();
	TextField n2=new TextField();
	TextField ans=new TextField();
	
	Button addButton=new Button("Add");
	
	//handling the event using interface
	EventHandler<ActionEvent> bHandler= new EventHandler<ActionEvent>()
	{
		public void handle(ActionEvent event)
		{
			try
			{
				double num1=Double.parseDouble(n1.getText());
				double num2=Double.parseDouble(n2.getText());
				double sum=num1+num2;
				ans.setText(Double.toString(sum));
			}
			catch(NumberFormatException e)
			{
				ans.setText("Invalid Input");
			}
		}
	};
	

	public static void main(String[] args) 
	{
		//entry point of the application
		launch(args);
	}
	public void start(Stage primaryStage)
	{
		
		//Initialize Pane
		//Pane pane= new Pane();
		
		//use grid pane to arrange controls in rows and column
		GridPane gridPane=new GridPane();
		
		//Initialize scene
		Scene scene= new Scene(gridPane,500,500);
		
		primaryStage.setScene(scene);
		primaryStage.show();
		primaryStage.setTitle("Calculator");
		
		//set gap between columns
		gridPane.setHgap(10);
		//set gap between rows
		gridPane.setVgap(10);
		
		//bring the gridpane to center
		gridPane.setAlignment(Pos.CENTER);
		
		//add controls to the gridpane (col,row)
		gridPane.add(first, 0, 0);//col 0 row 0
		gridPane.add(n1, 1, 0);//col 1 row 0
		gridPane.add(second, 0, 1);//col 0 row 1
		gridPane.add(n2, 1, 1);//col 1 row 1
		gridPane.add(result, 0, 2);//col 0 row 2
		gridPane.add(ans, 1, 2);//col 1 row 2
		gridPane.add(addButton, 1, 3);//col 1 row 3
		
		//attach event hanler to the button
		addButton.setOnAction(bHandler);
		
	}

}
