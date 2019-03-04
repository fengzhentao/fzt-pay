package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pass.instance.add response.
 * 
 * @author auto create
 * @since 1.0, 2017-01-20 16:02:05
 */
public class AlipayPassInstanceAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 2855397494326392989L;

	/** 
	 * 接口调用返回结果信息,如果添加成功则展示券ID
	 */
	@ApiField("result")
	private String result;

	/** 
	 * 操作成功标识【true：成功；false：失败】
	 */
	@ApiField("success")
	private String success;

	public void setResult(String result) {
		this.result = result;
	}
	public String getResult( ) {
		return this.result;
	}

	public void setSuccess(String success) {
		this.success = success;
	}
	public String getSuccess( ) {
		return this.success;
	}

}
