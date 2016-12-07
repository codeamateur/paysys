package com.zjgt.paySys.common.citic.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ClientIDUtil {

	/**
	 * 生成20位的clientID
	 * @return
	 */
	public static String generateClientID() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
		return dateFormat.format(new Date())+get6Random();
	}

	/**
	 * 随机生成6位随机数
	 * @return
	 */
	public static String get6Random() {
        String a = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String result=""; 
        for (int i = 0; i < 6; i++) 
        { 
            int rand = (int) (Math.random() * a.length());
            result += a.charAt(rand);
        }
		return result;
	}
	

}
