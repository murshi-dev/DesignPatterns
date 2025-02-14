package salford.mvc;

import java.util.ArrayList;

public class Model {
	ArrayList<Customer> customers = new ArrayList<Customer>();
	
	public void addCustomer(String name, int age, double balance)
	{
		customers.add(new Customer(name,age,balance));
	}
}


