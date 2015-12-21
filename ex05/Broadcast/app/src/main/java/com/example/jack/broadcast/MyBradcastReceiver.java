package com.example.jack.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by jack on 2015/11/20.
 */
public class MyBradcastReceiver extends BroadcastReceiver{

    @Override
    public void onReceive(Context context,Intent intent){
        Toast.makeText(context,"received in MyBroadcastReceiver",Toast.LENGTH_SHORT).show();
        //截断消息，后面的广播接收器不能接受到消息
        abortBroadcast();
    }
}
