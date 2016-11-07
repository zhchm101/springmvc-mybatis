package com.demo.dao;

import com.demo.domain.UsrInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UsrInfoDao extends BaseDao {

    public List<UsrInfo> findAll() {
        return getSqlSession().selectList("UsrInfo.findAll");
    }
}
