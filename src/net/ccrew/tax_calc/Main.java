package net.ccrew.tax_calc;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

		final EditText et = (EditText) findViewById(R.id.editText1);
		et.setOnFocusChangeListener(new View.OnFocusChangeListener() {

			@Override
			public void onFocusChange(View v, boolean hasFocus) {
				// TODO Auto-generated method stub
				if(hasFocus){
					setRateHint();
				}
			}
		});
		final EditText et2 = (EditText) findViewById(R.id.editText2);
		et2.setOnFocusChangeListener(new View.OnFocusChangeListener() {
			
			@Override
			public void onFocusChange(View v, boolean hasFocus) {
				// TODO Auto-generated method stub
				if(hasFocus){
					setFinalHint();
				}
				
			}
		});
		final EditText et3 = (EditText) findViewById(R.id.editText3);
        
        
        Button b = (Button) findViewById(R.id.button1);
        b.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				float rate = Float.parseFloat(et.getText().toString());
				
				float amount = Float.parseFloat(et2.getText().toString());
				
				Calculate calc = new Calculate();
				float price = calc.raw_calc(rate, amount);
				
				et3.setText(String.format("%.2f", price));
								
			}
		});
    }
    public void setRateHint() {
    	TextView tv = (TextView) findViewById(R.id.textView4);
    	tv.setText(R.string.rate_hint);
    }
    
    public void setFinalHint() {
    	TextView tv = (TextView) findViewById(R.id.textView4);
    	tv.setText(R.string.final_hint);
    }

}