package com.example.jack.servicetest;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

/**
 * Created by jack on 2015/11/21.
 */
public class MyIntentService extends IntentService{

    public MyIntentService(){
        super("MyIntentService"); //���ø�����вι��캯��
    }

    @Override
    protected void onHandleIntent(Intent intent){
        //��ӡ��ǰ�̵߳�id
        Log.d("MyIntentService","Thread id is " + Thread.currentThread().getId());
    }

    @Override
    public void onDestroy(){
        super.onDestroy();
        Log.d("MyIntentService","onDestroy executed");
    }

}
