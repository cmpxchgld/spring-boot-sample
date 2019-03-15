package com.sample.bean;


import lombok.Data;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

@Data
public class UserInfo {
    private static final long serialVersionUID = 8844317015635790358L;
    private String userId;
    private String name;
    private String password;
    private String job;
    private String title;
    private String email;
    private String mobile;
    private HashMap<String, Boolean> privMapping;
    private String officeTel;
    private String microTel;
    private Integer sortNum;
    private Integer sortSubNum;
    private String arrivalDate;
    private String resignDate;
    private String currOrgName;
    private String currOrgCode;
    private String officeAddr;
    private String workDate;
    private List<String> childDept;
    private List<String> privileges;
    private String currentSite;
    private String currSiteName;
    private Integer loginFailedCount;
    private Date lastAttemptLoginTime;
    private String autType;
    private String specFlag;
    private String unitCode;
    private String unitName;
    private String unitNum;
    private String attribute6;
    private String attribute7;
    private String attribute8;

}
