package com.liangyaofeng.entity;


import java.io.Serializable;

public class Shops implements Serializable {

  private long id;
  private long uid;
  private long gid;
  private String gimg;
  private String sname;
  private double sprice;
  private long amount;
  private double totals;
  private String sstate;
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


  public String getSname() {
    return sname;
  }

  public void setSname(String sname) {
    this.sname = sname;
  }


  public double getSprice() {
    return sprice;
  }

  public void setSprice(double sprice) {
    this.sprice = sprice;
  }


  public long getAmount() {
    return amount;
  }

  public void setAmount(long amount) {
    this.amount = amount;
  }


  public double getTotals() {
    return totals;
  }

  public void setTotals(double totals) {
    this.totals = totals;
  }

  public String getSstate() {
    return sstate;
  }

  public void setSstate(String sstate) {
    this.sstate = sstate;
  }


  public long getBuyordersid() {
    return buyordersid;
  }

  public void setBuyordersid(long buyordersid) {
    this.buyordersid = buyordersid;
  }


  @Override
  public String toString() {
    return "Shops{" +
            "id=" + id +
            ", uid=" + uid +
            ", gid=" + gid +
            ", gimg='" + gimg + '\'' +
            ", sname='" + sname + '\'' +
            ", sprice=" + sprice +
            ", amount=" + amount +
            ", totals=" + totals +
            ", sstate='" + sstate + '\'' +
            ", buyordersid=" + buyordersid +
            '}';
  }
}
