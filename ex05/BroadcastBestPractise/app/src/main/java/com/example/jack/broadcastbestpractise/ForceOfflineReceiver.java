package com.example.jack.broadcastbestpractise;

import android.app.AlertDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.WindowManager;

/**
 * Created by jack on 2015/11/20.
 */
public class ForceOfflineReceiver extends BroadcastReceiver{

    @Override
    public void onReceive(final Context context,Intent intent){
        AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(context);
        dialogBuilder.setTitle("Warning");
        dialogBuilder.setMessage("You are forced to be offline,Please try " +
                "to login again");
        dialogBuilder.setCancelable(false);
        dialogBuilder.setPositiveButton("OK", new
                DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        ActivityCollector.finishAll();
                         //�������л
                        Intent intent = new Intent(context, LoginActivity.class);
                        //����activity��Tast�еı���
                        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        context.startActivity(intent); //��������LoginActivity
                    }
                });
        AlertDialog alertDialog = dialogBuilder.create();
        //��Ҫ����AlertDialog�����ͣ���֤�ڹ㲥�������п�����������
        alertDialog.getWindow().setType(WindowManager.LayoutParams.TYPE_SYSTEM_ALERT);
        alertDialog.show();
    }
}
