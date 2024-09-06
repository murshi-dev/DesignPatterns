
public class FlowerBouquet {
	//private properties
	private String[] flowerTypes;
	private int[] flowerCounts;
	private double price;
	
	//public methods
	public void setFlowers(String[] types,int[] counts)
	{
		flowerTypes=types;
		flowerCounts=counts;
		calculatePrice();//encapsulated method call
	}
	public double getPrice()
	{
		return price;
	}
	//method to calculate price - internal logic hidden using private
	private void calculatePrice()
	{
		//assume each flower is rm 5
		price=0;
		for(int count:flowerCounts)
		{
			price+=count*5;
		}
		
	}

}
