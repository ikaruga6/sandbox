package com.test.degrade.bean;

import com.test.degrade.entity.User;
import com.test.degrade.service.base.CrudService;
import com.test.degrade.service.base.CurdWrapperDegradeService;
import com.test.degrade.service.base.CurdWrapperStandardService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

/**
 * Bean注册
 */
@Configuration
public class CrudServiceBeans {

    @Bean
    public CrudService<User, String> standardUserService() {
        return new CurdWrapperStandardService<User, String>();
    }

    @Bean
    @DependsOn("standardUserService")
    public CrudService<User, String> degradeUserService(CrudService<User, String> standardService) {
        return new CurdWrapperDegradeService<User, String>();
    }

}
