package com.zjgt.paySys.common.citic.utils;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;

import com.zjgt.paySys.common.citic.bean.Result;
import com.zjgt.paySys.common.citic.bean.Stream;




public class HttpUtil {

    public static Result postXml(Stream stream,String url){
    	DefaultHttpClient client = new DefaultHttpClient();
    	String xmlData = XmlUtil.toXml(stream);
    	System.out.println(xmlData);
    	HttpPost post; 
		StringEntity entity;
		try {
			post = new HttpPost(url);
			entity = new StringEntity(xmlData,"GBK");
			post.setEntity(entity);
			post.setHeader("Content-Type","application/xml;charset=GBK");
			HttpResponse response = client.execute(post);
			if(response.getStatusLine().getStatusCode()==org.apache.http.HttpStatus.SC_OK) {
				HttpEntity reponseEntity = response.getEntity();
				InputStream in = reponseEntity.getContent();			
				ByteArrayOutputStream baos=new ByteArrayOutputStream();
				byte[] buffer=new byte[1024];
				int len=0;
				while((len=in.read(buffer))!=-1){
					baos.write(buffer,0,len);
				}
				String xml = new String(baos.toByteArray(),"GBK");
				System.out.println(xml);
				return XmlUtil.fromXML(xml, Result.class);		
			}			
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
    	return null;
    }		
}
