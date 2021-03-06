package com.example.task_3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.GridView;
import android.widget.SimpleAdapter;

public class MainActivity extends Activity {
	private GridView gview;
	private List<Map<String, Object>> data_list = new ArrayList();
	private SimpleAdapter sim_adapter;
	// 图片封装为一个数组
	private int[] icon = { R.drawable.p1, R.drawable.p2, R.drawable.p3,
			R.drawable.p4, R.drawable.p5, R.drawable.p6, R.drawable.p7,
			R.drawable.p8, R.drawable.p9 };
	
	// 每张图片对应的说明文字封装成iconName数组
	private String[] iconName = { "通讯录", "日历", "闹钟", "邮件", "游戏", "语音", "铃声",
			"设置", "视频" };
	
	


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //--------------在此开始你的代码--------------------
        //step1: findViewById方法获取GridView组件(1行)
        
        
        //step2: 构造from,to,两个资源数组，from为资源名称数组，里面的字符串内容
        //表示资源的名称,to为资源id数组，指向item.xml对应组件的id
        //将null取代为你要填的代码。
        
        
        String [] from = null;//资源名称数组
        int [] to = null;//资源id数组
        
        //step3: 为data_list准备数据,使用for循环将所有的图像资源和字符串资源通过Map存入
        //data_list链表中。(约4-6行)
        
 
        
        //step4: 创建适配器SimpleAdapter,将data_list,item的布局资源id,资源名称数组，资源id数组作为参数传入。(1行)
        
        SimpleAdapter sadapter =  null;
        //step5: 使用gview.setAdapter方法设置适配器。(1行)
        
        
        //----------------在此结束你的代码---------------------------------
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
