package com.example.jack.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by jack on 2015/11/20.
 */
public class AnotherBroadcastReceiver extends BroadcastReceiver{

    @Override
    public void onReceive(Context context,Intent intent){
        Toast.makeText(context,"received in AnotherBroadcastReceiver",Toast.LENGTH_SHORT).show();
    }
}
