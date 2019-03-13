package com.cloud.client.entity;

import com.cloud.common.util.AbstractSerial;

import java.util.Date;

/**
 * 实体
 * 
 * @author CodeGenerate
 * @version 1.0.0 初始化
 * @date 2018-09-17 15:22:24
 * Copyright 本内容仅限于杭州阿拉丁信息科技股份有限公司内部传阅，禁止外泄以及用于其他的商业目的
 */
 public class MgrOperatorDo extends AbstractSerial {

    private static final long serialVersionUID = 1L;

    public MgrOperatorDo(){

    }
    /**
     * 主键Rid
     */
    private Long rid;
    

    /**
     * 创建时间
     */
    private Date gmtCreate;

    /**
     * 最后修改时间
     */
    private Date gmtModified;

    /**
     * 创建人
     */
    private String creator;

    /**
     * 最后修改人
     */
    private String modifier;

    /**
     * 状态 1:正常 2:冻结 3:离职
     */
    private Integer status;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 密码
     */
    private String password;

    /**
     * 姓名
     */
    private String realName;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 随机salt值
     */
    private String salt;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 最后登录ip
     */
    private String loginIp;

    /**
     * 部门
     */
    private String department;


    private Integer isDelete;


    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

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

    /**
     * 获取创建人
     *
     * @return 创建人
     */
    public String getCreator(){
      return creator;
    }

    /**
     * 设置创建人
     * 
     * @param creator 要设置的创建人
     */
    public void setCreator(String creator){
      this.creator = creator;
    }

    /**
     * 获取最后修改人
     *
     * @return 最后修改人
     */
    public String getModifier(){
      return modifier;
    }

    /**
     * 设置最后修改人
     * 
     * @param modifier 要设置的最后修改人
     */
    public void setModifier(String modifier){
      this.modifier = modifier;
    }

    /**
     * 获取状态 1:正常 2:冻结 3:离职
     *
     * @return 状态 1:正常 2:冻结 3:离职
     */
    public Integer getStatus(){
      return status;
    }

    /**
     * 设置状态 1:正常 2:冻结 3:离职
     * 
     * @param status 要设置的状态 1:正常 2:冻结 3:离职
     */
    public void setStatus(Integer status){
      this.status = status;
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
     * 获取密码
     *
     * @return 密码
     */
    public String getPassword(){
      return password;
    }

    /**
     * 设置密码
     * 
     * @param password 要设置的密码
     */
    public void setPassword(String password){
      this.password = password;
    }

    /**
     * 获取邮箱
     *
     * @return 邮箱
     */
    public String getEmail(){
      return email;
    }

    /**
     * 设置邮箱
     * 
     * @param email 要设置的邮箱
     */
    public void setEmail(String email){
      this.email = email;
    }

    /**
     * 获取随机salt值
     *
     * @return 随机salt值
     */
    public String getSalt(){
      return salt;
    }

    /**
     * 设置随机salt值
     * 
     * @param salt 要设置的随机salt值
     */
    public void setSalt(String salt){
      this.salt = salt;
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
     * 获取最后登录ip
     *
     * @return 最后登录ip
     */
    public String getLoginIp(){
      return loginIp;
    }

    /**
     * 设置最后登录ip
     * 
     * @param loginIp 要设置的最后登录ip
     */
    public void setLoginIp(String loginIp){
      this.loginIp = loginIp;
    }

    /**
     * 获取部门
     *
     * @return 部门
     */
    public String getDepartment(){
      return department;
    }

    /**
     * 设置部门
     * 
     * @param department 要设置的部门
     */
    public void setDepartment(String department){
      this.department = department;
    }

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

}