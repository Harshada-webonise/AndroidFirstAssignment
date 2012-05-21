package com.android.hello_user;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class UserDetails extends Activity 
{
   
	TextView nameTextView;
	TextView ageTextView;
	 public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
            setContentView(R.layout.userdetails);     
	   Intent intent=getIntent();
	   String username=intent.getExtras().getString("username");
	   String userage=intent.getExtras().getString("userage");
	   
	   nameTextView=(TextView) findViewById(R.id.lblName);
       nameTextView.setText(username);
       
       ageTextView=(TextView) findViewById(R.id.lblAge);
       ageTextView.setText(userage);
       
	 
	 
	 }
	
	
}
