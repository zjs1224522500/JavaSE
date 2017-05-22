/**
 * <p>Project: 网络管理委员会招新网站, NetUnion Recruit WebSite </p>
 * <p>File: PredictNumber.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2017</p>
 * @author 张健顺
 * @email: 1224522500@qq.com
 * @date 2017年4月28日
 */
package com.review;

import java.util.Scanner;

/**
 * 
 */
public class PredictNumber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] sum = {10,5,8,9,12,88,13};
		System.out.println("猜数游戏开始：");
		System.out.println("请输入一个数：");
		
		boolean flag = false;
		
		int value = input.nextInt();
		input.close();
		for(int i = 0; i < sum.length; i++){
			if(sum[i] == value){
				flag = true;
				break;
			}
		}
		
		if(flag){
			System.out.println("Right!!!");
		}else {
			System.out.println("Wrong!!!");
		}
	}

}
