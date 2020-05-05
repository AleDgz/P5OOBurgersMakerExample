
public class DeluxeBurger extends Burger{

	public DeluxeBurger(String breadRollType, String meetType, double hamburgerPrice) {
		super(breadRollType,meetType,hamburgerPrice);
		System.out.println("Price of the deluxe Burger with "+ breadRollType+ " roll, and "+ meetType + " meet, is " + hamburgerPrice );
		super.setExtraIngredient1("soda", 2.00);
		super.setExtraIngredient2("fries", 3.00);
		
	}

	@Override
	public void setExtraIngredient1(String extraIngredient1, double extraIngredientPrice1) {
		System.out.println("Can not add extra ingredient.");
	}
	
	@Override
	public void setExtraIngredient2(String extraIngredient2, double extraIngredientPrice2) {
		System.out.println("Can not add extra ingredient.");
	}
	
}
