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

//step1: ����6��edittext���,�ֱ��ʾĳ��ͬѧ�����������䡢�绰��
//       �༶�����롢ȷ�����롣



//step2: ����������ť��һ��ʵ��ȷ�ϲ�����һ��ʵ�����ò�����
	

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // step3:ʹ�� findViewById ��������������á�
       
        //step4: ����ť��Ӽ���
        btn1.setOnClickListener(new View.OnClickListener() {
			
			@Override
      public void onClick(View arg0) {
        //step5: ʹ��EditText�����getText()������ȡ�ַ�����
				
				//step6: �ж��������������ֲ���Ϊ��,���򵯳�Toast��ʾ��

				//step7: �ж��������������Ҫ��ͬ,���򵯳�Toast��ʾ��

			  //step8: У��ɹ���ʹ��Intent���ֵ��ת��	
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
