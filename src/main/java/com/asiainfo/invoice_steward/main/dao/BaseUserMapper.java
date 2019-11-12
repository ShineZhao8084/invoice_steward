package com.asiainfo.invoice_steward.main.dao;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BaseUserMapper {

    int checkAuthStatus(Long accountCode);

}
