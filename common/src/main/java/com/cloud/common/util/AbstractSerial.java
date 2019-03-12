package com.cloud.common.util;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.io.Serializable;

/**
 * 
 *@类AbstractSerial.java 的实现描述：
 *@author 陈金虎 2017年1月16日 下午11:13:08
 *@注意：本内容仅限于杭州阿拉丁信息科技股份有限公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class AbstractSerial implements Serializable {

	private static final long serialVersionUID = -8364508949630534954L;

	@Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

}
