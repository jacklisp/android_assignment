package com.example.task_1;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends Activity {

//����5��edittext���
private EditText ed1,ed2,ed3,ed4,ed5;
private Button btn1, btn2;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        setContentView(R.layout.layout_1);
        
        ed1 = (EditText)findViewById(R.id.editText1);
        ed2 = (EditText)findViewById(R.id.editText2);
        ed3 = (EditText)findViewById(R.id.editText3);
        ed4 = (EditText)findViewById(R.id.editText4);
        ed5 = (EditText)findViewById(R.id.editText5);
        
        btn1 = (Button)findViewById(R.id.btn1);
        btn2 = (Button)findViewById(R.id.btn2);
        
        //����ť��Ӽ���
        btn1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String xuehao = ed1.getText().toString();
				String name = ed2.getText().toString();
				String age = ed3.getText().toString();
				String pwd = ed4.getText().toString();
				String cpwd = ed5.getText().toString();
				
				//��̨����
				if(name == null || age == null)
				{
					Toast.makeText(getApplicationContext(), 
							       "�������������ֺ�������", 
							       Toast.LENGTH_LONG).show();
				}
				
				if(pwd != null && cpwd != null && pwd.equals(cpwd))
				{
					//��������,ִ����ת: �ǳ���Ҫ��֪ʶ��
					//��ֵ��ת:
					Intent intent = new Intent();
					intent.setClass(MainActivity.this, InfoActivity.class);
					
					Bundle bundle = new Bundle();
					bundle.putString("name", name);
					bundle.putString("age", age);
					bundle.putString("pwd", pwd);
					intent.putExtra("stu", bundle);
					
					startActivity(intent);
					
				} else {
					//��ʾ
					Toast.makeText(getApplicationContext(), 
						       "��û������������������������벻��ȷ", 
						       Toast.LENGTH_LONG).show();
				}
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
