package com.liangyaofeng.entity;


import java.io.Serializable;

public class Picture implements Serializable {

  private long pid;
  private String gid;
  private String pname;
  private String imgname;


  public long getPid() {
    return pid;
  }

  public void setPid(long pid) {
    this.pid = pid;
  }


  public String getGid() {
    return gid;
  }

  public void setGid(String gid) {
    this.gid = gid;
  }


  public String getPname() {
    return pname;
  }

  public void setPname(String pname) {
    this.pname = pname;
  }

  public String getImgname() {
    return imgname;
  }

  public void setImgname(String imgname) {
    this.imgname = imgname;
  }


  @Override
  public String toString() {
    return "Picture{" +
            "pid=" + pid +
            ", gid='" + gid + '\'' +
            ", pname='" + pname + '\'' +
            ", imgname='" + imgname + '\'' +
            '}';
  }

}
