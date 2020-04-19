package com.pojo;

public class User {
  private Integer user_id;
  private String nickName;
  private String password;
  private double account;
  private double balance;
  private String tel;

  public Integer getUser_id() {
    return user_id;
  }

  public void setUser_id(Integer user_id) {
    this.user_id = user_id;
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

  public double getAccount() {
    return account;
  }

  public void setAccount(double account) {
    this.account = account;
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
            "user_id=" + user_id +
            ", nickName='" + nickName + '\'' +
            ", password='" + password + '\'' +
            ", account=" + account +
            ", balance=" + balance +
            ", tel='" + tel + '\'' +
            '}';
  }
}
