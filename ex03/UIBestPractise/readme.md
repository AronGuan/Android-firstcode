##一个较为复杂的聊天界面  

注意点
```  
 adapter.notifyDataSetChanged();//当有新消息时，刷新ListView中的显示
 msgListView.setSelection(msgList.size()); //将ListView定位到最后一行
```