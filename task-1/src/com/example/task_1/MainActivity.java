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

//step1: 创建6个edittext组件,分别表示某个同学的姓名、年龄、电话、
//       班级、密码、确认密码。



//step2: 创建两个按钮，一个实现确认操作，一个实现重置操作。
	

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // step3:使用 findViewById 获得相关组件的引用。
       
        //step4: 给按钮添加监听
        btn1.setOnClickListener(new View.OnClickListener() {
			
			@Override
      public void onClick(View arg0) {
        //step5: 使用EditText组件的getText()方法获取字符串。
				
				//step6: 判断输入的年龄和名字不能为空,否则弹出Toast提示。

				//step7: 判断输入的两次密码要相同,否则弹出Toast提示。

			  //step8: 校验成功，使用Intent类带值跳转。	
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
