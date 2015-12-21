#练习  
>1. activity的创建,按钮的监听器
>2. 消息通知Toast的使用
>3. 菜单的创建Menu

##Intent
显式和隐式的使用intent
```
    显式
 Intent intent = new Intent(FirstActivity.this,SecondActivity.class);
    隐式
 Intent intent = new Intent("com.example.jack.activitytest.ACTION_START");
 intent.addCategory("com.example.activitytest.My_CATEGORY");
 startActivity(intent);
```
action,category的使用
setData(Uri):传输数据
<data>在xml上的配置
Action_VIEW：打开地址
ACTION_DIAL:打开电话

返回数据给上一个活动
```
        Intent intent = new Intent();
        intent.putExtra("data_return", "Hello FirstActivity");
        setResult(RESULT_OK,intent);
        
         protected void onActivityResult(int requestCode,int resultCode,Intent data){}
```
