/**
 * <p>Project: 网络管理委员会招新网站, NetUnion Recruit WebSite </p>
 * <p>File: InnnerClassDemo3.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2017</p>
 * @author 张健顺
 * @email: 1224522500@qq.com
 * @date 2017年5月30日
 */
package com.review;


/**
 * 内部类：静态内部类
 * 相当于一个外部的类
 */
public class InnnerClassDemo3 {
	public static void main(String[] args) {
		Dog.ChildDog childDog = new Dog.ChildDog();
		childDog.talk();
		
		Dog.childTalk();
	}
	
}

class Dog{
	private String name;
	public Dog(String name){
		this.name = name;
	}
	public void say(){
		System.out.println("我是一只狗，主人叫我" + name);
	}

	//静态关键字修饰类的话只能修饰内部类，且无法访问非静态的属性
	 static class ChildDog{
		public void talk(){
			System.out.println("我是一只狗狗");
		}
	}
	 
	 public static void childTalk(){
		 ChildDog childDog = new ChildDog();
		 childDog.talk();
	 }
}