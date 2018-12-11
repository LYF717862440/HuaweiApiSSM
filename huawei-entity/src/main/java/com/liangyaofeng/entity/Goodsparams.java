package com.liangyaofeng.entity;


import java.io.Serializable;

public class Goodsparams implements Serializable {

  private String gcoding;
  private String brand;
  private java.sql.Timestamp ttm;
  private String cpUtype;
  private String cpuAudit;
  private String audroid;
  private String screenSize;
  private String screenColor;
  private String dpi;
  private String ram;
  private String gb;
  private String hdFront;
  private String rearCamera;
  private String nah;
  private String psystem;


  public String getGcoding() {
    return gcoding;
  }

  public void setGcoding(String gcoding) {
    this.gcoding = gcoding;
  }


  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }


  public java.sql.Timestamp getTtm() {
    return ttm;
  }

  public void setTtm(java.sql.Timestamp ttm) {
    this.ttm = ttm;
  }


  public String getCpUtype() {
    return cpUtype;
  }

  public void setCpUtype(String cpUtype) {
    this.cpUtype = cpUtype;
  }


  public String getCpuAudit() {
    return cpuAudit;
  }

  public void setCpuAudit(String cpuAudit) {
    this.cpuAudit = cpuAudit;
  }


  public String getAudroid() {
    return audroid;
  }

  public void setAudroid(String audroid) {
    this.audroid = audroid;
  }


  public String getScreenSize() {
    return screenSize;
  }

  public void setScreenSize(String screenSize) {
    this.screenSize = screenSize;
  }


  public String getScreenColor() {
    return screenColor;
  }

  public void setScreenColor(String screenColor) {
    this.screenColor = screenColor;
  }


  public String getDpi() {
    return dpi;
  }

  public void setDpi(String dpi) {
    this.dpi = dpi;
  }


  public String getRam() {
    return ram;
  }

  public void setRam(String ram) {
    this.ram = ram;
  }


  public String getGb() {
    return gb;
  }

  public void setGb(String gb) {
    this.gb = gb;
  }


  public String getHdFront() {
    return hdFront;
  }

  public void setHdFront(String hdFront) {
    this.hdFront = hdFront;
  }


  public String getRearCamera() {
    return rearCamera;
  }

  public void setRearCamera(String rearCamera) {
    this.rearCamera = rearCamera;
  }


  public String getNah() {
    return nah;
  }

  public void setNah(String nah) {
    this.nah = nah;
  }


  public String getPsystem() {
    return psystem;
  }

  public void setPsystem(String psystem) {
    this.psystem = psystem;
  }


  @Override
  public String toString() {
    return "Goodsparams{" +
            "gcoding='" + gcoding + '\'' +
            ", brand='" + brand + '\'' +
            ", ttm=" + ttm +
            ", cpUtype='" + cpUtype + '\'' +
            ", cpuAudit='" + cpuAudit + '\'' +
            ", audroid='" + audroid + '\'' +
            ", screenSize='" + screenSize + '\'' +
            ", screenColor='" + screenColor + '\'' +
            ", dpi='" + dpi + '\'' +
            ", ram='" + ram + '\'' +
            ", gb='" + gb + '\'' +
            ", hdFront='" + hdFront + '\'' +
            ", rearCamera='" + rearCamera + '\'' +
            ", nah='" + nah + '\'' +
            ", psystem='" + psystem + '\'' +
            '}';
  }
}
