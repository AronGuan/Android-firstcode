##���缼��  
webView�ؼ�  
```
 webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient(){

            @Override
            public boolean shouldOverrideUrlLoading(WebView view,String url){
                view.loadUrl(url); //���ݴ���Ĳ�����ȥ�����µ���ҳ
                return true;  //��ʾ��ǰWebView���Դ��������ҳ�����󣬲��ý���ϵͳ�����
            }
        });
        webView.loadUrl("http://www.taobao.com");
```