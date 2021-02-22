package com.xieliang.serviceverificationcode.service.impl;

import com.xieliang.internalcommon.dto.ResponseResult;
import com.xieliang.internalcommon.dto.serviceverificationcode.VerifyCodeResponse;
import com.xieliang.serviceverificationcode.service.VerifyCodeService;
import org.springframework.stereotype.Service;

@Service
public class VerifyCodeServiceImpl implements VerifyCodeService {

    @Override
    public ResponseResult<VerifyCodeResponse> generate(int identity, String phoneNumber) {
        String code = String.valueOf((int)((Math.random()*9+1)*Math.pow(10,5)));
        VerifyCodeResponse data = new VerifyCodeResponse();
        data.setCode(code);
        return ResponseResult.success(data);
    }

    // 校验验证码,
    @Override
    public ResponseResult verify(int identity, String phoneNumber, String code){
        return null;
    }
}
