package com.nisith.helloworld;

import android.os.Bundle;
import android.app.Activity;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public  class MainActivity extends Activity implements OnClickListener{
	Button loginbutton,cancelbutton,signupbutton;
	EditText usernameedittext,passwordedittext;
	String stusername = "user1";
	String stpassword = "1234";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loginbutton=(Button) findViewById(R.id.loginbutton);
        cancelbutton=(Button) findViewById(R.id.cancelbutton);
        signupbutton=(Button) findViewById(R.id.signupbutton);
        usernameedittext = (EditText) findViewById(R.id.usernameeditText);
        passwordedittext = (EditText) findViewById(R.id.passwordeditText);
        signupbutton.setOnClickListener(this);
        cancelbutton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
			usernameedittext.setText("");
			passwordedittext.setText("");
			}
		});
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    public void login(View v1){
    	String entusername = usernameedittext.getText().toString();
    	String entpassword = passwordedittext.getText().toString();
    	if(stusername.equalsIgnoreCase(entusername) && stpassword.equals(entpassword))
    	{
    		Toast.makeText(this, "Login Sucessful", Toast.LENGTH_SHORT).show();
    		Log.d("DEBUG", "Login Sucessful");
    		
    	}else{
    		Toast.makeText(this, "Login Failed", Toast.LENGTH_SHORT).show();
    		Log.d("DEBUG", "Login Failed");
    	}
    }


	@Override
	public void onClick(View arg0) {
		Toast.makeText(this, "Sign up button clicked", Toast.LENGTH_SHORT).show();	
	}
}
