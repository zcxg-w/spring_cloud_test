package com.wy.spring_config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.cloud.config.server.config.ConfigServerProperties;
import org.springframework.cloud.config.server.environment.SvnEnvironmentRepositoryFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.ConfigurableEnvironment;

//@Configuration
//@ConditionalOnClass(SvnFactoryConfig.SVNException.class)
public  class SvnFactoryConfig {
  //  @Bean
    public SvnEnvironmentRepositoryFactory svnEnvironmentRepositoryFactory(ConfigurableEnvironment environment,
                                                                           ConfigServerProperties server) {
        return new SvnEnvironmentRepositoryFactory(environment, server);
    }

    public class SVNException extends Exception {

    }
}