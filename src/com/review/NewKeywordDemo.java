/**
 * <p>Project: 网络管理委员会招新网站, NetUnion Recruit WebSite </p>
 * <p>File: NewKeywordDemo.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2017</p>
 * @author 张健顺
 * @email: 1224522500@qq.com
 * @date 2017年5月5日
 */
package com.review;

/**
 * 
 */
public class NewKeywordDemo {

	public static void main(String[] args) {
		Dog dog = null;// 声明一个对象
		dog = new Dog();// 实例化对象
		// 给对象的属性赋值
		dog.name = "Dog";
		dog.age = 4;
		dog.say();
	}
}

class Dog {

	String name;

	int age;

	void say() {
		System.out.println("My name is " + name + ",my age is " + age);
	}
}
