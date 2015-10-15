package com.landi.wechat.message.resp;

/**
 * 文本消息
 * 
 * @author Randy
 * @date 2015-10-15
 */
public class TextMessage extends BaseMessage {
	// 回复的消息内容
	private String Content;

	public String getContent() {
		return Content;
	}

	public void setContent(String content) {
		Content = content;
	}
}