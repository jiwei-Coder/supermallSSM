package com.pojo;

public class User {
  private Integer userId;
  private String account;
  private String nickName;
  private String password;
  private double balance;
  private String tel;

  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public String getAccount() {
    return account;
  }

  public void setAccount(String account) {
    this.account = account;
  }

  public String getNickName() {
    return nickName;
  }

  public void setNickName(String nickName) {
    this.nickName = nickName;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public double getBalance() {
    return balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public String getTel() {
    return tel;
  }

  public void setTel(String tel) {
    this.tel = tel;
  }

  @Override
  public String toString() {
    return "User{" +
            "userId=" + userId +
            ", account='" + account + '\'' +
            ", nickName='" + nickName + '\'' +
            ", password='" + password + '\'' +
            ", balance=" + balance +
            ", tel='" + tel + '\'' +
            '}';
  }
}
