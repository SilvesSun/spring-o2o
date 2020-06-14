package com.sksun.o2o.entity;


import lombok.Data;

import java.util.Date;

@Data
public class PersonInfo {
    private Long userId;
    private String name;
    private String profileImg;
    private String email;
    private String gender;
    private Integer enableStatus;

    //1. 顾客， 2店家 3超级管理员
    private Integer userType;
    private Date createTime;
    private Date lastEditTime;
}
