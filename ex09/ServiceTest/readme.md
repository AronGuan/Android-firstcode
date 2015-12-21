##服务  
1. 定义服务  
2. 启动服务  
```
Intent startIntent = new Intent(this,MyService.class);
                startService(startIntent); //启动服务
```

3. 注册  
4.  <service android:name=".MyService"></service>  

5. 自己停止服务  
stopSelf()方法  


##活动和服务进行通信  
```
Intent bindIntent = new Intent(this,MyService.class);
                bindService(bindIntent,connection,BIND_AUTO_CREATE);//绑定服务
                
                
unbindService(connection); //解除服务
```  

服务的生命周期 
onCreate(),onStartCommand(),onBind()和onDestory()等方法  

startService()和stopService()方法  
bindService()和unBindService()方法。  

更多技巧  
1. 前台服务，防止服务被回收掉。  
2. 在服务中开启线程时，要注意线程结束后调用stopSelf()方法来结束服务。  
也可以使用IntentService来解决，自动关闭线程。它是另起一个线程来执行。