package com.xieliang.apipassenger.service;

import com.xieliang.internalcommon.dto.ResponseResult;
import org.springframework.stereotype.Service;

@Service
public interface AuthService {
    public ResponseResult auth(String passengerPhone, String code);
}
