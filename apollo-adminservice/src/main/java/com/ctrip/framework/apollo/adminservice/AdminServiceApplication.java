package com.ctrip.framework.apollo.adminservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.ctrip.framework.apollo.biz.ApolloBizConfig;
import com.ctrip.framework.apollo.common.ApolloCommonConfig;

@EnableAspectJAutoProxy
@EnableEurekaClient
@EnableTransactionManagement
@SpringBootApplication(scanBasePackageClasses = {ApolloCommonConfig.class, ApolloBizConfig.class,
    AdminServiceApplication.class})
public class AdminServiceApplication {

  public static void main(String[] args) throws Exception {
    SpringApplication.run(AdminServiceApplication.class, args);
  }

}
