package com.nisith.camerademo;

import android.os.Bundle;
import android.provider.MediaStore;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
	EditText name;
	Button camera;
	int cam = 1313;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = (EditText) findViewById(R.id.editText_name);
        camera = (Button) findViewById(R.id.button_camera);
        camera.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if(name.getText().length() == 0){
					Toast.makeText(MainActivity.this, "Enter Your Name", Toast.LENGTH_SHORT).show();
				}else{
			Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
			startActivityForResult(intent, cam);

				}
			}
		});
       
    }
}
