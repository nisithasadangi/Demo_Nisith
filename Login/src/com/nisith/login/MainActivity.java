package com.nisith.login;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
	EditText username,password;
	Button login;
	CheckBox rememberpassword;
	String stusername = "user",stpassword = "1234";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = (EditText) findViewById(R.id.editText_username);
        password = (EditText) findViewById(R.id.editText_password);
        login = (Button) findViewById(R.id.button_login);
        rememberpassword = (CheckBox) findViewById(R.id.checkBox_rememberpswd);
        
        
        login.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
			String entusername = username.getText().toString();
			String entpassword = password.getText().toString();	
			if (stusername.equalsIgnoreCase(entusername) && stpassword.equals(entpassword)) {
				Toast.makeText(MainActivity.this, "Login Sucessfull", Toast.LENGTH_SHORT).show();
			}else{
				Toast.makeText(MainActivity.this, "Login Failed", Toast.LENGTH_SHORT).show();
			}
			}
		});
    }


    
    
}
