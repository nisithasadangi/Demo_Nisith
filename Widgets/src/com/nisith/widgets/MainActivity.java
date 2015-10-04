package com.nisith.widgets;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends Activity implements android.widget.RadioGroup.OnCheckedChangeListener{
	RadioButton radiobtnopn1;
	RadioGroup radiogroupselcns;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radiogroupselcns=(RadioGroup) findViewById(R.id.radioGroup1);
        radiobtnopn1=(RadioButton) findViewById(R.id.radioButtonoption1);
        radiogroupselcns.setOnCheckedChangeListener(MainActivity.this);
        radiobtnopn1.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(CompoundButton arg0, boolean state) {
				if(state){
					Toast.makeText(MainActivity.this, "yoy selected opn1", Toast.LENGTH_SHORT).show();
				}
				
			}
		});
    }
	@Override
	public void onCheckedChanged(RadioGroup arg0, int id) {
		switch (id) {
		case R.id.radioselection1:
			Toast.makeText(MainActivity.this, "you selected selection 1", Toast.LENGTH_SHORT).show();
			break;
		case R.id.radioselection2:
			Toast.makeText(MainActivity.this, "you selected selection 2", Toast.LENGTH_SHORT).show();
			break;
		case R.id.radioselection3:
			Toast.makeText(MainActivity.this, "you selected selection 3", Toast.LENGTH_SHORT).show();
			break;
		case R.id.radioselection4:
			Toast.makeText(MainActivity.this, "you selected selection 4", Toast.LENGTH_SHORT).show();
			break;
		case R.id.radioselection5:
			Toast.makeText(MainActivity.this, "you selected selection 4", Toast.LENGTH_SHORT).show();
			break;

		default:
			break;
		}
		
	}


   
    
}
