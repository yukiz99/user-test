package com.zhu.user.entity;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

@Data
public class User {

  private int id;
  private String username;
  private String password;
  private String sex;
  @JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd")
  private Date bir;
  private String tel;
  private String addr;
  @JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
  private Date createTime;


}
