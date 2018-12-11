package com.liangyaofeng.entity;


import java.io.Serializable;

public class Goods implements Serializable {

  private String gid;
  private String cid;
  private String gname;
  private String gimg;
  private String gtype;
  private double gprice;
  private String gexplain;
  private String gcoding;
  private String colour;
  private String versions;
  private String details;
  private long stock;
  private String gstate;
  private java.sql.Timestamp loadingtime;
  private long aid;


  public String getGid() {
    return gid;
  }

  public void setGid(String gid) {
    this.gid = gid;
  }


  public String getCid() {
    return cid;
  }

  public void setCid(String cid) {
    this.cid = cid;
  }


  public String getGname() {
    return gname;
  }

  public void setGname(String gname) {
    this.gname = gname;
  }


  public String getGimg() {
    return gimg;
  }

  public void setGimg(String gimg) {
    this.gimg = gimg;
  }


  public String getGtype() {
    return gtype;
  }

  public void setGtype(String gtype) {
    this.gtype = gtype;
  }


  public double getGprice() {
    return gprice;
  }

  public void setGprice(double gprice) {
    this.gprice = gprice;
  }


  public String getGexplain() {
    return gexplain;
  }

  public void setGexplain(String gexplain) {
    this.gexplain = gexplain;
  }


  public String getGcoding() {
    return gcoding;
  }

  public void setGcoding(String gcoding) {
    this.gcoding = gcoding;
  }


  public String getColour() {
    return colour;
  }

  public void setColour(String colour) {
    this.colour = colour;
  }


  public String getVersions() {
    return versions;
  }

  public void setVersions(String versions) {
    this.versions = versions;
  }


  public String getDetails() {
    return details;
  }

  public void setDetails(String details) {
    this.details = details;
  }


  public long getStock() {
    return stock;
  }

  public void setStock(long stock) {
    this.stock = stock;
  }


  public String getGstate() {
    return gstate;
  }

  public void setGstate(String gstate) {
    this.gstate = gstate;
  }


  public java.sql.Timestamp getLoadingtime() {
    return loadingtime;
  }

  public void setLoadingtime(java.sql.Timestamp loadingtime) {
    this.loadingtime = loadingtime;
  }


  public long getAid() {
    return aid;
  }

  public void setAid(long aid) {
    this.aid = aid;
  }


  @Override
  public String toString() {
    return "Goods{" +
            "gid='" + gid + '\'' +
            ", cid='" + cid + '\'' +
            ", gname='" + gname + '\'' +
            ", gimg='" + gimg + '\'' +
            ", gtype='" + gtype + '\'' +
            ", gprice=" + gprice +
            ", gexplain='" + gexplain + '\'' +
            ", gcoding='" + gcoding + '\'' +
            ", colour='" + colour + '\'' +
            ", versions='" + versions + '\'' +
            ", details='" + details + '\'' +
            ", stock=" + stock +
            ", gstate='" + gstate + '\'' +
            ", loadingtime=" + loadingtime +
            ", aid=" + aid +
            '}';
  }
}
