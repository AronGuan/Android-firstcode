package com.example.jack.servicebestpractise;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * Created by jack on 2015/11/21.
 */
public class AlarmReceiver extends BroadcastReceiver{

    @Override
    public void onReceive(Context context,Intent intent){
        Intent i = new Intent(context,LongRunningService.class);
        context.startService(i);
    }
}
