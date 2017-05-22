/**
 * <p>Project: 网络管理委员会招新网站, NetUnion Recruit WebSite </p>
 * <p>File: DoubleColorBall.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2017</p>
 * @author 张健顺
 * @email: 1224522500@qq.com
 * @date 2017年5月5日
 */
package com.review;

import java.util.Random;
import java.util.Scanner;

/**
 * 应用案例：模拟双色球彩票程序 实现步骤：
 * 1、 系统生成一个蓝球和六个红球，并存储起来; 
 * 2、接受用户选号，一个蓝球和六个红球; 
 * 3、验证系统号码与用户号码是否匹配（是否中奖）;
 * 4、公布本期中奖号码(按顺序输出)
 */
public class DoubleColorBall {

	public static void main(String[] args) {

		int sysBlueBallNum;// 系统生成的蓝球号
		int[] sysRedBallNum = new int[6]; // 系统生成的红球号
		int userBlueBallNum;// 用户选择的蓝球号
		int[] userRedBallNum = new int[6];// 用户选择的红球号

		int blueBall = 0;// 蓝球号码是否正确
		int redBallCount = 0;// 记录红球正确的数量

		Random random = new Random();// 创建生成随机数的工具类
		Scanner input = new Scanner(System.in);

		int[] redNum = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21,
				22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33 };

		sysBlueBallNum = random.nextInt(16) + 1;// 产生系统的蓝球号码
		// 随机生成红球号码(保证生成的随机数不能相同)
		for (int i = 0; i < sysRedBallNum.length; i++) {
			while (true) {
				int index = random.nextInt(33);
				if (redNum[index] != 0) {
					sysRedBallNum[i] = redNum[index];
					redNum[index] = 0;
					break;
				}
			}
		}
		System.out.println("双色球选号开始。。。祝你好运！");
		System.out.println("请选择蓝球号码（16选一）：");
		userBlueBallNum = input.nextInt();

		System.out.println("请选择红球号码（33选六）：");
		for (int i = 0; i < userRedBallNum.length; i++) {
			userRedBallNum[i] = input.nextInt();
		}

		input.close();

		// 验证蓝球和红球的正确个数
		if (userBlueBallNum == sysBlueBallNum) {
			blueBall = 1;
		}

		for (int i = 0; i < userRedBallNum.length; i++) {
			for (int j = 0; j < sysRedBallNum.length; j++) {
				if (userRedBallNum[i] == sysRedBallNum[j]) {
					redBallCount++;
					break;
				}
			}
		}

		// 判断是否中奖
		if (blueBall == 1 && redBallCount == 6) {
			System.out.println("一等奖");
		} else if (redBallCount == 6) {
			System.out.println("二等奖");
		} else if (blueBall == 1 && redBallCount == 5) {
			System.out.println("三等奖");
		} else if (redBallCount == 5 || (redBallCount == 4 && blueBall == 1)) {
			System.out.println("四等奖");
		} else if (redBallCount == 4 || (redBallCount == 3 && blueBall == 1)) {
			System.out.println("五等奖");
		} else if (blueBall == 1) {
			System.out.println("六等奖");
		} else {
			System.out.println("革命尚未成功，同志仍需努力！");
		}

		// 公布本期中奖号码
		int temp;
		for (int i = 0; i < sysRedBallNum.length - 1; i++) {
			// 控制每轮比较的次数
			for (int j = 0; j < sysRedBallNum.length - 1 - i; j++) {
				if (sysRedBallNum[j] > sysRedBallNum[j + 1]) {
					temp = sysRedBallNum[j];
					sysRedBallNum[j] = sysRedBallNum[j + 1];
					sysRedBallNum[j + 1] = temp;
				}
			}
		}
		System.out.println("本期中奖号码为：");
		System.out.print("红球：");
		for (int i = 0; i < sysRedBallNum.length; i++) {
			System.out.print(sysRedBallNum[i] + " ");
		}
		System.out.println();
		System.out.print("蓝球：" + sysBlueBallNum);
	}
}
