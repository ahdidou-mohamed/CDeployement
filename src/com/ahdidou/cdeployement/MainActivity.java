package com.ahdidou.cdeployement;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {

		final String LOG_TAG = "MainScreen";  
		super.onCreate(savedInstanceState);  
		setContentView(R.layout.activity_main);  
		final EditText value1 = (EditText) findViewById(R.id.value1);  
		final EditText value2 = (EditText) findViewById(R.id.value2);  
		final TextView result = (TextView) findViewById(R.id.result);  
		Button addButton = (Button) findViewById(R.id.addValues);  

		if (true) {

		}
		addButton.setOnClickListener(new OnClickListener() {  
			public void onClick(View v) {  
				try {  
					int val1 = Integer.parseInt(value1.getText().toString());  
					int val2 = Integer.parseInt(value2.getText().toString());  
					Integer answer = val1 + val2;  
					result.setText(answer.toString());  
				} catch (Exception e) {  
					Log.e(LOG_TAG, "Failed to add numbers", e);  
				}  
			}  
		});  
		Button multiplyButton = (Button) findViewById(R.id.multiplyValues);  
		multiplyButton.setOnClickListener(new OnClickListener() {  
			public void onClick(View v) {  
				try {  
					int val1 = Integer.parseInt(value1.getText().toString());  
					int val2 = Integer.parseInt(value2.getText().toString());  
					Integer answer = val1 * val2;  
					result.setText(answer.toString());  
				} catch (Exception e) {  
					Log.e(LOG_TAG, "Failed to multiply numbers", e);  
				}  
			}  
		});
		
		Button substructButton = (Button) findViewById(R.id.substructValues);  
		substructButton.setOnClickListener(new OnClickListener() {  
			public void onClick(View v) {  
				try {  
					int val1 = Integer.parseInt(value1.getText().toString());  
					int val2 = Integer.parseInt(value2.getText().toString());  
					Integer answer = val1 - val2;  
					result.setText(answer.toString());  
				} catch (Exception e) {  
					Log.e(LOG_TAG, "Failed to multiply numbers", e);  
				}  
			}  
		});
		
		Button showNextButton = (Button) findViewById(R.id.showNext);  
		showNextButton.setOnClickListener(new OnClickListener() {  
			public void onClick(View v) {  
				try {  
					
					Intent intent = new Intent(MainActivity.this, MainAsynkActivity.class);
					
					startActivity(intent);
					
				} catch (Exception e) {  
					Log.e(LOG_TAG, "Failed to multiply numbers", e);  
				}  
			}  
		});

	}

	public float addValues(float a, float b) {

		return a+b;

	}

}
