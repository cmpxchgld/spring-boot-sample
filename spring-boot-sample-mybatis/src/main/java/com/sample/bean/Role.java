package com.sample.bean;

import lombok.Data;

@Data
public class Role {

    //mapped fields
    private String roleId;
    private String name;
    private String siteId;
    private String siteName;
    private Integer sortNum;
    private String siteActive;
    private String inheritedFrom;
    private String reserved;
}
