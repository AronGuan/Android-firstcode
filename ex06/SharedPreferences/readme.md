##SharedPreferences存储  
使用键值对来存储数据的。  

获取方式  
1. Context类的getSharedPreferences()方法  
2. Activity类中的getPreferences()方法  
3. PreferenceManager类中的getDefaultSharedPreferences()方法。 

存储数据  
```
SharedPreferences.Editor editor = getSharedPreferences("data",
                        MODE_PRIVATE).edit();
                editor.putString("name","Tom");
                editor.putInt("age", 28);
                editor.putBoolean("married", false);
                editor.commit();
```

获取数据  
```
 SharedPreferences pref = getSharedPreferences("data",
                        MODE_PRIVATE);
                String name = pref.getString("name", "");
                int age = pref.getInt("age", 0);
```