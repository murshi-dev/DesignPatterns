package salford.mvcdemo;

import java.util.ArrayList;

public class Model {
	ArrayList<Customer> customers = new ArrayList<Customer>();
	public void addCustomer(String name)
	{
		customers.add(new Customer(name));
	}

}
