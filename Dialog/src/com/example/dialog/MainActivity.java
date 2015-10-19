package com.example.dialog;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.view.Menu;
import android.widget.Button;

public class MainActivity extends Activity {
	Button alertbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        alertbutton = (Button) findViewById(R.id.button1);
        
    }
    
    
}
