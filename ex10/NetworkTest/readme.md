##���缼��  
HttpURLConnection��ʹ��  
```
 URL url = new URL("http://www.baidu.com");
                    connection = (HttpURLConnection)url.openConnection();
                    connection.setRequestMethod("GET");
                    connection.setConnectTimeout(8000);
                    connection.setReadTimeout(8000);
                    InputStream in = connection.getInputStream();
                    //����Ի�ȡ�������������ж�ȡ
                    BufferedReader reader = new BufferedReader(new InputStreamReader(in));
                    StringBuilder response = new StringBuilder();
```  
����Ƿ���post����  
```
connection.setRequestMethod("POSt");
DataOutputStream out = new DataOutputStream(connection.getOutputStream());                    out.writeByte("username=amdmin&password=123456");
```  

##ʹ��HttpClient  
```
 HttpClient httpClient = new DefaultHttpClient();
                    HttpGet httpGet = new HttpGet("http://www.baidu.com");
                    HttpResponse httpResponse = httpClient.execute(httpGet);
                    if(httpResponse.getStatusLine().getStatusCode() == 200){
                        //�������Ӧ���ɹ���
                        HttpEntity entity = httpResponse.getEntity();
                        String response = EntityUtils.toString(entity, "utf-8");
                        Message message = new Message();
                        message.what = SHOW_RESPONSE;
                        //�����������صĽ����ŵ�Message��
                        message.obj = response.toString();
                        handler.sendMessage(message);
                    }
```  
�����о���������Ѿ��������ˡ�  

##����XML  
1. Pull������ʽ  
```
XmlPullParserFactory factory = XmlPullParserFactory.newInstance();
            XmlPullParser xmlPullParser = factory.newPullParser();
            xmlPullParser.setInput(new StringReader(xmlData));
            int eventType = xmlPullParser.getEventType();
            String id = "";
            String name="";
            String version = "";
            while (eventType != XmlPullParser.END_DOCUMENT){
                String nodeName = xmlPullParser.getName();
                switch (eventType){
                    //��ʼ����ĳ�����
                    case XmlPullParser.START_TAG: {
                        if("id".equals(nodeName)){
                            id = xmlPullParser.nextText();
                        }else if("name".equals(nodeName)){
                            name = xmlPullParser.nextText();
                        }else if("version".equals(nodeName)){
                            version = xmlPullParser.nextText();
                        }
                        break;
                    }
                    //��ɽ���ĳ�����
                    case XmlPullParser.END_TAG:{
                        if("app".equals(nodeName)){
                            Log.d("MainActivity","id is " + id);
                            Log.d("MainActivity","name is " + name);
                            Log.d("MainActivity","version is " + version);
                        }
                        break;
                    }
                    default:
                        break;
                }
                eventType = xmlPullParser.next();
            }
```
����ע��:
HttpGet httpGet = new HttpGet("http://192.168.0.117/get_data.xml");
������127.0.0.1�ᱨ��ġ�

##SAX����  
```
 SAXParserFactory factory = SAXParserFactory.newInstance();
            XMLReader xmlReader = factory.newSAXParser().getXMLReader();
            ContentHandler handler = new ContentHandler();
            //��ContentHandler��ʵ�����õ�XMLReader��
            xmlReader.setContentHandler(handler);
            //��ʼִ�н���
            xmlReader.parse(new InputSource(new StringReader(xmlData)));
```  

##json����  
JSONObject  
```
JSONArray jsonArray = new JSONArray(jsonData);
            for(int i = 0;i < jsonArray.length();i++){
                JSONObject jsonObject = jsonArray.getJSONObject(i);
                String id = jsonObject.getString("id");
                String name = jsonObject.getString("name");
                String version = jsonObject.getString("version");
                Log.d("MainActivity","id is " + id);
                Log.d("MainActivity","name is " + name);
                Log.d("MainActivity","version is " + version);
```  

GSON����Ҫ��һ��JSON��ʽ���ַ����Զ�ӳ���һ������  
��ʽ:  
1. һ����  
` Person person = gson.fromJson(jsonData,Persion.class);`  

2. һ��JSON����  
`List<Person> people = gson.fromJson(jsonData,new TypeToken<List<Person>>(){}.getType());`

�������˷ѽ����Ϊʲô���л����ţ��������£��������࣬ΪʲôҪ�ӣ���Ϊ���췽����protect��ֻ���ڰ����ã����Թ���������ʹ�ã����走��Ϊɶ����ô���ӣ�ֱ��public���ͺ��ˣ������װҲ������ô�����


