class FoodItem{
static String[] getIngridients(String item){
		
		System.out.println("the ingridients for making:"+item);
		
		if(item==null){
			System.out.println("item is invalid");
			return null;
		}
		
		if(item=="masala dosa"){
			String[] ingridients={"rice","urad dal","potato","onion","oil","salt"};
			return ingridients;
		}
		
		if(item=="veg pulao"){
			String[] ingridients={"rice","vegetables","spices","oil","water"};
			return ingridients;
		}
		
		if(item=="paneer tikka"){
			String[] ingridients={"paneer","curd","spices","capsicum","onion"};
			return ingridients;
		}
		
		if(item=="egg curry"){
			String[] ingridients={"eggs","onion","tomato","spices","oil"};
			return ingridients;
		}
		
		if(item=="aloo gobi"){
			String[] ingridients={"potato","cauliflower","spices","oil"};
			return ingridients;
		}
		
		if(item=="palak paneer"){
			String[] ingridients={"spinach","paneer","spices","oil"};
			return ingridients;
		}
		
		if(item=="veg noodles"){
			String[] ingridients={"noodles","vegetables","sauce","oil"};
			return ingridients;
		}
		
		if(item=="grilled sandwich"){
			String[] ingridients={"bread","butter","cheese","vegetables"};
			return ingridients;
		}
		
		if(item=="french fries"){
			String[] ingridients={"potato","oil","salt"};
			return ingridients;
		}
		
		if(item=="tandoori chicken"){
			String[] ingridients={"chicken","curd","spices","lemon"};
			return ingridients;
		}
		
		if(item=="veg burger"){
			String[] ingridients={"bun","veg patty","lettuce","sauce"};
			return ingridients;
		}
		
		if(item=="cheese pizza"){
			String[] ingridients={"flour","cheese","sauce"};
			return ingridients;
		}
		
		if(item=="tomato soup"){
			String[] ingridients={"tomato","salt","pepper","butter"};
			return ingridients;
		}
		
		if(item=="fried chicken"){
			String[] ingridients={"chicken","flour","spices","oil"};
			return ingridients;
		}
		
		if(item=="veg cutlet"){
			String[] ingridients={"vegetables","bread crumbs","spices","oil"};
			return ingridients;
		}
		
		if(item=="fruit salad"){
			String[] ingridients={"apple","banana","grapes","orange","honey"};
			return ingridients;
		}
		
		if(item=="milkshake"){
			String[] ingridients={"milk","sugar","flavor","ice cream"};
			return ingridients;
		}
		
		if(item=="brownie"){
			String[] ingridients={"flour","cocoa powder","sugar","butter","eggs"};
			return ingridients;
		}
		
		if(item=="rasgulla"){
			String[] ingridients={"milk","sugar syrup"};
			return ingridients;
		}
		
		if(item=="chocolate cake"){
			String[] ingridients={"flour","cocoa","sugar","eggs","butter"};
			return ingridients;
		}
		
		if(item=="veg biryani"){
			String[] ingridients={"rice","vegetables","spices","oil"};
			return ingridients;
		}
		
		if(item=="lemon rice"){
			String[] ingridients={"rice","lemon","peanuts","spices"};
			return ingridients;
		}
		
		if(item=="curd rice"){
			String[] ingridients={"rice","curd","salt"};
			return ingridients;
		}
		
		if(item=="paneer curry"){
			String[] ingridients={"paneer","onion","tomato","spices"};
			return ingridients;
		}
		
		if(item=="fish curry"){
			String[] ingridients={"fish","coconut","spices","oil"};
			return ingridients;
		}
		
		if(item=="chicken 65"){
			String[] ingridients={"chicken","spices","oil"};
			return ingridients;
		}
		
		if(item=="veg fried rice"){
			String[] ingridients={"rice","vegetables","soy sauce","oil"};
			return ingridients;
		}
		
		if(item=="hakka noodles"){
			String[] ingridients={"noodles","vegetables","sauce","oil"};
			return ingridients;
		}
		
		if(item=="spring dosa"){
			String[] ingridients={"dosa batter","vegetables","sauce"};
			return ingridients;
		}
		
		if(item=="ice gola"){
			String[] ingridients={"ice","syrup"};
			return ingridients;
		}
		
		if(item=="kulfi"){
			String[] ingridients={"milk","sugar","dry fruits"};
			return ingridients;
		}
		
		System.out.println("item not found");
		return null;
	}
}