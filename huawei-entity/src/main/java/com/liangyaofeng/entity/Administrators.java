package com.liangyaofeng.entity;


import java.io.Serializable;
import java.util.Date;

public class Administrators implements Serializable {

  private long aid;
  private String loginId;
  private String password;
  private String aname;
  private String asex;
  private String jop;
  private String aphone;
  private Date abirthday;
  private String astate;


  public long getAid() {
    return aid;
  }

  public void setAid(long aid) {
    this.aid = aid;
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


  public String getAname() {
    return aname;
  }

  public void setAname(String aname) {
    this.aname = aname;
  }


  public String getAsex() {
    return asex;
  }

  public void setAsex(String asex) {
    this.asex = asex;
  }


  public String getJop() {
    return jop;
  }

  public void setJop(String jop) {
    this.jop = jop;
  }


  public String getAphone() {
    return aphone;
  }

  public void setAphone(String aphone) {
    this.aphone = aphone;
  }


  public Date getAbirthday() {
    return abirthday;
  }

  public void setAbirthday(Date abirthday) {
    this.abirthday = abirthday;
  }


  public String getAstate() {
    return astate;
  }

  public void setAstate(String astate) {
    this.astate = astate;
  }


  @Override
  public String toString() {
    return "Administrators{" +
            "aid=" + aid +
            ", loginId='" + loginId + '\'' +
            ", password='" + password + '\'' +
            ", aname='" + aname + '\'' +
            ", asex='" + asex + '\'' +
            ", jop='" + jop + '\'' +
            ", aphone='" + aphone + '\'' +
            ", abirthday=" + abirthday +
            ", astate='" + astate + '\'' +
            '}';
  }
}
