package com.android.gaospconf.amonramod;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;

public class GAOSPFCActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        /* Start Splash */
        new Handler().postDelayed(new Runnable(){
            public void run() {
            	finish();
            	//startActivity(new Intent("com.android.gaospconf.amonramod.Preferences"));
              	Intent v = new Intent(GAOSPFCActivity.this, Preferences.class);
  				startActivity(v);
  			// Some feedback to the user
  			Toast.makeText(GAOSPFCActivity.this,
  					"GAOSP2 Configuration (AmonRa MOD)",
  					Toast.LENGTH_LONG).show();
            }
        }, 4000);        
    }
}

