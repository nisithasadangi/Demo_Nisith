package com.nisith.facebook;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.widget.TextView;

public class HomeActivity extends Activity {
	TextView text;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home);
		text = (TextView) findViewById(R.id.textView_text);
		
		Intent intent = getIntent();
		Bundle b = intent.getExtras();
		String s = b.getString("Key1");
		
		text.setText("Hello"+s);
	}


}
