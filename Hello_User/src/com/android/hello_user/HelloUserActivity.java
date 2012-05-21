package com.android.hello_user;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;



public class HelloUserActivity extends Activity implements OnClickListener
{
    /** Called when the activity is first created. */
 
    EditText nameEditText;
    EditText ageEditText;
    
    public void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       setContentView(R.layout.main);
        
     nameEditText=(EditText) findViewById(R.id.nameEditText);
     ageEditText=(EditText) findViewById(R.id.ageEditText);
        
      Button saveButton=(Button) findViewById(R.id.saveButton);
      saveButton.setOnClickListener(this);
       
       
    
}

	public void onClick(View v)
	{
		
		Intent intent=new Intent(HelloUserActivity.this,UserDetails.class);
		intent.putExtra("username", nameEditText.getText().toString());
		intent.putExtra("userage", ageEditText.getText().toString());
		startActivity(intent);
		
		
	}
	
}