
public class Burger {
 
	private String breadRollType;
	private String meetType;
	
	private String extraIngredient1;
	private double extraIngredientPrice1;
	
	private String extraIngredient2;
	private double extraIngredientPrice2;
	
	private double hamburgerPrice;
	
	public Burger (String breadRoolType, String meetType, double hamburgerPrice ) {
		this.breadRollType = breadRoolType;
		this.meetType = meetType;
		this.hamburgerPrice = hamburgerPrice;
	}
	
	public void setExtraIngredient1(String extraIngredient1 , double extraIngredientPrice1) {
		this.extraIngredient1 = extraIngredient1;
		this.extraIngredientPrice1 = extraIngredientPrice1;
	}
	
	public void setExtraIngredient2(String extraIngredient2 , double extraIngredientPrice2) {
		this.extraIngredient2 = extraIngredient2;
		this.extraIngredientPrice2 = extraIngredientPrice2;
	}
	
	public double addExtraIngredient() {
		if(this.extraIngredient1 != null) {
			hamburgerPrice = hamburgerPrice + extraIngredientPrice1;
		}
		if(this.extraIngredient2 != null) {
			hamburgerPrice = hamburgerPrice + extraIngredientPrice2;
		}
		return this.hamburgerPrice;
	}
	
	public double getHamburgerPrice () {
		return this.hamburgerPrice;
	}
	public String getBreadRoolType() {
		return this.breadRollType;
	}
	public String getMeetType () {
		return this.meetType;
	}
	public String getExtraIngredient1() {
		return this.extraIngredient1;
	}
	public double getExtraIngredientPrice1() {
		return this.extraIngredientPrice1;
	}
	
	public String getExtraIngredient2() {
		return this.extraIngredient2;
	}
	public double getExtraIngredientPrice2() {
		return this.extraIngredientPrice2;
	}
}
