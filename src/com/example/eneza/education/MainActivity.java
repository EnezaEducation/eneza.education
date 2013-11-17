package com.example.eneza.education;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
	Button signUp;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        setContentView(R.layout.activity_main);
        signUp = (Button) findViewById(R.id.signup);
        signUp.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Intent act2 = new Intent(getApplicationContext(), SignUp.class);
                startActivity(act2);
			}
        	
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
