package net.ccrew.tax_calc;

public class Calculate {
	public float raw_calc (float rate, float gross){
		float net;
		net = gross / (1 + (rate / 100));
		net = (float) ((int) ((net+0.005)*100.0)/100.0);
		
		if (rate * net == gross){
			return net;
		}else{
			if (rate * net > gross){
				net = (float) (net - .01);
			}
			//call for dialog
			return net;		
		}
	}
	
	public boolean proof (float rate, float gross, float net){
		if (rate * net == gross){
			return true;
		} else {
			return false;
		}
	}

}
