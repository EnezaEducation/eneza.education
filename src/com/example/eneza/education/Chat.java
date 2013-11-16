package com.example.eneza.education;

import android.os.Bundle;
import android.app.Activity;
import android.view.*;
import android.widget.*;

public class Chat extends Activity {
	
	TextView chatHistory;
	EditText message;
	Button send;
	
	 @Override
	    protected void onCreate(Bundle savedInstanceState) {
		 super.onCreate(savedInstanceState);
	        setContentView(R.layout.chat);
	        
	       chatHistory = (TextView) findViewById(R.id.console);
	       message = (EditText) findViewById(R.id.userTextIp);
	       send = (Button) findViewById(R.id.sendBtn);
	       send.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				//send the message
				chatHistory.append(message.getText());
				//remove the text from message
				
				
			}
		});
	        
	 }
	
	
}
