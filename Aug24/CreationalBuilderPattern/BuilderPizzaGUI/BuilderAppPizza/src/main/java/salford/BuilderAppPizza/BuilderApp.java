package salford.BuilderAppPizza;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class BuilderApp extends Application
{
	FlowPane pane;
	Scene scene;
	
	//add components to the ui
	ComboBox myCombo;
	Label myLabel;
	
	//listener for the combo box changes
	//ChangeListener -- is notified when the combo box value changes(observablevalue)
	//declare it a s a field
	ChangeListener cbListener = new ChangeListener()
	{

		@Override
		public void changed(ObservableValue observable, Object oldValue, Object newValue) {
			
			//retrieve changed values from combo box -- and pass them to the label
			myLabel.setText("You have selected "+ observable.getValue());
			
		}
	};
		
	Pane ui, things;//declare fields as Pane for ui controls like button combo boxes...
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		pane = new FlowPane();
		scene = new Scene(pane,800,600);
		primaryStage.setScene(scene);
		primaryStage.show();
		
		//instantiate objects --set the size --css style conventions
		ui=new Pane();
		ui.setPrefSize(200, 600);
		ui.setStyle("-fx-background-color: #ffffc8");
		
		things = new Pane();
		things.setPrefSize(600, 600);
		things.setStyle("-fx-background-color: #fffff0");
		
		//add components to the root
		pane.getChildren().addAll(ui, things);
		
		//instantiate objects -- combo box
		//ObservableList is to set/add items to the combobox --similar to ArrayList 
		//to track changes when options in combo box are selected
		ObservableList<String> options = FXCollections.observableArrayList("Hawaaiian", "Pepperoni", "Veggie");
		myCombo = new ComboBox<>(options);
		myCombo.setLayoutX(20);
		myCombo.setLayoutY(80);
		myCombo.setValue("Choose a Pizza");
		
		ui.getChildren().add(myCombo);
		
		//instantiate objects --  labels
		myLabel =  new Label("Pizza Selection displayed here");
		myLabel.setLayoutX(20);
		myLabel.setLayoutY(20);
		things.getChildren().add(myLabel);
		
		//associate the change listener to the combo box
		myCombo.getSelectionModel().selectedItemProperty().addListener(cbListener);
	}

}











