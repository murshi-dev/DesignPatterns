package salford.mvcdemo;

import javafx.event.Event;
import javafx.event.EventHandler;

public class Controller implements EventHandler{
	Model model;
	View view;
	public Controller(Model model, View view) {
		super();
		this.model = model;
		this.view = view;
		
		//event is gen by submitbutton 
		this.view.submitButton.setOnAction(this);
		
	}
	//following function controls the model
	public void addCustomer(String name)
	{
		model.addCustomer(name);
	}
	//following function controls the view
	public void updateView()
	{
		view.updateView();
	}
	@Override
	public void handle(Event event) {
		if(event.getSource()==this.view.submitButton)
		{
			addCustomer(view.nameTF.getText());
			updateView();
		}
	}
}
