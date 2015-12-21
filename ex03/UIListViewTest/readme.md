#ListView  
��Ҫ���������ȽϺõ���ArrayAdapter��  
```
//Ĭ�ϲ���
 ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                MainActivity.this,android.R.layout.simple_list_item_1,data);
        ListView listView = (ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);
```

##����ListView�Ľ���  
1. д�Զ��岼��  

2. д�Զ�������������д���췽����getView()����  

3. ��mainActivity��  
```
        FruitAdapter adapter = new FruitAdapter(MainActivity.this,
                R.layout.fruit_item,fruitList);
        ListView listView = (ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);
```  

###����Ч��  
1. ͨ��getView()������converView����  
��Ҫÿ�ζ����������¼���һ��
```
        if(convertView == null){
            view = LayoutInflater.from(getContext()).inflate(resourceId, null);
        }else{
            view = convertView;
        }
```

2. ͨ��viewHolder�Ż�findViewById����  
```
  if(convertView == null){
            view = LayoutInflater.from(getContext()).inflate(resourceId, null);
            viewHolder = new ViewHolder();
            viewHolder.fruitImage = (ImageView)view.findViewById(R.id.fruit_image);
            viewHolder.fruitName = (TextView)view.findViewById(R.id.fruit_name);
            view.setTag(viewHolder);  //��ViewHolder�洢��View��
        }else{
            view = convertView;
            viewHolder = (ViewHolder)view.getTag(); //���»�ȡviewHolder
        }
        viewHolder.fruitImage.setImageResource(fruit.getImageId());
        viewHolder.fruitName.setText(fruit.getName());
        
        
        
    class ViewHolder{
        ImageView fruitImage;
        TextView fruitName;
    }
```  

##����¼�  
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


##��λ�ͳߴ� 
dp��sp  
sp:����ָ�����ֵĴ�С  
dp:�ؼ���