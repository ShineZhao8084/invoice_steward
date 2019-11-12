package com.asiainfo.invoice_steward.main.service.impl;

import com.asiainfo.invoice_steward.main.dao.BaseUserMapper;
import com.asiainfo.invoice_steward.main.service.AuthService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class AuthServiceImpl implements AuthService {

    @Resource
    private BaseUserMapper baseUserMapper;

    @Override
    public int checkAuthStatus(Long accountCode) {
        return baseUserMapper.checkAuthStatus(accountCode);
    }
}
