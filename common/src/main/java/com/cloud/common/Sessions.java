package com.cloud.common;


import com.cloud.common.config.LocalConstants;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Sessions全局封装类，Service中代码不可直接引用此对象
 */
public class Sessions {

	public static boolean isLogin(HttpServletRequest request) {
		HttpSession session = request.getSession();
		return (Long)session.getAttribute(LocalConstants.SESS_KEY_UID) != null;
	}
	
	public static Long getUid(HttpServletRequest request) {
		HttpSession session = request.getSession();
		return (Long)session.getAttribute(LocalConstants.SESS_KEY_UID);
	}
	
	public static String getUsername(HttpServletRequest request) {
		HttpSession session = request.getSession();
		return (String)session.getAttribute(LocalConstants.SESS_KEY_USERNAME);
	}
	
	public static String getRealname(HttpServletRequest request) {
		HttpSession session = request.getSession();
		return (String)session.getAttribute(LocalConstants.SESS_KEY_REALNAME);
	}
	
	public static String getPhone(HttpServletRequest request) {
		HttpSession session = request.getSession();
		return (String)session.getAttribute(LocalConstants.SESS_KEY_PHONE);
	}
	
	/**
	 * 需要全量信息时建议调用此方法
	 * @return MgrOperatorDo,可用信息字段:uid, username, phone
	 */
	public static MgrOperatorDo getUserMo(HttpServletRequest request) {
		HttpSession session = request.getSession();
		
		MgrOperatorDo mo = new MgrOperatorDo();
		mo.setRid((Long)session.getAttribute(LocalConstants.SESS_KEY_UID));
		mo.setUserName((String)session.getAttribute(LocalConstants.SESS_KEY_USERNAME));
		mo.setRealName((String)session.getAttribute(LocalConstants.SESS_KEY_REALNAME));
		mo.setMobile((String)session.getAttribute(LocalConstants.SESS_KEY_PHONE));
		
		return mo;
	}
	
	/**
	 * @param userMo 注入字段：uid, username, phone
	 */
	public static void setUserMo(HttpServletRequest request, MgrOperatorDo userMo) {
		HttpSession session = request.getSession();
		
		session.setAttribute(LocalConstants.SESS_KEY_UID, userMo.getRid());
		session.setAttribute(LocalConstants.SESS_KEY_USERNAME, userMo.getUserName());
		session.setAttribute(LocalConstants.SESS_KEY_REALNAME, userMo.getRealName());
		session.setAttribute(LocalConstants.SESS_KEY_PHONE, userMo.getMobile());
		session.setMaxInactiveInterval(120*60);
	}
	/**
	 * @param objs,长度遵循2的倍数，每一对分别对应key&value
	 */
	public static void set(HttpServletRequest request, Object... objs) {
		HttpSession session = request.getSession();
		
		int len = objs.length;
		for(int i = 0; i<len ; i += 2) {
			session.setAttribute(objs[i].toString(), objs[i+1]);
		}
	}
	
	public static void empty(HttpServletRequest request) {
		HttpSession session = request.getSession();
		session.removeAttribute(LocalConstants.SESS_KEY_UID);
		session.removeAttribute(LocalConstants.SESS_KEY_USERNAME);
		session.removeAttribute(LocalConstants.SESS_KEY_REALNAME);
		session.removeAttribute(LocalConstants.SESS_KEY_PHONE);
	}
	
	/**
	 * @param keys
	 */
	public static void remove(HttpServletRequest request, String key) {
		HttpSession session = request.getSession();
		session.removeAttribute(key.toString());
	}
	
	@SuppressWarnings("unchecked")
	public static <T> T get(HttpServletRequest request, String key) {
		HttpSession session = request.getSession();
		return (T)session.getAttribute(key);
	}
	
	public static String getIp(HttpServletRequest request) {
		String ip = request.getHeader("X-Forwarded-For");
		if (StringUtils.hasText(ip) && !"unKnown".equalsIgnoreCase(ip)) { // 多次反向代理后会有多个ip值，第一个ip才是真实ip
			int index = ip.indexOf(",");
			if (index != -1) {
				return ip.substring(0, index);
			} else {
				return ip;
			}
		}
		ip = request.getHeader("X-Real-IP");
		if (StringUtils.hasText(ip) && !"unKnown".equalsIgnoreCase(ip)) {
			return ip;
		}
		return request.getRemoteAddr();
	}
	
}
