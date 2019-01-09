package com.liangyaofeng.entity;


import java.io.Serializable;

public class Gpicture implements Serializable {

  private long pid;
  private long gid;
  private String smallgraph;
  private String standard;
  private String bigpicture;


  public long getPid() {
    return pid;
  }

  public void setPid(long pid) {
    this.pid = pid;
  }


  public long getGid() {
    return gid;
  }

  public void setGid(long gid) {
    this.gid = gid;
  }


  public String getSmallgraph() {
    return smallgraph;
  }

  public void setSmallgraph(String smallgraph) {
    this.smallgraph = smallgraph;
  }


  public String getStandard() {
    return standard;
  }

  public void setStandard(String standard) {
    this.standard = standard;
  }


  public String getBigpicture() {
    return bigpicture;
  }

  public void setBigpicture(String bigpicture) {
    this.bigpicture = bigpicture;
  }


  @Override
  public String toString() {
    return "Gpicture{" +
            "pid=" + pid +
            ", gid=" + gid +
            ", smallgraph='" + smallgraph + '\'' +
            ", standard='" + standard + '\'' +
            ", bigpicture='" + bigpicture + '\'' +
            '}';
  }
}
