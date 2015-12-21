##持久化技术  
3种  
1. 文件存储  
2. SharedPreference存储  
3. 数据库存储  


文件存储:适合简单的文本数据和二进制数据  
核心
```
in = openFileInput("data");
//MODE_PRIVATE 和MODE_APPEND
out = openFileOutput("data", Context.MODE_PRIVATE);
```