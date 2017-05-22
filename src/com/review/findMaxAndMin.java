/**
 * <p>Project: 网络管理委员会招新网站, NetUnion Recruit WebSite </p>
 * <p>File: findMaxAndMin.java</p>
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
public class findMaxAndMin {

	public static void main(String[] args) {
		int[] nums = { 123, 22, 12, 65, 88 };
		int max = nums[0];
		int min = nums[0];
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] > max) {
				max = nums[i];
			}
			if (nums[i] < min) {
				min = nums[i];
			}
		}
		System.out.println("max:" + max);
		System.out.println("min:" + min);

	}

}
