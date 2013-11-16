package com.example.eneza.education;

import android.os.Bundle;
import android.app.Activity;
import android.view.*;
import android.widget.*;

public class StudentManager extends Activity{

	Button manageStudents, assignWork, openChat, viewReports;
	
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.manage_students);
        
        
        manageStudents = (Button) findViewById(R.id.button1);
        assignWork = (Button) findViewById(R.id.button2);
        openChat = (Button) findViewById(R.id.button3);
        viewReports = (Button) findViewById(R.id.button4);
        
        manageStudents.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			}
		});
        
        assignWork.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			}
		});
        
        openChat.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			}
		});
        
        viewReports.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			}
		});
	}
	
}
