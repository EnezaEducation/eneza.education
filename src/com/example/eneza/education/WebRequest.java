package com.example.eneza.education;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.DefaultHttpClient;

import android.util.Log;

public class WebRequest {
	
	public static String callWebService(String URL, String deviceId, String query) {
		String result = "";
        HttpClient httpclient = new DefaultHttpClient();  
        HttpGet request = new HttpGet(URL + query);  
        request.addHeader("deviceId", deviceId);  
        ResponseHandler<String> handler = new BasicResponseHandler();  
        try {  
            result = httpclient.execute(request, handler);  
        } catch (ClientProtocolException e) {  
            e.printStackTrace();  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
        httpclient.getConnectionManager().shutdown();  
        Log.i("WebRequest - callWebService", result);
        return result;
    }
}
