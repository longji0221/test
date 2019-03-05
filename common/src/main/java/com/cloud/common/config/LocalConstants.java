package com.cloud.common.config;

import java.nio.charset.Charset;

public class LocalConstants {
	/**
	 * 通用常量
	 */
	public final static Charset UTF_8 = Charset.forName("UTF-8");
	public final static String USER_DEFAULT_PWD= "11111111"; 
	
	/**
	 * 业务常量
	 */
	public final static Integer DONATED_COINS_OF_REGISTER = 500;
	public final static Integer DONATED_BANN_TIMES_OF_REGISTER = 0;
	public final static Integer DONATED_TEXT_BANN_WORDS_LIMIT_OF_REGISTER = 20000;
	
	public final static String DEFAULT_PASSWD = "123456";
	
	/**
	 * Session key name
	 */
	public final static String SESS_KEY_CAPTCHA = "CAPTCHA"; //验证码key
	public final static String SESS_KEY_LOGIN_SMS_CODE = "LOGIN_SMS_CODE";
	
	public final static String SESS_KEY_UID = "UID";
	public final static String SESS_KEY_USERNAME = "USERNAME";
	public final static String SESS_KEY_REALNAME = "REALNAME";
	public final static String SESS_KEY_IDNUMBER = "IDNUMBER";
	public final static String SESS_KEY_PHONE = "PHONE";
	
	/**
	 * Cache相关的业务常量
	 */
	public final static String CACHE_KEY_LOGIN_SMS = "CACHE_KEY_LOGIN_SMS";
	public final static Long CACHE_KEY_LOGIN_SMS_EXPIRE_SECS = 60*5L;
}
