package com.tp2Assignment3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by student on 2016/03/12.
 */
@Configuration
public class AppConfig {
    @Bean(name="dep")
    public AccountInterface getService(){
        return new AccountImpl();
    }

    @Bean(name="newDep")
    public AccountInterface getNewService(){
        return new otherAccountImpl();
    }

}
