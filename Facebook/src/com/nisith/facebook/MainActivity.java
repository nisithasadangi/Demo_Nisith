package com.nisith.facebook;

import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView.FindListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener{
	EditText username,password,name;
	Button login;
	TextView signup,forgotpswd;
	CheckBox rempswd;
	String stusername="user1";
	String stpswd="1234";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username=(EditText) findViewById(R.id.usernameeditText);
        password=(EditText) findViewById(R.id.passwordeditText);
        login=(Button) findViewById(R.id.loginbutton);
        rempswd=(CheckBox) findViewById(R.id.rempswdcheckBox);
        signup=(TextView) findViewById(R.id.signuptextView);
        forgotpswd=(TextView) findViewById(R.id.forgotpasswordtextView);
        name = (EditText) findViewById(R.id.editText_name);
        login.setOnClickListener(this);
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
	@SuppressLint("ShowToast") @Override
	public void onClick(View arg0) {
		if(stusername.equalsIgnoreCase(username.getText().toString()) && stpswd.equals(password.getText().toString())){
			Toast.makeText(this, "Login Sucessfull", Toast.LENGTH_SHORT).show();
			
			Intent intent = new Intent(MainActivity.this, HomeActivity.class);
			String stname = name.getText().toString();
			if (stname.length() == 0) {
				stname = "Guest";
			}
			intent.putExtra("Key1", stname);
			startActivity(intent);
			
			}else{
				Toast.makeText(this, "Login Failed", Toast.LENGTH_SHORT).show();
		}
	}
    
}
