package com.jcloud.service;

import org.apache.dubbo.config.annotation.DubboService;

import com.jcloud.dubbo.IDubboService;

/**
 * @author JiangHuiTao
 * @date 2021/1/29
 */
@DubboService
public class NacosTestService implements IDubboService {

    @Override
    public String sayHello() {
        return "hello nacos";
    }
}
