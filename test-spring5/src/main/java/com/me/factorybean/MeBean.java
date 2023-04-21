package com.me.factorybean;

import org.springframework.beans.factory.FactoryBean;

public class MeBean implements FactoryBean {

//    getObject方法决定接受什么返回类型
    @Override
    public Object getObject() throws Exception {
        return null;
        //return new UserEntity();
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }
}
