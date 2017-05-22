/**
 * <p>Project: 网络管理委员会招新网站, NetUnion Recruit WebSite </p>
 * <p>File: FingerGuessing.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2017</p>
 * @author 张健顺
 * @email: 1224522500@qq.com
 * @date 2017年5月6日
 */
package com.review;

import java.util.Random;
import java.util.Scanner;

/**
 * 
 */
public class FingerGuessing {

	
}

class Game{
	public void begin(){
		System.out.println("**********************");
		System.out.println("*******猜拳游戏*********");
		System.out.println("游戏规则：(1、剪刀  2、石头  3、布)");
		System.out.println("开始游戏(1/0) : ");
		Scanner in = new Scanner(System.in);
		int result = in.nextInt();
		if(result == 1){
			System.out.println("请输入猜拳次数：");
			int num = in.nextInt();
			in.close();
			play(num);
		}else{
			System.out.println("bye bye!");
		}
	}
	
	public void play(int num){
		int userScore = 0;
		int pcScore = 0;
		Random random =new Random();
		Scanner in = new Scanner(System.in);
		while(num > 0){
			int pc = random.nextInt(100)%3 + 1;
			System.out.println("请输入你的选择：");
			int user = in.nextInt();
			if(user==1){
				System.out.println("你出剪刀");
				switch(pc){
					case 1:
						System.out.println("平局，电脑出剪刀");
						break;
					case 2:
						System.out.println("你输了，电脑出石头");
						pcScore++;
						break;
					case 3:
						System.out.println("你赢了，电脑出布");
						break;
				}
			}
			num--;
		}
		in.close();
	}
	
}
