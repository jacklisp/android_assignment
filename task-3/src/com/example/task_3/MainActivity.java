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
	// ͼƬ��װΪһ������
	private int[] icon = { R.drawable.p1, R.drawable.p2, R.drawable.p3,
			R.drawable.p4, R.drawable.p5, R.drawable.p6, R.drawable.p7,
			R.drawable.p8, R.drawable.p9 };
	
	// ÿ��ͼƬ��Ӧ��˵�����ַ�װ��iconName����
	private String[] iconName = { "ͨѶ¼", "����", "����", "�ʼ�", "��Ϸ", "����", "����",
			"����", "��Ƶ" };
	
	


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //--------------�ڴ˿�ʼ��Ĵ���--------------------
        //step1: findViewById������ȡGridView���(1��)
        
        
        //step2: ����from,to,������Դ���飬fromΪ��Դ�������飬������ַ�������
        //��ʾ��Դ������,toΪ��Դid���飬ָ��item.xml��Ӧ�����id
        //��nullȡ��Ϊ��Ҫ��Ĵ��롣
        
        
        String [] from = null;//��Դ��������
        int [] to = null;//��Դid����
        
        //step3: Ϊdata_list׼������,ʹ��forѭ�������е�ͼ����Դ���ַ�����Դͨ��Map����
        //data_list�����С�(Լ4-6��)
        
 
        
        //step4: ����������SimpleAdapter,��data_list,item�Ĳ�����Դid,��Դ�������飬��Դid������Ϊ�������롣(1��)
        
        SimpleAdapter sadapter =  null;
        //step5: ʹ��gview.setAdapter����������������(1��)
        
        
        //----------------�ڴ˽�����Ĵ���---------------------------------
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
