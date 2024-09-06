
public class TestFlorist {

	public static void main(String[] args) {
		
		FloristShop floristshop = new FloristShop();
		//display the available flowers
		System.out.println("Available Flowers: ");
		for(String flower:floristshop.getAvailableFlowers())
		{
			System.out.println(flower);
		}
		//order a bouquet 
		String[] selectedFlowers= {"Roses","Daisies"};
		int[] flowerCounts = {3,5};
		
		FlowerBouquet bouquet = floristshop.orderBouquet(selectedFlowers, flowerCounts);
		System.out.println("Bouquet Price: "+bouquet.getPrice());
		}

}
