/**
 * <p>Project: 网络管理委员会招新网站, NetUnion Recruit WebSite </p>
 * <p>File: InnerClassDemo2.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2017</p>
 * @author 张健顺
 * @email: 1224522500@qq.com
 * @date 2017年5月30日
 */
package com.review;


/**
 * 
 */
public class InnerClassDemo2 {

}

class Dog{
	private String name;
	public Dog(String name){
		this.name = name;
	}
	public void say(){
		System.out.println("我是一只狗，主人叫我" + name);
	}
	
	// 在方法里面声明一个内部类
	public void childTalk(final String childName){
		final int x = 10;
		class ChildDog{
			public void talk(){
				System.out.println("我是一只狗狗，我妈妈是"+ name);
				System.out.println("x=" + x);
				System.out.println("我的名字是" + childName);
			}
		}
		ChildDog childDog = new ChildDog();
		childDog.talk();
	}
}

