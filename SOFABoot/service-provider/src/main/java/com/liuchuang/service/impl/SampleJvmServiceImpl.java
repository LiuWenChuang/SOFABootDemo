package com.liuchuang.service.impl;

import com.liuchuang.service.SampleJvmService;

/**
 *   实现  service-facade 中的服务
 */
public class SampleJvmServiceImpl implements SampleJvmService {
    private String message;

    @Override
    public String message() {
        System.out.println(message);
        return message;
    }

    public SampleJvmServiceImpl(String message) {
        this.message = message;
    }
}
