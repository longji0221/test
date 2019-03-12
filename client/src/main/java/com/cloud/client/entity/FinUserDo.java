package com.cloud.client.entity;


import com.cloud.common.util.AbstractSerial;

import java.util.Date;

/**
 * 实体
 * 
 * @author CodeGenerate
 * @version 1.0.0 初始化
 * @date 2018-10-29 17:11:13
 * Copyright 本内容仅限于杭州阿拉丁信息科技股份有限公司内部传阅，禁止外泄以及用于其他的商业目的
 */
 public class FinUserDo extends AbstractSerial {

    private static final long serialVersionUID = 1L;

    /**
     * 主键Rid
     */
    private Long rid;
    
    /**
     * 用户名
     */
    private String userName;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 性别
     */
    private String gender;

    /**
     * 出生年月
     */
    private String birthday;

    /**
     * 身份证
     */
    private String idNumber;

    /**
     * 创建时间
     */
    private Date gmtCreate;

    /**
     * 最后修改时间
     */
    private Date gmtModified;



    /**
     * 获取主键Id
     *
     * @return rid
     */
    public Long getRid(){
      return rid;
    }

    /**
     * 设置主键Id
     * 
     * @param 要设置的主键Id
     */
    public void setRid(Long rid){
      this.rid = rid;
    }
    
    /**
     * 获取用户名
     *
     * @return 用户名
     */
    public String getUserName(){
      return userName;
    }

    /**
     * 设置用户名
     * 
     * @param userName 要设置的用户名
     */
    public void setUserName(String userName){
      this.userName = userName;
    }

    /**
     * 获取手机号
     *
     * @return 手机号
     */
    public String getMobile(){
      return mobile;
    }

    /**
     * 设置手机号
     * 
     * @param mobile 要设置的手机号
     */
    public void setMobile(String mobile){
      this.mobile = mobile;
    }

    /**
     * 获取性别
     *
     * @return 性别
     */
    public String getGender(){
      return gender;
    }

    /**
     * 设置性别
     * 
     * @param gender 要设置的性别
     */
    public void setGender(String gender){
      this.gender = gender;
    }

    /**
     * 获取出生年月
     *
     * @return 出生年月
     */
    public String getBirthday(){
      return birthday;
    }

    /**
     * 设置出生年月
     * 
     * @param birthday 要设置的出生年月
     */
    public void setBirthday(String birthday){
      this.birthday = birthday;
    }

    /**
     * 获取身份证
     *
     * @return 身份证
     */
    public String getIdNumber(){
      return idNumber;
    }

    /**
     * 设置身份证
     * 
     * @param idNumber 要设置的身份证
     */
    public void setIdNumber(String idNumber){
      this.idNumber = idNumber;
    }

    /**
     * 获取创建时间
     *
     * @return 创建时间
     */
    public Date getGmtCreate(){
      return gmtCreate;
    }

    /**
     * 设置创建时间
     * 
     * @param gmtCreate 要设置的创建时间
     */
    public void setGmtCreate(Date gmtCreate){
      this.gmtCreate = gmtCreate;
    }

    /**
     * 获取最后修改时间
     *
     * @return 最后修改时间
     */
    public Date getGmtModified(){
      return gmtModified;
    }

    /**
     * 设置最后修改时间
     * 
     * @param gmtModified 要设置的最后修改时间
     */
    public void setGmtModified(Date gmtModified){
      this.gmtModified = gmtModified;
    }


}