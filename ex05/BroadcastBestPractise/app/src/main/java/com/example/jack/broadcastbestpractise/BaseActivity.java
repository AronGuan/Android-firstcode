package com.example.jack.broadcastbestpractise;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by jack on 2015/11/20.
 */
public class BaseActivity extends Activity{

    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        ActivityCollector.addActivity(this);
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        ActivityCollector.removeActivity(this);
    }
}
