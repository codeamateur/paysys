package com.zjgt.paySys.common.citic.utils;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class XmlUtil {
	
	private static final String XML_HEADER = "<?xml version=\"1.0\" encoding=\"GBK\"?>";
	private static final String LINE_SEPARATOR = "\n";
	
    /**将对象转成xml字符串
     * @param obj
     * @return
     */
    public static String toXml(Object obj){
    	XStream xStream = new XStream();
    	xStream.processAnnotations(obj.getClass());
    	return XML_HEADER+LINE_SEPARATOR+xStream.toXML(obj);
    }
    
    /**将xml字符串转成对象
     * @param obj
     * @return
     */
    @SuppressWarnings("unchecked")
	public static <T> T fromXML(String xml,Class<T> cls){
    	XStream xStream = new XStream(new DomDriver());
    	xStream.processAnnotations(cls);
    	T bean = (T)xStream.fromXML(xml);
		return bean;
    }
}
