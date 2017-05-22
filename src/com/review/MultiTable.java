/**
 * <p>Project: 网络管理委员会招新网站, NetUnion Recruit WebSite </p>
 * <p>File: MultiTable.java</p>
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
public class MultiTable {

	public static void main(String[] args) {
		int i = 1;
		int j;
		int result;
		// 控制乘法表行数
		while (i <= 9) {
			j = 1;
			while (j <= i) {
				result = i * j;
				System.out.print(j + "X" + i + "=" + result + "\t");
				j++;
			}
			i++;
			System.out.println();
		}
	}

}
