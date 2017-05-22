/**
 * <p>Project: 网络管理委员会招新网站, NetUnion Recruit WebSite </p>
 * <p>File: StringDeo.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2017</p>
 * @author 张健顺
 * @email: 1224522500@qq.com
 * @date 2017年5月5日
 */
package com.review;

import java.io.UnsupportedEncodingException;

/**
 * String 类编译期与运行期分析
 */
public class StringDemo {

	public static void main(String[] args) throws UnsupportedEncodingException {

		CompareString();
		usualMethod();
		stringTest1();
		stringTest2();

	}

	public static void stringTest2() {
		String str = "张三:男:学生|李四:女:老师";
		String[] values = str.split("\\|");
		for (String s : values) {
			System.out.println(s.replace(":", "->"));
		}
		System.out.println();
	}

	public static void stringTest1() {
		String email = "1224522500@qq.com";

		boolean flag = false;
		int at = email.indexOf('@');
		int point = email.lastIndexOf('.');

		if (at > 0 && at < point) {
			flag = true;
		}

		if (flag) {
			System.out.println("email格式合法");
		} else {
			System.out.println("email格式不合法");
		}
	}

	public static void usualMethod() throws UnsupportedEncodingException {
		System.out.println("abcde".charAt(3));
		System.out.println("abcde".toCharArray()[2]);
		byte[] bytes = "abcde".getBytes();
		for (int i = 0; i < bytes.length; i++) {
			System.out.println(bytes[i]);
		}
		System.out.println(new String(bytes).toString());
		System.out.println(new String(bytes, 0, 2).toString());// ab
		System.out.println(new String(bytes, "utf-8").toString());

		System.out.println("abcde".startsWith("ab"));// true
		System.out.println("abcde".startsWith("cd", 2));// true
		System.out.println("abcde".endsWith("de"));// true

		System.out.println("abc,de".replace(",", ":").toString());// abc:de
		System.out.println("abcde".replace("ab", "AB"));// ABcde

		// 匹配正则表达式中26个字母替换为相应的字符串
		System.out.println("abcde".replaceAll("[a-z]", "*"));// *****
		System.out.println("abcde".replaceFirst("[a-z]", "*"));// *bcde

		// 包括起始位置
		System.out.println("abcde".substring(2));// cde
		// 包括起始位置，不包括结束位置
		System.out.println("abcde".substring(1, 3));// bc

		String[] value = "ab-cde".split("-");// 传入的参数为正则表达式
		String[] value2 = "ab-c-de".split("-", 3);// 拆分成三个字符串数组
		for (String s : value) {
			System.out.println(s);
		} // ab cde
		for (String s : value2) {
			System.out.println(s);
		} // ab c de

		System.out.println("abcde".contains("abc"));// true
		System.out.println("abcde".indexOf("a"));// 0 参数虽然为整形，但会转为unicode字符
		System.out.println("abcde".indexOf("bc"));// 0 返回首地址
		System.out.println("abcded".lastIndexOf("d"));// 5
		System.out.println("abcdede".lastIndexOf("de"));// 5

		System.out.println("abcde".isEmpty());// false
		System.out.println("abcde".length());// 5
		System.out.println("abcde".toUpperCase());// ABCDE
		System.out.println("ABCDE".toLowerCase());// abcde
		System.out.println(" abcde ".trim());// abcde
		System.out.println("abc".concat("de"));// abcde
	}

	public static void CompareString() {
		// 情况一 结果为true
		String aString = "a1";
		String a1String = "a" + 1;
		System.out.println(aString == a1String);

		// 情况二 结果为false
		String bString = "b1";
		int bb = 1;
		String b1String = "b" + bb;
		System.out.println(bString == b1String);

		// 情况三 结果为true
		String cString = "c1";
		final int cc = 1;
		String c1String = "c" + cc;
		System.out.println(cString == c1String);

		// 情况四 结果为false
		String dString = "dd";
		final int dd = getDD();
		String d1String = dString + dd;
		System.out.println(dString == d1String);
	}

	public static int getDD() {
		return 1;
	}

}
