package com.liangyaofeng.entity;


import java.io.Serializable;

public class Buyorders implements Serializable {

  private long id;
  private long uid;
  private String uname;
  private String uphone;
  private String postcode;
  private String uaddress;
  private long buyordersid;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getUid() {
    return uid;
  }

  public void setUid(long uid) {
    this.uid = uid;
  }


  public String getUname() {
    return uname;
  }

  public void setUname(String uname) {
    this.uname = uname;
  }


  public String getUphone() {
    return uphone;
  }

  public void setUphone(String uphone) {
    this.uphone = uphone;
  }


  public String getPostcode() {
    return postcode;
  }

  public void setPostcode(String postcode) {
    this.postcode = postcode;
  }


  public String getUaddress() {
    return uaddress;
  }

  public void setUaddress(String uaddress) {
    this.uaddress = uaddress;
  }


  public long getBuyordersid() {
    return buyordersid;
  }

  public void setBuyordersid(long buyordersid) {
    this.buyordersid = buyordersid;
  }


  @Override
  public String toString() {
    return "Buyorders{" +
            "id=" + id +
            ", uid=" + uid +
            ", uname='" + uname + '\'' +
            ", uphone='" + uphone + '\'' +
            ", postcode='" + postcode + '\'' +
            ", uaddress='" + uaddress + '\'' +
            ", buyordersid=" + buyordersid +
            '}';
  }
}
