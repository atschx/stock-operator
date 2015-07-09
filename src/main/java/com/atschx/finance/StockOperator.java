package com.atschx.finance;

import java.io.IOException;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class StockOperator {
	
	public static void main(String[] args) throws ClientProtocolException, IOException {
		
		CloseableHttpClient httpclient = HttpClients.createDefault();
		HttpGet httpget = new HttpGet("http://money.finance.sina.com.cn/d/api/openapi_proxy.php/?__s=[[%22hq%22,%22hs_a%22,%22%22,0,1,600]]");
		CloseableHttpResponse response = httpclient.execute(httpget);
		try {
		    HttpEntity entity = response.getEntity();
		    if (entity != null) {
		    	String jsonStr = EntityUtils.toString(entity);
				System.out.println(jsonStr);
//		        long len = entity.getContentLength();
//		        entity.getContent().
//		        if (len != -1 && len < 2048) {
//		        } else {
//		            // Stream content out
//		        }
		    	
		    	Gson gson = new GsonBuilder().create();
		    	 StockModel[] models =gson.fromJson(jsonStr, StockModel[].class);
		    	 
		    	 for (StockModel stockModel : models) {
					System.out.println(stockModel.getCode());
					System.out.println(stockModel.getDay());
//					List<String> fields = stockModel.getFields();
//					for (String fieldName : fields) {
//						System.out.println(fieldName);
//					}
					List<List<String>> items = stockModel.getItems();
					System.out.println(items.size());
//					for (List<String> item : items) {
//						System.out.println(item.get(1));
//					}
				}
		    }
		} finally {
		    response.close();
		}
	}

}
