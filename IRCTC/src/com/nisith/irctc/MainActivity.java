package com.nisith.irctc;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
	EditText username,password;
	Button login,register;
	CheckBox rememberme;
	String stusername="user1";
	String stpswd="1234";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username=(EditText) findViewById(R.id.username);
        password=(EditText) findViewById(R.id.password);
        login=(Button) findViewById(R.id.login);
        register=(Button) findViewById(R.id.register);
        rememberme=(CheckBox) findViewById(R.id.rememberme);
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
        register.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Toast.makeText(MainActivity.this, "Register Clicked", Toast.LENGTH_SHORT).show();
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
