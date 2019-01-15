package com.liangyaofeng.entity;


import java.io.Serializable;

public class Address implements Serializable {

  private long id;
  private long uid;
  private String province;
  private String city;
  private String district;
  private String street;
  private String site;
  private String aname;
  private String postcode;
  private String aphone;


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


  public String getProvince() {
    return province;
  }

  public void setProvince(String province) {
    this.province = province;
  }


  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }


  public String getDistrict() {
    return district;
  }

  public void setDistrict(String district) {
    this.district = district;
  }


  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }


  public String getSite() {
    return site;
  }

  public void setSite(String site) {
    this.site = site;
  }


  public String getAname() {
    return aname;
  }

  public void setAname(String aname) {
    this.aname = aname;
  }


  public String getPostcode() {
    return postcode;
  }

  public void setPostcode(String postcode) {
    this.postcode = postcode;
  }


  public String getAphone() {
    return aphone;
  }

  public void setAphone(String aphone) {
    this.aphone = aphone;
  }


  @Override
  public String toString() {
    return "Address{" +
            "id=" + id +
            ", uid=" + uid +
            ", province='" + province + '\'' +
            ", city='" + city + '\'' +
            ", district='" + district + '\'' +
            ", street='" + street + '\'' +
            ", site='" + site + '\'' +
            ", aname='" + aname + '\'' +
            ", postcode='" + postcode + '\'' +
            ", aphone='" + aphone + '\'' +
            '}';
  }
}
