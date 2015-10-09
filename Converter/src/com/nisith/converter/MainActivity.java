package com.nisith.converter;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends Activity {
	Spinner unit, fromunit, tounit;
	EditText entvalue, resvalue;
	Button result;double o;
	final String[] unitname = { "Tempreture", "Length", "Currency" };
	final String[] tempunit = { "Celsius", "Fahrenheit", "Kelvin" };
	final String[] lengthunit = { "Kilometer", "Meter" };
	final String[] currencyunit = { "INR", "USD" };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		unit = (Spinner) findViewById(R.id.unitspinner);
		fromunit = (Spinner) findViewById(R.id.fromunitspinner);
		tounit = (Spinner) findViewById(R.id.tounitspinner);
		entvalue = (EditText) findViewById(R.id.entervalueeditText);
		resvalue = (EditText) findViewById(R.id.resultvalueeditText);
		result = (Button) findViewById(R.id.resultbutton);

		ArrayAdapter<String> adapter = new ArrayAdapter<String>(
				MainActivity.this, android.R.layout.simple_dropdown_item_1line,
				unitname);
		unit.setAdapter(adapter);
		
		
		
		unit.setOnItemSelectedListener(new OnItemSelectedListener() {
				 
			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int position, long arg3) {
				switch (position) {
				case 1:
					ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(
							MainActivity.this,
							android.R.layout.simple_dropdown_item_1line,
							lengthunit);
					tounit.setAdapter(adapter2);
					fromunit.setAdapter(adapter2);
					fromunit.setOnItemSelectedListener(new OnItemSelectedListener() {

						@Override
						public void onItemSelected(AdapterView<?> arg0,
								View arg1, int position, long arg3) {
							switch (position) {
							case 1:
								tounit.setOnItemSelectedListener(new OnItemSelectedListener() {

									@Override
									public void onItemSelected(
											AdapterView<?> arg0, View arg1,
											int position, long arg3) {
										switch (position) {
										case 1:
											result.setOnClickListener(new OnClickListener() {
												
												@Override
												public void onClick(View v) {
													if (entvalue.getText().length()==0) {
													Toast.makeText(MainActivity.this, "Enter a Value", Toast.LENGTH_SHORT).show();	
													}
													else
													{
													double noentered = Double.valueOf(entvalue.getText().toString());
													
													o=noentered;
													resvalue.setText(String.valueOf(o));
													}
												}
											});
											
											
											break;

										default:
											result.setOnClickListener(new OnClickListener() {
												
												@Override
												public void onClick(View v) {
                                                       if (entvalue.getText().length()==0) {
                                                    	   Toast.makeText(MainActivity.this, "Enter a Value", Toast.LENGTH_SHORT).show();
													}
                                                       else{
													double noentered = Double.valueOf(entvalue.getText().toString());
													o=noentered/1000;
													resvalue.setText(String.valueOf(o));
                                                       }
												}
											});
											
											
											break;
										}
										
									}

									@Override
									public void onNothingSelected(
											AdapterView<?> arg0) {
										// TODO Auto-generated method stub
										
									}
								});
								
								break;

							default:
								tounit.setOnItemSelectedListener(new OnItemSelectedListener() {

									@Override
									public void onItemSelected(
											AdapterView<?> arg0, View arg1,
											int position, long arg3) {
										switch (position) {
										case 1:
											result.setOnClickListener(new OnClickListener() {
												
												@Override
												public void onClick(View v) {
                                                       if (entvalue.getText().length()==0) {
                                                    	   Toast.makeText(MainActivity.this, "Enter a Value", Toast.LENGTH_SHORT).show();
													}else{
													double noentered = Double.valueOf(entvalue.getText().toString());
													o=noentered*1000;
													resvalue.setText(String.valueOf(o));
													}
												}
											});
											
											
											break;

										default:
											result.setOnClickListener(new OnClickListener() {
												
												@Override
												public void onClick(View v) {
                                                       if (entvalue.getText().length()==0) {
                                                    	   Toast.makeText(MainActivity.this, "Enter a Value", Toast.LENGTH_SHORT).show();
													}else{
													double noentered = Double.valueOf(entvalue.getText().toString());
													o=noentered;
													resvalue.setText(String.valueOf(o));
													}
												}
											});
											
											
											break;
										}
										
									}

									@Override
									public void onNothingSelected(
											AdapterView<?> arg0) {
										// TODO Auto-generated method stub
										
									}
								});
								break;
							}
						}

						@Override
						public void onNothingSelected(AdapterView<?> arg0) {
							// TODO Auto-generated method stub
							
						}
					});

					break;
				case 2:
					ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(
							MainActivity.this,
							android.R.layout.simple_dropdown_item_1line,
							currencyunit);
					tounit.setAdapter(adapter3);
					fromunit.setAdapter(adapter3);
					fromunit.setOnItemSelectedListener(new OnItemSelectedListener() {

						@Override
						public void onItemSelected(AdapterView<?> arg0,
								View arg1, int position, long arg3) {
							switch (position) {
							case 1:
								tounit.setOnItemSelectedListener(new OnItemSelectedListener() {

									@Override
									public void onItemSelected(
											AdapterView<?> arg0, View arg1,
											int position, long arg3) {
										switch (position) {
										case 1:
											result.setOnClickListener(new OnClickListener() {
												
												@Override
												public void onClick(View v) {
                                                      if (entvalue.getText().length()==0) {
                                                    	  Toast.makeText(MainActivity.this, "Enter a Value", Toast.LENGTH_SHORT).show();
													}else{
													double noentered = Double.valueOf(entvalue.getText().toString());
													o=noentered;
													resvalue.setText(String.valueOf(o));
													}
												}
											});
											
											
											break;

										default:
											result.setOnClickListener(new OnClickListener() {
												
												@Override
												public void onClick(View v) {

													if (entvalue.getText().length()==0) {
														Toast.makeText(MainActivity.this, "Enter a Value", Toast.LENGTH_SHORT).show();
													}else{
													double noentered = Double.valueOf(entvalue.getText().toString());
													o=noentered/0.015;
													resvalue.setText(String.valueOf(o));
													}
												}
											});
											
											
											break;
										}
										
									}

									@Override
									public void onNothingSelected(
											AdapterView<?> arg0) {
										// TODO Auto-generated method stub
										
									}
								});
								
								break;

							default:
								tounit.setOnItemSelectedListener(new OnItemSelectedListener() {

									@Override
									public void onItemSelected(
											AdapterView<?> arg0, View arg1,
											int position, long arg3) {
										switch (position) {
										case 1:
											result.setOnClickListener(new OnClickListener() {
												
												@Override
												public void onClick(View v) {
                                                  if (entvalue.getText().length()==0) {
                                                	  Toast.makeText(MainActivity.this, "Enter a Value", Toast.LENGTH_SHORT).show();
													}else{
													double noentered = Double.valueOf(entvalue.getText().toString());
													o=noentered*0.015;
													resvalue.setText(String.valueOf(o));
													}
												}
											});
											
											
											break;

										default:
											result.setOnClickListener(new OnClickListener() {
												
												@Override
												public void onClick(View v) {
                                                    if (entvalue.getText().length()==0) {
                                                    	Toast.makeText(MainActivity.this, "Enter a Value", Toast.LENGTH_SHORT).show();
													}else{
													double noentered = Double.valueOf(entvalue.getText().toString());
													o=noentered;
													resvalue.setText(String.valueOf(o));
													}
												}
											});
											
											
											break;
										}
										
									}

									@Override
									public void onNothingSelected(
											AdapterView<?> arg0) {
										// TODO Auto-generated method stub
										
									}
								});
								break;
							}
						}

						@Override
						public void onNothingSelected(AdapterView<?> arg0) {
							// TODO Auto-generated method stub
							
						}
					});

					break;

				default:
					ArrayAdapter<String> adapter4 = new ArrayAdapter<String>(
							MainActivity.this,
							android.R.layout.simple_dropdown_item_1line,
							tempunit);
					tounit.setAdapter(adapter4);
					fromunit.setAdapter(adapter4);
					fromunit.setOnItemSelectedListener(new OnItemSelectedListener() {
						

						@Override
						public void onItemSelected(AdapterView<?> arg0,
								View arg1, int position, long arg3) {
							switch (position) {
							case 1:
								tounit.setOnItemSelectedListener(new OnItemSelectedListener() {

									@Override
									public void onItemSelected(
											AdapterView<?> arg0, View arg1,
											int position, long arg3) {
										switch (position) {
										case 1:
											result.setOnClickListener(new OnClickListener() {
												
												@Override
												public void onClick(View v) {
                                                      if (entvalue.getText().length()==0) {
                                                    	  Toast.makeText(MainActivity.this, "Enter a Value", Toast.LENGTH_SHORT).show();
													}else{
													double noentered = Double.valueOf(entvalue.getText().toString());
													o=noentered;
													resvalue.setText(String.valueOf(o));
													}
												}
											});
											
											
											break;
										case 2:
											result.setOnClickListener(new OnClickListener() {
												
												@Override
												public void onClick(View v) {
                                                     if (entvalue.getText().length()==0) {
                                                    	 Toast.makeText(MainActivity.this, "Enter a Value", Toast.LENGTH_SHORT).show();
													}else{
													double noentered = Double.valueOf(entvalue.getText().toString());
													o=(noentered/2.66486)+273.15;
													resvalue.setText(String.valueOf(o));
													}
												}
											});
											
											
											break;

										default:
											result.setOnClickListener(new OnClickListener() {
												
												@Override
												public void onClick(View v) {
                                                    if (entvalue.getText().length()==0) {
                                                    	Toast.makeText(MainActivity.this, "Enter a Value", Toast.LENGTH_SHORT).show();
													}else{
													double noentered = Double.valueOf(entvalue.getText().toString());
													o=noentered/2.66486;
													resvalue.setText(String.valueOf(o));
													}
												}
											});
											
											
											break;
										}										
									}

									@Override
									public void onNothingSelected(
											AdapterView<?> arg0) {
									
									}
								});
								
								break;
							case 2:
								tounit.setOnItemSelectedListener(new OnItemSelectedListener() {

									@Override
									public void onItemSelected(
											AdapterView<?> arg0, View arg1,
											int position, long arg3) {
										switch (position) {
										case 1:
											result.setOnClickListener(new OnClickListener() {
												
												@Override
												public void onClick(View v) {
                                                     if (entvalue.getText().length()==0) {
                                                    	 Toast.makeText(MainActivity.this, "Enter a Value", Toast.LENGTH_SHORT).show();
													}else{
													double noentered = Double.valueOf(entvalue.getText().toString());
													o=(noentered-273.15)*2.66486;
													resvalue.setText(String.valueOf(o));
													}
												}
											});
											
											
											break;
										case 2:
											result.setOnClickListener(new OnClickListener() {
												
												@Override
												public void onClick(View v) {
                                                     if (entvalue.getText().length()==0) {
                                                    	 Toast.makeText(MainActivity.this, "Enter a Value", Toast.LENGTH_SHORT).show();
													}else{
													double noentered = Double.valueOf(entvalue.getText().toString());
													o=noentered;
													resvalue.setText(String.valueOf(o));
													}
												}
											});
											
											
											break;

										default:
											result.setOnClickListener(new OnClickListener() {
												
												@Override
												public void onClick(View v) {
                                                       if (entvalue.getText().length()==0) {
                                                    	   Toast.makeText(MainActivity.this, "Enter a Value", Toast.LENGTH_SHORT).show();
													}else{
													double noentered = Double.valueOf(entvalue.getText().toString());
													o=noentered-273.15;
													resvalue.setText(String.valueOf(o));
													}
												}
											});
											
											
											break;
										}										
									}

									@Override
									public void onNothingSelected(
											AdapterView<?> arg0) {
									
									}
								});
								
								break;

							default:
								tounit.setOnItemSelectedListener(new OnItemSelectedListener() {

									@Override
									public void onItemSelected(
											AdapterView<?> arg0, View arg1,
											int position, long arg3) {
										switch (position) {
										case 1:
											result.setOnClickListener(new OnClickListener() {
												
												@Override
												public void onClick(View v) {
                                                        if (entvalue.getText().length()==0) {
                                                        	Toast.makeText(MainActivity.this, "Enter a Value", Toast.LENGTH_SHORT).show();
													}else{
													double noentered = Double.valueOf(entvalue.getText().toString());
													o=noentered*2.66486;
													resvalue.setText(String.valueOf(o));
													}
												}
											});
											
											
											break;
										case 2:
											result.setOnClickListener(new OnClickListener() {
												
												@Override
												public void onClick(View v) {
                                                    if (entvalue.getText().length()==0) {
                                                    	Toast.makeText(MainActivity.this, "Enter a Value", Toast.LENGTH_SHORT).show();
													}else{
													double noentered = Double.valueOf(entvalue.getText().toString());
													o=noentered+273.15;
													resvalue.setText(String.valueOf(o));
													}
												}
											});
											
											
											break;

										default:
											result.setOnClickListener(new OnClickListener() {
												
												@Override
												public void onClick(View v) {
                                                      if (entvalue.getText().length()==0) {
                                                    	  Toast.makeText(MainActivity.this, "Enter a Value", Toast.LENGTH_SHORT).show();
													}else{
													double noentered = Double.valueOf(entvalue.getText().toString());
													o=noentered;
													resvalue.setText(String.valueOf(o));
													}
												}
											});
											
											
											break;
										}										
									}

									@Override
									public void onNothingSelected(
											AdapterView<?> arg0) {
									
									}
								});
								
								break;
							}
							
						}

						@Override
						public void onNothingSelected(AdapterView<?> arg0) {
							
						}
					});
					break;
				}	
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				ArrayAdapter<String> adapter4 = new ArrayAdapter<String>(
						MainActivity.this,
						android.R.layout.simple_dropdown_item_1line,
						tempunit);
				tounit.setAdapter(adapter4);
				fromunit.setAdapter(adapter4);
			}
			
		});
		

	}

}
