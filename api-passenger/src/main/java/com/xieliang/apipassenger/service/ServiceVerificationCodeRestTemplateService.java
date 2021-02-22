package com.xieliang.apipassenger.service;


import com.xieliang.internalcommon.dto.ResponseResult;
import org.springframework.stereotype.Service;

@Service
public interface ServiceVerificationCodeRestTemplateService {

    public ResponseResult generatorCode(int identity, String phoneNumber);

    public ResponseResult verifyCode(int identity, String phoneNumber , String code);
}
