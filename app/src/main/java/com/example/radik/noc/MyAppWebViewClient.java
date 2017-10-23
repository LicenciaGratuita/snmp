package com.example.radik.noc;

import android.content.Intent;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by radik on 16/10/17.
 */

class MyAppWebViewClient extends WebViewClient {
    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url){
        if (Uri.parse(url).getHost().endsWith("http://apolo.tamps.cinvestav.mx:8080/noc/")){
            return false;
        }
        Intent intent =new Intent(Intent.ACTION_VIEW,Uri.parse(url));
        view.getContext().startActivity(intent);
        return true;
    }
}