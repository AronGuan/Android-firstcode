#��ϰ  
>1. activity�Ĵ���,��ť�ļ�����
>2. ��Ϣ֪ͨToast��ʹ��
>3. �˵��Ĵ���Menu

##Intent
��ʽ����ʽ��ʹ��intent
```
    ��ʽ
 Intent intent = new Intent(FirstActivity.this,SecondActivity.class);
    ��ʽ
 Intent intent = new Intent("com.example.jack.activitytest.ACTION_START");
 intent.addCategory("com.example.activitytest.My_CATEGORY");
 startActivity(intent);
```
action,category��ʹ��
setData(Uri):��������
<data>��xml�ϵ�����
Action_VIEW���򿪵�ַ
ACTION_DIAL:�򿪵绰

�������ݸ���һ���
```
        Intent intent = new Intent();
        intent.putExtra("data_return", "Hello FirstActivity");
        setResult(RESULT_OK,intent);
        
         protected void onActivityResult(int requestCode,int resultCode,Intent data){}
```
