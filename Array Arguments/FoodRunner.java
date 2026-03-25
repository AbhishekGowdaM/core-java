class FoodRunner{

	public static void main(String[] values){
		
		String name="veg pulao";
		String[] item=FoodItem.getIngridients(name);
		
		
		if(item!=null){
			System.out.println("the item lenght is :"+item.length);
			
			for(String ref:item){
				System.out.println("the item required is:"+ref);
			}
		}

		name="paneer tikka";
		item=FoodItem.getIngridients(name);
		
		if(item!=null){
			System.out.println("the item lenght is :"+item.length);
			
			for(String ref:item){
				System.out.println("the item required is:"+ref);
			}
		}

		name="masala dosa";
		item=FoodItem.getIngridients(name);
		
		if(item!=null){
			System.out.println("the item lenght is :"+item.length);
			
			for(String ref:item){
				System.out.println("the item required is:"+ref);
			}
		}

		name="chocolate cake";
		item=FoodItem.getIngridients(name);
		
		if(item!=null){
			System.out.println("the item lenght is :"+item.length);
			
			for(String ref:item){
				System.out.println("the item required is:"+ref);
			}
		}
		
	}
}