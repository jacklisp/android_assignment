package com.example.pro_1;

import com.example.androiddemo1.R;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {
	//1. 根据第二步的显示界面添加对应的组件成员。

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        //3. 设置“保存”按钮单击事件，获取EditText的值，并通过SharedPreference
        //类保存数据。
        //- 设置EditText的值，如果全部为空则返回
        //- 实例化一个SharedPreferences对象，定义名字和访问类型，存储文件名设
        //  置为zhcs.xml,访问类型是私有的，只允许本程序访问。
        //- 获取编辑器并保存数据到文件。
        
        //4. 补充程序，实现“数据清空功能”,当点击该按钮，EditText中的所有数据都
        //被清空。
        
        //5. 补充程序，实现“读取按钮”功能。当点击读取按钮后，程序将通过
        //   SharedPreferences写入到移动设备中。
        
        


    }
    //2. 请你为initView()函数补充代码，该函数主要功能是初始化界面上显示的组件
    public void initView()
    {
    	
    }
    
    
    
    

}