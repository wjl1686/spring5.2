package com.springframework.test.wjl.component;

import com.springframework.test.wjl.service.UserService;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

@Component
public class CustomerFactoryBean implements FactoryBean<UserService> {
    @Override
    public UserService getObject() throws Exception {
        return new UserService();
    }

    @Override
    public Class<?> getObjectType() {
        return UserService.class;
    }
}
