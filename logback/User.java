package com.huawei.cn.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor // 自动生成无参构造函数
@AllArgsConstructor // 指定生成全参构造函数
public class User {
    @Id
    @GeneratedValue
    @Getter
    @Setter
    private int uid;
    @Getter // 自动生成getter方法
    @Setter // 自动生成setter方法
    private String username;
    @Getter
    @Setter
    private String password;
    @Getter
    @Setter
    private String address;
    @Getter
    @Setter
    private String telephone;
    @Getter
    @Setter
    private String school;

    public User(String username, String address) {
        // TODO Auto-generated constructor stub
        this.username = username;
        this.address = address;
    }

}
