package com.huawei.cn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ServletComponentScan
@ImportResource("ApplicationContext.xml") // 导入外部配置资源
public class BaoSaaSApplication {

    public static void main(String[] args) {
        SpringApplication.run(BaoSaaSApplication.class, args);
    }
}
