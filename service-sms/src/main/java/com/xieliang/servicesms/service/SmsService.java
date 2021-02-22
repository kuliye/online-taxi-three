package com.xieliang.servicesms.service;


import com.xieliang.internalcommon.dto.ResponseResult;
import com.xieliang.internalcommon.dto.servicesms.request.SmsSendRequest;

public interface SmsService {
	/**
	 * 发送短信
	 * @param request
	 * @return
	 */
	public ResponseResult sendSms(SmsSendRequest request);
}