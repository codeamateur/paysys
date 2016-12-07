package com.zjgt.paySys.common.citic.utils;

import java.io.IOException;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

public class Bean2Json {
	
	public static String convertJson(Object obj){
		ObjectMapper mapper = new ObjectMapper();
		mapper.setSerializationInclusion(Inclusion.NON_NULL);
		try {
			return mapper.writeValueAsString(obj);
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
}
