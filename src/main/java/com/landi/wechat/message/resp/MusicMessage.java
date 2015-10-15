package com.landi.wechat.message.resp;

/**
 * 音乐消息
 * 
 * @author Randy
 * @date 2015-10-15
 */
public class MusicMessage extends BaseMessage {
	// 音乐
	private Music Music;

	public Music getMusic() {
		return Music;
	}

	public void setMusic(Music music) {
		Music = music;
	}
}