package com.ctrip.framework.apollo.portal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.ctrip.framework.apollo.common.ApolloCommonConfig;
import com.ctrip.framework.apollo.openapi.PortalOpenApiConfig;

@EnableAspectJAutoProxy
@EnableTransactionManagement
@SpringBootApplication(scanBasePackageClasses = {ApolloCommonConfig.class,
    PortalApplication.class, PortalOpenApiConfig.class})
public class PortalApplication {

  public static void main(String[] args) throws Exception {
    SpringApplication.run(PortalApplication.class, args);
  }

}
