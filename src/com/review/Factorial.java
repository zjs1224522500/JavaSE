/**
 * <p>Project: 网络管理委员会招新网站, NetUnion Recruit WebSite </p>
 * <p>File: Factorial.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2017</p>
 * @author 张健顺
 * @email: 1224522500@qq.com
 * @date 2017年4月28日
 */
package com.review;


/**
 * 
 */
public class Factorial {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			int s = 1;
			for (int j = 1; j <= i; j++) {
				s *= j;
			}
			sum += s;
		}
		System.out.println(sum);
	}

}
