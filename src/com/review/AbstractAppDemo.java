/**
 * <p>Project: 网络管理委员会招新网站, NetUnion Recruit WebSite </p>
 * <p>File: AbstractAppDemo.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2017</p>
 * @author 张健顺
 * @email: 1224522500@qq.com
 * @date 2017年5月14日
 */
package com.review;

import java.util.Random;

/**
 * 抽象类的应用
 */
public class AbstractAppDemo {

	public static void main(String[] args) {
		Palace palace = new Shemale("Lucy");
		System.out.println("start !!!");
		palace.action();
	}
}

abstract class Palace{
	
	public void action(){
		if(competition()){
			System.out.println("success!!!");
		}else{
			System.out.println("failure");
		}
	}
	
	//比赛方法
	public abstract boolean competition();//抽象方法
	
}

class Shemale extends Palace{
	private String name;
	public Shemale(String name){
		this.name = name;
	}

	@Override
	public boolean competition() {
		System.out.println("I am "+name);
		System.out.println("Competition starts!!!");
		Random random = new Random();
		
		//随机产生  boolean 值
		return random.nextBoolean();
	}
}
