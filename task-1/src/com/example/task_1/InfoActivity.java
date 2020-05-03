package com.example.task_1;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

public class InfoActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Bundle bundle = getIntent().getBundleExtra("stu");
		String name = bundle.getString("name");
		String age = bundle.getString("age");
		String pwd = bundle.getString("pwd");
		
		Toast.makeText(getApplicationContext(), 
				name +"|"+ age + "|"+ pwd, 
				Toast.LENGTH_LONG).show();
	}

}
