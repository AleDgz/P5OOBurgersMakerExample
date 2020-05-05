
public class HealthyBurger extends Burger{
	
	private boolean mushrooms = true;
	
	public HealthyBurger (String meetType, double hamburgerPrice ) {
		super("brown rye", meetType,hamburgerPrice);
		this.mushrooms = mushrooms;
		System.out.println("Price of the healthy Burger with brown rye roll and "+ meetType + " meet, is " + hamburgerPrice );
	}
}
