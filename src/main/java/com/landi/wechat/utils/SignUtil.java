package com.landi.wechat.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/**
 * 校验微信消息真实性工具类
 *
 * @author Randy
 * @date 2015-10-13
 */

public class SignUtil {
	private static String token = "weixintuisong";

	public static boolean checkSignature(String signature, String timestamp,
			String nonce) {
		String arr[] = new String[] { token, timestamp, nonce };
		// 字典排序
		Arrays.sort(arr);
		StringBuilder content = new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
			content.append(arr[i]);
		}
		// java加密类
		MessageDigest md = null;
		String tmp = null;

		try {
			md = MessageDigest.getInstance("SHA-1");
			// 进行SHA-1加密
			byte[] digest = md.digest(content.toString().getBytes());
			tmp = byteToStr(digest);
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		content = null;
		// 将字典排序并SHA-1加密后的字符串与signsture比较，如果相同则确定来源于微信
		// toUpperCase的意思是将所有的英文字符转换为大写字母
		return tmp != null ? tmp.equals(signature.toUpperCase()) : false;

	}

	/**
	 * 将字节数组转换为十六进制字符串
	 * 
	 * @param byteArray
	 * @return
	 */
	private static String byteToStr(byte[] byteArray) {
		String strDigest = "";
		for (int i = 0; i < byteArray.length; i++) {
			strDigest += byteToHexStr(byteArray[i]);
		}
		return strDigest;
	}

	/**
	 * 将字节转换为十六进制字符串
	 * 
	 * @param mByte
	 * @return
	 */
	private static String byteToHexStr(byte mByte) {
		char[] Digit = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A',
				'B', 'C', 'D', 'E', 'F' };
		char[] tempArr = new char[2];
		tempArr[0] = Digit[(mByte >>> 4) & 0X0F];
		tempArr[1] = Digit[mByte & 0X0F];

		String s = new String(tempArr);
		return s;
	}
}
