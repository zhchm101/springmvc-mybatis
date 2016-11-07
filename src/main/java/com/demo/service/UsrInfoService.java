package com.demo.service;

import com.demo.dao.UsrInfoDao;
import com.demo.domain.UsrInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UsrInfoService {

    @Resource
    private UsrInfoDao usrInfoDao;

    public List<UsrInfo> findAll() {
        return usrInfoDao.findAll();
    }
}
