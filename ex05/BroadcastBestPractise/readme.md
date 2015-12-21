##练习内容  
最佳实践————实现强制下线功能  

注意点  
对话框：要  
```
 //需要设置AlertDialog的类型，保证在广播接收器中可以正常弹出
        alertDialog.getWindow().setType(WindowManager.LayoutParams.TYPE_SYSTEM_ALERT);
``` 
要xml上注册权限，  

另外注意  
<uses-permission android:name="android.permission.SYSTEM_ALERT_WINDOW"/>  

如果小写也不会提示错误，但是运行时会报错，需要注意