##����  
1. �������  
2. ��������  
```
Intent startIntent = new Intent(this,MyService.class);
                startService(startIntent); //��������
```

3. ע��  
4.  <service android:name=".MyService"></service>  

5. �Լ�ֹͣ����  
stopSelf()����  


##��ͷ������ͨ��  
```
Intent bindIntent = new Intent(this,MyService.class);
                bindService(bindIntent,connection,BIND_AUTO_CREATE);//�󶨷���
                
                
unbindService(connection); //�������
```  

������������� 
onCreate(),onStartCommand(),onBind()��onDestory()�ȷ���  

startService()��stopService()����  
bindService()��unBindService()������  

���༼��  
1. ǰ̨���񣬷�ֹ���񱻻��յ���  
2. �ڷ����п����߳�ʱ��Ҫע���߳̽��������stopSelf()��������������  
Ҳ����ʹ��IntentService��������Զ��ر��̡߳���������һ���߳���ִ�С�