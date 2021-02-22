package com.xieliang.apipassenger.service;


import com.xieliang.internalcommon.dto.ResponseResult;
import org.springframework.stereotype.Service;

@Service
public interface ServiceSmsRestTemplateService {

    public ResponseResult sendSms(String phoneNumber , String code);
}
