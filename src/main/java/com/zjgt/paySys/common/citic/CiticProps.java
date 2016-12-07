package com.zjgt.paySys.common.citic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springside.modules.utils.PropertiesLoader;

public class CiticProps {
	private static Logger _log = LoggerFactory.getLogger(CiticProps.class);
	
	protected static PropertiesLoader propertiesLoader = new PropertiesLoader("classpath:citic/citic.properties");
	
	public static String getProperty(String key) {
		String property ;

        try {
            property = propertiesLoader.getProperty(key);
        }catch (Exception e){
            _log.debug("Property key not exit: "+key);
            return null;
        }
		return property;
	}
	
	public static String getProperty(String key, String value) {
		if (propertiesLoader.getProperty(key) == null )
			return value;
		return propertiesLoader.getProperty(key);
	}

}
