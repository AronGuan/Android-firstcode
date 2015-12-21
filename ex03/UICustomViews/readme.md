#自定义控件  
引入布局
<include layout="@layout/title"/>  

自定义布局  
动态加载，通过借助LayoutInflater来实现  
```
LayoutInflater.from(context).inflate(R.layout.title, this);
```