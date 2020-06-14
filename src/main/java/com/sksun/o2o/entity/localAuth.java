package com.sksun.o2o.entity;

import lombok.Data;

import java.util.Date;

@Data
public class localAuth {
    private Long localAuthId;
    private String username;
    private String password;
    private Date createTime;
    private Date lastEditTime;
    private PersonInfo personInfo;
}
