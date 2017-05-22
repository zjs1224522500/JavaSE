/**
 * <p>Project: 网络管理委员会招新网站, NetUnion Recruit WebSite </p>
 * <p>File: InterfaceAppDemo.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2017</p>
 * @author 张健顺
 * @email: 1224522500@qq.com
 * @date 2017年5月17日
 */
package com.review;

/**
 * 
 */
public class InterfaceAppDemo {

	public static void main(String[] args) {
		People person = new People("Lucy");
		
		System.out.println("----------------");
		person.setIsay(new Person1());
		person.say();
		
		System.out.println("----------------");
		person.setIsay(new Person2());
		person.say();
		person.toString();
	}

}

/**
 * 把说话的行为抽象出一个接口
 */
interface Isay {

	public void say();
}

class Person1 implements Isay {

	public void say() {
		System.out.println("I am person1");
	}
}

class Person2 implements Isay {

	public void say() {
		System.out.println("I am person2");
	}
}

/**
 * 面向接口编程
 */
class People {

	private String name;
	
	// 把接口作为类中的一个属性（组合）
	private Isay isay;

	// 使用JavaBean注入
	public void setIsay(Isay isay) {
		this.isay = isay;
	}
	
	public People(String name) {
		this.name = name;
	}

	// 这个方法的实现是变化的，所以定义为抽象方法，定义为抽象类
	public void say(){
		isay.say();
	}
}

//abstract class Person {
//
//	private String name;
//
//	public Person(String name) {
//		this.name = name;
//	}
//
//	// 这个方法的实现是变化的，所以定义为抽象方法，定义为抽象类
//	public abstract void say();
//}

//// 这种方式还是会有很多重复的代码
// class Person1 extends Person{
//
// public Person1(String name) {
// super(name);
// }
//
// public void say(){
// System.out.println("I am person1");
// }
// }
//
// class Person2 extends Person{
//
// public Person2(String name) {
// super(name);
// }
//
// public void say(){
// System.out.println("I am person2");
// }
// }