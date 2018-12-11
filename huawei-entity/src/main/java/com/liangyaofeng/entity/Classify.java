package com.liangyaofeng.entity;


import java.io.Serializable;

public class Classify implements Serializable {

  private String cid;
  private String sort;
  private String series;


  public String getCid() {
    return cid;
  }

  public void setCid(String cid) {
    this.cid = cid;
  }


  public String getSort() {
    return sort;
  }

  public void setSort(String sort) {
    this.sort = sort;
  }


  public String getSeries() {
    return series;
  }

  public void setSeries(String series) {
    this.series = series;
  }


  @Override
  public String toString() {
    return "Classify{" +
            "cid='" + cid + '\'' +
            ", sort='" + sort + '\'' +
            ", series='" + series + '\'' +
            '}';
  }
}
