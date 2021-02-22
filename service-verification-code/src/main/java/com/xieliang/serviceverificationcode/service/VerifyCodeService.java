package com.xieliang.serviceverificationcode.service;

import com.xieliang.internalcommon.dto.ResponseResult;
import com.xieliang.internalcommon.dto.serviceverificationcode.VerifyCodeResponse;

public interface VerifyCodeService {
    public ResponseResult<VerifyCodeResponse> generate(int identity, String phoneNumber);
    public ResponseResult verify(int identity, String phoneNumber, String code);
}
