package salford.mvcdemo;

import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

public class View {
	Pane pane;
	Model model;
	
	Button submitButton;
	TextField nameTF;
	TextArea customersTA;
	
	public View(Pane pane, Model model) {
		super();
		this.pane = pane;
		this.model = model;
		
		submitButton = new Button("Submit");
		submitButton.setLayoutX(10);
		submitButton.setLayoutY(10);
		
		nameTF =  new TextField();
		nameTF.setLayoutX(10);
		nameTF.setLayoutY(50);
		
		customersTA = new TextArea();
		customersTA.setLayoutX(200);
		customersTA.setLayoutY(10);
		customersTA.setPrefSize(350, 350);
		
		pane.getChildren().addAll(submitButton,nameTF,customersTA);
	}
	public void updateView()//invoked to refresh the view with customer names
	{
		String text = "";
		for(Customer c:model.customers)
		{
			text=text+c.name+"\n";//accumulate names from arraylist and store in 'text'
		}
		customersTA.setText(text);//fill textarea with the 'text'
	}
}
	


