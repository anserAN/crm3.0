package com.aaa.entity;

import java.util.Date;

/**
 * @ClassName CustomerController
 * @Description 客户实体类
 * @Author LP
 * @Date 2018/12/15 14:02
 * @Version 1.0
 **/
public class Customer {
    private Integer isPublic;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.customerId
     *
     * @mbg.generated Sat Dec 15 14:44:31 CST 2018
     */
    private Integer customerid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.customerName
     *
     * @mbg.generated Sat Dec 15 14:44:31 CST 2018
     */
    private String customername;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.firstTel
     *
     * @mbg.generated Sat Dec 15 14:44:31 CST 2018
     */
    private String firsttel;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.secondTel
     *
     * @mbg.generated Sat Dec 15 14:44:31 CST 2018
     */
    private String secondtel;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.sex
     *
     * @mbg.generated Sat Dec 15 14:44:31 CST 2018
     */
    private String sex;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.idType
     *
     * @mbg.generated Sat Dec 15 14:44:31 CST 2018
     */
    private String idtype;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.idCard
     *
     * @mbg.generated Sat Dec 15 14:44:31 CST 2018
     */
    private String idcard;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.areaCode
     *
     * @mbg.generated Sat Dec 15 14:44:31 CST 2018
     */
    private String areacode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.address
     *
     * @mbg.generated Sat Dec 15 14:44:31 CST 2018
     */
    private String address;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.marriage
     *
     * @mbg.generated Sat Dec 15 14:44:31 CST 2018
     */
    private String marriage;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.job
     *
     * @mbg.generated Sat Dec 15 14:44:31 CST 2018
     */
    private String job;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.contact
     *
     * @mbg.generated Sat Dec 15 14:44:31 CST 2018
     */
    private String contact;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.contactTel
     *
     * @mbg.generated Sat Dec 15 14:44:31 CST 2018
     */
    private String contacttel;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.productId
     *
     * @mbg.generated Sat Dec 15 14:44:31 CST 2018
     */
    private Integer productid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.createTime
     *
     * @mbg.generated Sat Dec 15 14:44:31 CST 2018
     */
    private Date createtime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.customerSource
     *
     * @mbg.generated Sat Dec 15 14:44:31 CST 2018
     */
    private String customersource;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.customerLevel
     *
     * @mbg.generated Sat Dec 15 14:44:31 CST 2018
     */
    private String customerlevel;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.fid
     *
     * @mbg.generated Sat Dec 15 14:44:31 CST 2018
     */
    private Integer fid;

    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.maintainRecordId
     *
     * @mbg.generated Sat Dec 15 14:44:31 CST 2018
     */
    private Integer maintainrecordid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.isDel
     *
     * @mbg.generated Sat Dec 15 14:44:31 CST 2018
     */
    private Integer isdel;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.comment
     *
     * @mbg.generated Sat Dec 15 14:44:31 CST 2018
     */
    private String comment;

    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.customerId
     *
     * @return the value of customer.customerId
     *
     * @mbg.generated Sat Dec 15 14:44:31 CST 2018
     */
    public Integer getCustomerid() {
        return customerid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.customerId
     *
     * @param customerid the value for customer.customerId
     *
     * @mbg.generated Sat Dec 15 14:44:31 CST 2018
     */
    public void setCustomerid(Integer customerid) {
        this.customerid = customerid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.customerName
     *
     * @return the value of customer.customerName
     *
     * @mbg.generated Sat Dec 15 14:44:31 CST 2018
     */
    public String getCustomername() {
        return customername;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.customerName
     *
     * @param customername the value for customer.customerName
     *
     * @mbg.generated Sat Dec 15 14:44:31 CST 2018
     */
    public void setCustomername(String customername) {
        this.customername = customername == null ? null : customername.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.firstTel
     *
     * @return the value of customer.firstTel
     *
     * @mbg.generated Sat Dec 15 14:44:31 CST 2018
     */
    public String getFirsttel() {
        return firsttel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.firstTel
     *
     * @param firsttel the value for customer.firstTel
     *
     * @mbg.generated Sat Dec 15 14:44:31 CST 2018
     */
    public void setFirsttel(String firsttel) {
        this.firsttel = firsttel == null ? null : firsttel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.secondTel
     *
     * @return the value of customer.secondTel
     *
     * @mbg.generated Sat Dec 15 14:44:31 CST 2018
     */
    public String getSecondtel() {
        return secondtel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.secondTel
     *
     * @param secondtel the value for customer.secondTel
     *
     * @mbg.generated Sat Dec 15 14:44:31 CST 2018
     */
    public void setSecondtel(String secondtel) {
        this.secondtel = secondtel == null ? null : secondtel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.sex
     *
     * @return the value of customer.sex
     *
     * @mbg.generated Sat Dec 15 14:44:31 CST 2018
     */
    public String getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.sex
     *
     * @param sex the value for customer.sex
     *
     * @mbg.generated Sat Dec 15 14:44:31 CST 2018
     */
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.idType
     *
     * @return the value of customer.idType
     *
     * @mbg.generated Sat Dec 15 14:44:31 CST 2018
     */
    public String getIdtype() {
        return idtype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.idType
     *
     * @param idtype the value for customer.idType
     *
     * @mbg.generated Sat Dec 15 14:44:31 CST 2018
     */
    public void setIdtype(String idtype) {
        this.idtype = idtype == null ? null : idtype.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.idCard
     *
     * @return the value of customer.idCard
     *
     * @mbg.generated Sat Dec 15 14:44:31 CST 2018
     */
    public String getIdcard() {
        return idcard;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.idCard
     *
     * @param idcard the value for customer.idCard
     *
     * @mbg.generated Sat Dec 15 14:44:31 CST 2018
     */
    public void setIdcard(String idcard) {
        this.idcard = idcard == null ? null : idcard.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.areaCode
     *
     * @return the value of customer.areaCode
     *
     * @mbg.generated Sat Dec 15 14:44:31 CST 2018
     */
    public String getAreacode() {
        return areacode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.areaCode
     *
     * @param areacode the value for customer.areaCode
     *
     * @mbg.generated Sat Dec 15 14:44:31 CST 2018
     */
    public void setAreacode(String areacode) {
        this.areacode = areacode == null ? null : areacode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.address
     *
     * @return the value of customer.address
     *
     * @mbg.generated Sat Dec 15 14:44:31 CST 2018
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.address
     *
     * @param address the value for customer.address
     *
     * @mbg.generated Sat Dec 15 14:44:31 CST 2018
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.marriage
     *
     * @return the value of customer.marriage
     *
     * @mbg.generated Sat Dec 15 14:44:31 CST 2018
     */
    public String getMarriage() {
        return marriage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.marriage
     *
     * @param marriage the value for customer.marriage
     *
     * @mbg.generated Sat Dec 15 14:44:31 CST 2018
     */
    public void setMarriage(String marriage) {
        this.marriage = marriage == null ? null : marriage.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.job
     *
     * @return the value of customer.job
     *
     * @mbg.generated Sat Dec 15 14:44:31 CST 2018
     */
    public String getJob() {
        return job;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.job
     *
     * @param job the value for customer.job
     *
     * @mbg.generated Sat Dec 15 14:44:31 CST 2018
     */
    public void setJob(String job) {
        this.job = job == null ? null : job.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.contact
     *
     * @return the value of customer.contact
     *
     * @mbg.generated Sat Dec 15 14:44:31 CST 2018
     */
    public String getContact() {
        return contact;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.contact
     *
     * @param contact the value for customer.contact
     *
     * @mbg.generated Sat Dec 15 14:44:31 CST 2018
     */
    public void setContact(String contact) {
        this.contact = contact == null ? null : contact.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.contactTel
     *
     * @return the value of customer.contactTel
     *
     * @mbg.generated Sat Dec 15 14:44:31 CST 2018
     */
    public String getContacttel() {
        return contacttel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.contactTel
     *
     * @param contacttel the value for customer.contactTel
     *
     * @mbg.generated Sat Dec 15 14:44:31 CST 2018
     */
    public void setContacttel(String contacttel) {
        this.contacttel = contacttel == null ? null : contacttel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.productId
     *
     * @return the value of customer.productId
     *
     * @mbg.generated Sat Dec 15 14:44:31 CST 2018
     */
    public Integer getProductid() {
        return productid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.productId
     *
     * @param productid the value for customer.productId
     *
     * @mbg.generated Sat Dec 15 14:44:31 CST 2018
     */
    public void setProductid(Integer productid) {
        this.productid = productid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.createTime
     *
     * @return the value of customer.createTime
     *
     * @mbg.generated Sat Dec 15 14:44:31 CST 2018
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.createTime
     *
     * @param createtime the value for customer.createTime
     *
     * @mbg.generated Sat Dec 15 14:44:31 CST 2018
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.customerSource
     *
     * @return the value of customer.customerSource
     *
     * @mbg.generated Sat Dec 15 14:44:31 CST 2018
     */
    public String getCustomersource() {
        return customersource;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.customerSource
     *
     * @param customersource the value for customer.customerSource
     *
     * @mbg.generated Sat Dec 15 14:44:31 CST 2018
     */
    public void setCustomersource(String customersource) {
        this.customersource = customersource == null ? null : customersource.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.customerLevel
     *
     * @return the value of customer.customerLevel
     *
     * @mbg.generated Sat Dec 15 14:44:31 CST 2018
     */
    public String getCustomerlevel() {
        return customerlevel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.customerLevel
     *
     * @param customerlevel the value for customer.customerLevel
     *
     * @mbg.generated Sat Dec 15 14:44:31 CST 2018
     */
    public void setCustomerlevel(String customerlevel) {
        this.customerlevel = customerlevel == null ? null : customerlevel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.fid
     *
     * @return the value of customer.fid
     *
     * @mbg.generated Sat Dec 15 14:44:31 CST 2018
     */
    public Integer getFid() {
        return fid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.fid
     *
     * @param fid the value for customer.fid
     *
     * @mbg.generated Sat Dec 15 14:44:31 CST 2018
     */
    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId( Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.maintainRecordId
     *
     * @return the value of customer.maintainRecordId
     *
     * @mbg.generated Sat Dec 15 14:44:31 CST 2018
     */
    public Integer getMaintainrecordid() {
        return maintainrecordid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.maintainRecordId
     *
     * @param maintainrecordid the value for customer.maintainRecordId
     *
     * @mbg.generated Sat Dec 15 14:44:31 CST 2018
     */
    public void setMaintainrecordid(Integer maintainrecordid) {
        this.maintainrecordid = maintainrecordid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.isDel
     *
     * @return the value of customer.isDel
     *
     * @mbg.generated Sat Dec 15 14:44:31 CST 2018
     */
    public Integer getIsdel() {
        return isdel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.isDel
     *
     * @param isdel the value for customer.isDel
     *
     * @mbg.generated Sat Dec 15 14:44:31 CST 2018
     */
    public void setIsdel(Integer isdel) {
        this.isdel = isdel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.comment
     *
     * @return the value of customer.comment
     *
     * @mbg.generated Sat Dec 15 14:44:31 CST 2018
     */
    public String getComment() {
        return comment;
    }

    public Integer getIsPublic() {
        return isPublic;
    }

    public void setIsPublic(Integer isPublic) {
        this.isPublic = isPublic;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "isPublic=" + isPublic +
                ", customerid=" + customerid +
                ", customername='" + customername + '\'' +
                ", firsttel='" + firsttel + '\'' +
                ", secondtel='" + secondtel + '\'' +
                ", sex='" + sex + '\'' +
                ", idtype='" + idtype + '\'' +
                ", idcard='" + idcard + '\'' +
                ", areacode='" + areacode + '\'' +
                ", address='" + address + '\'' +
                ", marriage='" + marriage + '\'' +
                ", job='" + job + '\'' +
                ", contact='" + contact + '\'' +
                ", contacttel='" + contacttel + '\'' +
                ", productid=" + productid +
                ", createtime=" + createtime +
                ", customersource='" + customersource + '\'' +
                ", customerlevel='" + customerlevel + '\'' +
                ", fid=" + fid +
                ", userId=" + userId +
                ", maintainrecordid=" + maintainrecordid +
                ", isdel=" + isdel +
                ", comment='" + comment + '\'' +
                '}';
    }
}