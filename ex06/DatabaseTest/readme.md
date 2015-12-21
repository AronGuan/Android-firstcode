##SQLite数据库存储  
执行`db.execSQL(CREATE_BOOK)`;  

插入数据  
```
SQLiteDatabase db = dbHelper.getWritableDatabase();
                ContentValues values = new ContentValues();
                //开始组装第一条数据
                values.put("name","The Da Vinci Code");
                values.put("author","Dan Brown");
                values.put("pages",454);
                values.put("price",16.96);
                db.insert("Book",null,values); //插入第一条记录
```  

更新数据  
```
 SQLiteDatabase db = dbHelper.getWritableDatabase();
                ContentValues values = new ContentValues();
                values.put("price",10.99);
                db.update("Book",values,"name=?",new String[]{"The daVinci Code"});
```  

删除数据
```
deleteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SQLiteDatabase db = dbHelper.getWritableDatabase();
                db.delete("Book","pages > ?",new String[]{"500"});
            }
        });
```

查询数据库  
```
queryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SQLiteDatabase db = dbHelper.getWritableDatabase();
                //查询Book表中所有的数据
                Cursor cursor = db.query("Book",null,null,null,null,null,null);
                if(cursor.moveToFirst()){
                    do{
                        //遍历Cursor对象，取出数据并打印
                        String name = cursor.getString(cursor.getColumnIndex("name"));
                        String author = cursor.getString(cursor.getColumnIndex("author"));
                        int pages = cursor.getInt(cursor.getColumnIndex("pages"));
                        double price = cursor.getDouble(cursor.getColumnIndex("price"));
                        Log.d("MainActivity","book name is" + name);
                        Log.d("MainActivity","book author is" + author);
                        Log.d("MainActivity","book pages is" + pages);
                        Log.d("MainActivity","book price is" + price);
                    }while (cursor.moveToNext());
                }
                cursor.close();
            }
        });
```

使用SQL操作数据库  
db.execSQL(sql语句)  

事务  
db.beginTransaction(); //开启事务  
db.setTransactionSuccessful();//事务已经执行成功  
db.endTransaction(); //结束事务