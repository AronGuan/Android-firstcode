##SQLite���ݿ�洢  
ִ��`db.execSQL(CREATE_BOOK)`;  

��������  
```
SQLiteDatabase db = dbHelper.getWritableDatabase();
                ContentValues values = new ContentValues();
                //��ʼ��װ��һ������
                values.put("name","The Da Vinci Code");
                values.put("author","Dan Brown");
                values.put("pages",454);
                values.put("price",16.96);
                db.insert("Book",null,values); //�����һ����¼
```  

��������  
```
 SQLiteDatabase db = dbHelper.getWritableDatabase();
                ContentValues values = new ContentValues();
                values.put("price",10.99);
                db.update("Book",values,"name=?",new String[]{"The daVinci Code"});
```  

ɾ������
```
deleteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SQLiteDatabase db = dbHelper.getWritableDatabase();
                db.delete("Book","pages > ?",new String[]{"500"});
            }
        });
```

��ѯ���ݿ�  
```
queryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SQLiteDatabase db = dbHelper.getWritableDatabase();
                //��ѯBook�������е�����
                Cursor cursor = db.query("Book",null,null,null,null,null,null);
                if(cursor.moveToFirst()){
                    do{
                        //����Cursor����ȡ�����ݲ���ӡ
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

ʹ��SQL�������ݿ�  
db.execSQL(sql���)  

����  
db.beginTransaction(); //��������  
db.setTransactionSuccessful();//�����Ѿ�ִ�гɹ�  
db.endTransaction(); //��������