package com.demo.dao;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;

public abstract class BaseDao extends SqlSessionDaoSupport {

    @Qualifier(value="sqlSessionFactory")
    @Autowired
    private SqlSessionFactory mySqlSessionFactory;

    @PostConstruct
    public void setSqlSessionFactory( ) {
        this.setSqlSessionFactory(mySqlSessionFactory);
    }
}