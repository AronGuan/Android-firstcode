#ListView  
需要适配器，比较好的是ArrayAdapter。  
```
//默认布局
 ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                MainActivity.this,android.R.layout.simple_list_item_1,data);
        ListView listView = (ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);
```

##定制ListView的界面  
1. 写自定义布局  

2. 写自定义适配器，重写构造方法和getView()方法  

3. 在mainActivity中  
```
        FruitAdapter adapter = new FruitAdapter(MainActivity.this,
                R.layout.fruit_item,fruitList);
        ListView listView = (ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);
```  

###提升效率  
1. 通过getView()方法中converView参数  
不要每次都将布局重新加载一遍
```
        if(convertView == null){
            view = LayoutInflater.from(getContext()).inflate(resourceId, null);
        }else{
            view = convertView;
        }
```

2. 通过viewHolder优化findViewById部分  
```
  if(convertView == null){
            view = LayoutInflater.from(getContext()).inflate(resourceId, null);
            viewHolder = new ViewHolder();
            viewHolder.fruitImage = (ImageView)view.findViewById(R.id.fruit_image);
            viewHolder.fruitName = (TextView)view.findViewById(R.id.fruit_name);
            view.setTag(viewHolder);  //将ViewHolder存储在View中
        }else{
            view = convertView;
            viewHolder = (ViewHolder)view.getTag(); //重新获取viewHolder
        }
        viewHolder.fruitImage.setImageResource(fruit.getImageId());
        viewHolder.fruitName.setText(fruit.getName());
        
        
        
    class ViewHolder{
        ImageView fruitImage;
        TextView fruitName;
    }
```  

##点击事件  
```
 listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Fruit fruit = fruitList.get(position);
                Toast.makeText(MainActivity.this,fruit.getName(),
                        Toast.LENGTH_SHORT).show();
            }
        });
```  


##单位和尺寸 
dp和sp  
sp:用于指定文字的大小  
dp:控件用