
public class FloristShop {
	//order a bouquet using the FlowerBouquet class
	//abstracting the complexity - ABSTRACTION
	public FlowerBouquet orderBouquet(String[] types, int[] counts)
	{
		//create object for FlowerBouquet class
		FlowerBouquet bouquet = new FlowerBouquet();
		bouquet.setFlowers(types, counts);
		return bouquet;
	}
    
	public String[] getAvailableFlowers()
	{
		return new String[] {"Roses","Tulips","Daisies"};
	}
}
