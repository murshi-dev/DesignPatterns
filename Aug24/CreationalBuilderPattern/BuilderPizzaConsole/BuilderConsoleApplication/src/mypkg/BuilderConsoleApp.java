package mypkg;

public class BuilderConsoleApp 
{
	Director director = new Director();
	Builder hawaaiianBuilder = new HawaaiianBuilder();
	Pizza hawaaiianPizza = null;
	
	public BuilderConsoleApp()
	{
		director.setBuilder(hawaaiianBuilder);
		director.constructProduct();
		hawaaiianPizza = director.getProduct();
		
		System.out.println(hawaaiianPizza.getInfo());
	}
	public static void main(String[] args) 
	{
		new BuilderConsoleApp();
		//menu based condition to choose the type of pizza
		//based on user selection display the pizza selcted to the console
	}

}
//Product class
class Pizza
{
	String dough, sauce, toppings;
	public void setDough(String dough)
	{
		this.dough=dough;
	}
	public void setSauce(String sauce)
	{
		this.sauce=sauce;
	}
	public void setToppings(String toppings)
	{
		this.toppings= toppings;
	}
	public String getInfo()
	{
		return "Pizza with" + dough + ", "+ sauce+ ",and "+toppings;
	}
}
//abstract builder class
abstract class Builder
{
	protected Pizza pizza;
	public Pizza getProduct()
	{
		return pizza;
	}
	public void createNewProduct()
	{
		pizza = new Pizza(); //creating the Pizza(Product) using the Builder
	}
	abstract void buildDough();
	abstract void buildSauce();
	abstract void buildToppings();
}


//Concrete Builders
class HawaaiianBuilder extends Builder
{

	@Override
	void buildDough() {
		pizza.setDough("Pan");	
	}

	@Override
	void buildSauce() {
		pizza.setSauce("Tomato sauce");	
	}

	@Override
	void buildToppings() {
		pizza.setToppings("Chicken and Pineapple" );	
	}
}

//Director
class Director
{
	private Builder builder;
	public void setBuilder(Builder b)
	{
		builder=b;
	}
	public Pizza getProduct()
	{
		return builder.getProduct();
	}
	public void constructProduct()
	{
		builder.createNewProduct();
		builder.buildDough();
		builder.buildSauce();
		builder.buildToppings();
	}
}

















