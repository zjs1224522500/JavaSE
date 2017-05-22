/**
 * <p>Project: 网络管理委员会招新网站, NetUnion Recruit WebSite </p>
 * <p>File: RightTriangle.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2017</p>
 * @author 张健顺
 * @email: 1224522500@qq.com
 * @date 2017年4月28日
 */
package com.review;

/**
 * 输出三角形
 */
public class RightTriangle {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int j = i; j < 4; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println();
		System.out.println();
		System.out.println();

		for (int i = 0; i < 5; i++) {
			for (int j = i; j <= 4; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= 2 * i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println();
		System.out.println();
		System.out.println();

		char[] cs = { 'A', 'B', 'C', 'D', 'E', 'F', 'G' };
		for (int i = 0; i < cs.length; i++) {
			for (int j = i; j < cs.length - 1; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i * 2; j++) {
				System.out.print(cs[i]);
			}
			System.out.println();
		}

	}

}
