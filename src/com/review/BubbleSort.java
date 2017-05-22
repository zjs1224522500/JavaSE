/**
 * <p>Project: 网络管理委员会招新网站, NetUnion Recruit WebSite </p>
 * <p>File: BubbleSort.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2017</p>
 * @author 张健顺
 * @email: 1224522500@qq.com
 * @date 2017年5月5日
 */
package com.review;

/**
 * 冒泡排序
 */
public class BubbleSort {

	public static void main(String[] args) {
		int[] nums = { 705, 826, 680, 654, 696 };
		// 声明一个临时变量用于交换过程的存储
		int tmp; 
		// 控制比较的轮数
		for (int i = 0; i < nums.length - 1; i++) {
			// 控制每轮比较的次数
			for (int j = 0; j < nums.length - 1 - i; j++) {
				if (nums[j] > nums[j + 1]) {
					tmp = nums[j];
					nums[j] = nums[j + 1];
					nums[j + 1] = tmp;
				}
			}
		}
		System.out.println("使用冒泡排序后的数列是:");
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
	}

}
