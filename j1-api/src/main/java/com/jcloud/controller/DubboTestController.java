package com.jcloud.controller;

import java.util.List;

import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.nacos.api.annotation.NacosInjected;
import com.alibaba.nacos.api.exception.NacosException;
import com.alibaba.nacos.api.naming.NamingService;
import com.alibaba.nacos.api.naming.pojo.Instance;
import com.jcloud.dubbo.IDubboService;

/**
 * @author JiangHuiTao
 * @date 2021/1/29
 */
@RestController
public class DubboTestController {

    @NacosInjected
    private NamingService namingService;

    @GetMapping(value = "/get")
    public List<Instance> get(@RequestParam String serviceName) throws NacosException {
        return namingService.getAllInstances(serviceName);
    }

    @DubboReference
    private IDubboService dubboService;

    @GetMapping(value = "/sayHello")
    public String sayHello() {
        return dubboService.sayHello();
    }
}
