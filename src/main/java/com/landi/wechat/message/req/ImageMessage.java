package com.landi.wechat.message.req;

/**
 * 图片消息
 * 
 * @author Randy
 * @date 2015-10-14
 */
public class ImageMessage extends BaseMessage {
	// 图片链接
	private String PicUrl;

	public String getPicUrl() {
		return PicUrl;
	}

	public void setPicUrl(String picUrl) {
		PicUrl = picUrl;
	}
}
