package com.landi.wechat.pojo;

/**
 * 直接跳转按钮(View型)按钮
 * 
 * @author Randy
 * @date 2015-10-13
 */

public class ViewButton extends Button {
	private String url;
	private String type;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
