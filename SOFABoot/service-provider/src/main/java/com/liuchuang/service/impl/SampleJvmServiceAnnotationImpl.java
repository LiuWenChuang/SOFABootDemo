package com.liuchuang.service.impl;

import com.alipay.sofa.runtime.api.annotation.SofaService;
import com.liuchuang.service.SampleJvmService;

@SofaService(uniqueId="annotationImpl")
public class SampleJvmServiceAnnotationImpl implements SampleJvmService {
    @Override
    public String message() {
        String message = "Hello, jvm service annotation implementation.";
        System.out.println(message);
        return message;
    }
}
