package com.liuchuang;


import com.alipay.sofa.runtime.api.annotation.SofaReference;
import com.liuchuang.service.SampleJvmService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class SofaBootWithModulesTest {

    @SofaReference
    private SampleJvmService sampleJvmService;

    @SofaReference(uniqueId = "annotationImpl")
    private SampleJvmService sampleJvmServiceAnnotationImpl;

    @SofaReference(uniqueId = "serviceClientImpl")
    private SampleJvmService sampleJvmServiceClientImpl;

    @Test
    public void test() {
        Assert.assertEquals("Hello, jvm service xml implementation.", sampleJvmService.message());
        Assert.assertEquals("Hello, jvm service annotation implementation.",
                sampleJvmServiceAnnotationImpl.message());
        Assert.assertEquals("Hello, jvm service service client implementation.",
                sampleJvmServiceClientImpl.message());
    }
}
