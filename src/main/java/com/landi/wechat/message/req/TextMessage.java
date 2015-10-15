package com.landi.wechat.message.req;

/**
 * 文本消息
 * 
 * @author Randy
 * @date 2015-10-14
 */
public class TextMessage extends BaseMessage {
	// 消息内容
	private String Content;

	public String getContent() {
		return Content;
	}

	public void setContent(String content) {
		Content = content;
	}
}
