package com.nisith.twitter;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
	EditText username,password;
	Button login;
	TextView signup,forgotpswd;
	String stusername="user1";
	String stpswd="1234";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username=(EditText) findViewById(R.id.uswenameeditText);
        password=(EditText) findViewById(R.id.passwordeditText);
        login=(Button) findViewById(R.id.loginbutton);
        signup=(TextView) findViewById(R.id.signuptextView);
        forgotpswd=(TextView) findViewById(R.id.forgotpasswordtextView);
        login.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				if(stusername.equalsIgnoreCase(username.getText().toString()) && stpswd.equals(password.getText().toString())){
					Toast.makeText(MainActivity.this, "Login Sucessfull", Toast.LENGTH_SHORT).show();
					}else{
						Toast.makeText(MainActivity.this, "Login Failed", Toast.LENGTH_SHORT).show();
				}
			
			}
		});
        forgotpswd.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Toast.makeText(MainActivity.this, "Forgot Password Clicked", Toast.LENGTH_SHORT).show();	
			}
		});
        signup.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Toast.makeText(MainActivity.this, "Signup Clicked", Toast.LENGTH_SHORT).show();
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
