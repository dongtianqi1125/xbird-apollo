package com.ctrip.framework.apollo.portal.spi.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ctrip.framework.apollo.portal.spi.defaultimpl.DefaultMQService;

@Configuration
public class MQConfiguration {

  @Bean
  public DefaultMQService mqService() {
    return new DefaultMQService();
  }

}
