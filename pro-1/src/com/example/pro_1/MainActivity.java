package com.example.pro_1;

import com.example.androiddemo1.R;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {
	//1. ���ݵڶ�������ʾ������Ӷ�Ӧ�������Ա��

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        //3. ���á����桱��ť�����¼�����ȡEditText��ֵ����ͨ��SharedPreference
        //�ౣ�����ݡ�
        //- ����EditText��ֵ�����ȫ��Ϊ���򷵻�
        //- ʵ����һ��SharedPreferences���󣬶������ֺͷ������ͣ��洢�ļ�����
        //  ��Ϊzhcs.xml,����������˽�еģ�ֻ����������ʡ�
        //- ��ȡ�༭�����������ݵ��ļ���
        
        //4. �������ʵ�֡�������չ��ܡ�,������ð�ť��EditText�е��������ݶ�
        //����ա�
        
        //5. �������ʵ�֡���ȡ��ť�����ܡ��������ȡ��ť�󣬳���ͨ��
        //   SharedPreferencesд�뵽�ƶ��豸�С�
        
        


    }
    //2. ����ΪinitView()����������룬�ú�����Ҫ�����ǳ�ʼ����������ʾ�����
    public void initView()
    {
    	
    }
    
    
    
    

}