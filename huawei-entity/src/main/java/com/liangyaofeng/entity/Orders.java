package com.liangyaofeng.entity;


import java.io.Serializable;

public class Orders implements Serializable {

  private long oid;
  private long uid;
  private long gid;
  private String gimg;
  private String cname;
  private double oprice;
  private long oAmount;
  private java.sql.Timestamp odate;
  private String ostate;
  private long buyordersid;


  public long getOid() {
    return oid;
  }

  public void setOid(long oid) {
    this.oid = oid;
  }


  public long getUid() {
    return uid;
  }

  public void setUid(long uid) {
    this.uid = uid;
  }


  public long getGid() {
    return gid;
  }

  public void setGid(long gid) {
    this.gid = gid;
  }


  public String getGimg() {
    return gimg;
  }

  public void setGimg(String gimg) {
    this.gimg = gimg;
  }


  public String getCname() {
    return cname;
  }

  public void setCname(String cname) {
    this.cname = cname;
  }


  public double getOprice() {
    return oprice;
  }

  public void setOprice(double oprice) {
    this.oprice = oprice;
  }


  public long getOAmount() {
    return oAmount;
  }

  public void setOAmount(long oAmount) {
    this.oAmount = oAmount;
  }


  public java.sql.Timestamp getOdate() {
    return odate;
  }

  public void setOdate(java.sql.Timestamp odate) {
    this.odate = odate;
  }


  public String getOstate() {
    return ostate;
  }

  public void setOstate(String ostate) {
    this.ostate = ostate;
  }


  public long getoAmount() {
    return oAmount;
  }

  public void setoAmount(long oAmount) {
    this.oAmount = oAmount;
  }

  public long getBuyordersid() {
    return buyordersid;
  }

  public void setBuyordersid(long buyordersid) {
    this.buyordersid = buyordersid;
  }

  @Override
  public String toString() {
    return "Orders{" +
            "oid=" + oid +
            ", uid=" + uid +
            ", gid=" + gid +
            ", gimg='" + gimg + '\'' +
            ", cname='" + cname + '\'' +
            ", oprice=" + oprice +
            ", oAmount=" + oAmount +
            ", odate=" + odate +
            ", ostate='" + ostate + '\'' +
            ", buyordersid=" + buyordersid +
            '}';
  }
}
