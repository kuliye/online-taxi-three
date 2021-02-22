package com.xieliang.apipassenger.service;

import com.xieliang.internalcommon.dto.ResponseResult;
import org.springframework.stereotype.Service;

@Service
public interface VerificationCodeService {

    public ResponseResult send(String phoneNumber);

    public ResponseResult verify(String phoneNumber, String code);
}
