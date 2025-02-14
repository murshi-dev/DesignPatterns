package salford.mvc;
import javafx.event.Event;
import javafx.event.EventHandler;
public class Controller implements EventHandler {

	Model model;
	View view;
	public Controller(Model model, View view) {
		super();
		this.model = model;
		this.view = view;
		this.view.submitButton.setOnAction(this);
	}
	@Override
	public void handle(Event event) {
		if (event.getSource() == this.view.submitButton) {
			addCustomer(view.nameTF.getText(), Integer.parseInt(view.ageTF.getText()),
					Double.parseDouble(view.balanceTF.getText()));
			updateView();
			view.drawChart(model.customers);
		}
	}
	public void addCustomer(String name, int age, double balance) {
		model.addCustomer(name, age, balance);
	}

	public void updateView() {
		view.updateView();
	}
}
