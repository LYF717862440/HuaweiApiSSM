package com.liangyaofeng.entity;


import java.io.Serializable;
import java.util.Date;

public class Users implements Serializable {

  private long uid;
  private String loginId;
  private String password;
  private String uname;
  private String sex;
  private String uphone;
  private double balance;
  private Date ubirthday;
  private String ustate;


  public long getUid() {
    return uid;
  }

  public void setUid(long uid) {
    this.uid = uid;
  }


  public String getLoginId() {
    return loginId;
  }

  public void setLoginId(String loginId) {
    this.loginId = loginId;
  }


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  public String getUname() {
    return uname;
  }

  public void setUname(String uname) {
    this.uname = uname;
  }


  public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }


  public String getUphone() {
    return uphone;
  }

  public void setUphone(String uphone) {
    this.uphone = uphone;
  }


  public double getBalance() {
    return balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }


  public Date getUbirthday() {
    return ubirthday;
  }

  public void setUbirthday(Date ubirthday) {
    this.ubirthday = ubirthday;
  }


  public String getUstate() {
    return ustate;
  }

  public void setUstate(String ustate) {
    this.ustate = ustate;
  }


  @Override
  public String toString() {
    return "Users{" +
            "uid=" + uid +
            ", loginId='" + loginId + '\'' +
            ", password='" + password + '\'' +
            ", uname='" + uname + '\'' +
            ", sex='" + sex + '\'' +
            ", uphone='" + uphone + '\'' +
            ", balance=" + balance +
            ", ubirthday=" + ubirthday +
            ", ustate='" + ustate + '\'' +
            '}';
  }


}
