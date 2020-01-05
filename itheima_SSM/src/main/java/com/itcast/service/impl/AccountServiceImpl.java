package com.itcast.service.impl;

import com.itcast.domain.Account;
import com.itcast.mapper.AccountMapper;
import com.itcast.service.AccountService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
@Service("accountService")
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountMapper accountMapper;
    public void save(Account account) {
        accountMapper.save(account);
    }

    public List<Account> findAll() {

        return accountMapper.findAll();
    }
}
