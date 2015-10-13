package com.landi.wechat.pojo;

/**
 * 多级按钮
 * 
 * @author Randy
 * @date 2015-10-13
 */

public class ComplexButton extends Button {
	private Button[] com_button;

	public Button[] getCom_button() {
		return com_button;
	}

	public void setCom_button(Button[] com_button) {
		this.com_button = com_button;
	}
	
}
