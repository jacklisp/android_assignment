package com.example.task_5;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.*;

public class MainActivity extends Activity {
	//btn1:返回Home主界面: 点击后打开Home界面
	//btn2:发送短信: 点击后打开短信发送界面
	//btn3:拨打电话13333333333:点击后打开拨号界面，准备给13333333333的用户打
	//     电话
	//btn4:带值跳转到第二个界面:点击后将字符串:“广西职业师范学院”通过Extras
	//     属性带值到第二个界面并显示在该界面上。
	//btn5:点击后退出程序
	   
	Button btn1; //
	Button btn2;
	Button btn3;
	Button btn4;
	Button btn5;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        btn1 = (Button)findViewById(R.id.button1);
        btn2 = (Button)findViewById(R.id.button2);
        btn3 = (Button)findViewById(R.id.button3);
        btn4 = (Button)findViewById(R.id.button4);
        btn5 = (Button)findViewById(R.id.button5);
        
        //为这5个按钮实现相应功能
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
