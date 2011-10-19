package net.ccrew.tax_calc;

public class Calculate {
	public float raw_calc (float rate, float amount){
		float price;
		price = amount / (1 + (rate / 100));
		price = (float) ((int) ((price+0.005)*100.0)/100.0);
		return price;
	}

}
