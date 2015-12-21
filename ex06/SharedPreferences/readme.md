##SharedPreferences�洢  
ʹ�ü�ֵ�����洢���ݵġ�  

��ȡ��ʽ  
1. Context���getSharedPreferences()����  
2. Activity���е�getPreferences()����  
3. PreferenceManager���е�getDefaultSharedPreferences()������ 

�洢����  
```
SharedPreferences.Editor editor = getSharedPreferences("data",
                        MODE_PRIVATE).edit();
                editor.putString("name","Tom");
                editor.putInt("age", 28);
                editor.putBoolean("married", false);
                editor.commit();
```

��ȡ����  
```
 SharedPreferences pref = getSharedPreferences("data",
                        MODE_PRIVATE);
                String name = pref.getString("name", "");
                int age = pref.getInt("age", 0);
```