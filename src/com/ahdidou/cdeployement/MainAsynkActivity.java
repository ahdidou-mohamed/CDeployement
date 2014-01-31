package com.ahdidou.cdeployement;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainAsynkActivity extends Activity implements OnClickListener{

	protected static final String TAG = "MainAsynkActivity";
	private IJobListener listener;

	  @Override
	  protected void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.asynk_layout);
	    
	    ((Button)findViewById(R.id.button1)).setOnClickListener(this);
	  }

	  public static interface IJobListener {
	    void executionDone();
	  }

	  public void setListener(IJobListener listener) {
	    this.listener = listener;
	  }
	  
	  @Override
	  public void onClick(View view) {
		  
	    myTask.execute("test");
	    
	  }

	  final AsyncTask<String, Void, String> myTask = new AsyncTask<String, Void, String>() {

	    @Override
	    protected String doInBackground(String... arg0) {
	    	
	      return "Long running stuff";
	      
	    }
	    

	    @Override
	    protected void onPostExecute(String result) {
	    	
	      super.onPostExecute(result);
	      
	     Log.d(TAG, "Execution : "+result);
	      if (listener != null) {
	        listener.executionDone();
	      }
	    }

	  };
}
