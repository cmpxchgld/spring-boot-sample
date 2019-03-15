package com.sample.controller;

import com.sample.bean.Role;
import com.sample.bean.UserInfo;
import com.sample.service.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @Autowired
    SampleService sampleService;

    @GetMapping("/user/{id}")
    public UserInfo findByUserId(@PathVariable("id") String id) {

        return sampleService.findByUserId(id);
    }

    @GetMapping("/role/{id}")
    public Role findByRoleId(@PathVariable("id") String id) {
        return sampleService.findByRoleId(id);
    }
}
