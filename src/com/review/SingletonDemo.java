/**
 * <p>Project: 网络管理委员会招新网站, NetUnion Recruit WebSite </p>
 * <p>File: Singleton.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2017</p>
 * @author 张健顺
 * @email: 1224522500@qq.com
 * @date 2017年5月11日
 */
package com.review;


/**
 * 单例设计模式，只有一个对象
 * 
 * 应用：工具类一般设计为单例
 */
public class SingletonDemo {

	public static void main(String[] args) {
		Singleton1 singleton1 = Singleton1.getInstance();
		singleton1.print();
		/*
		保证单例，获取到的都是相同的实例
		Singleton1 singleton2 = Singleton1.getInstance();
		Singleton1 singleton3 = Singleton1.getInstance();
		Singleton1 singleton4 = Singleton1.getInstance();
		Singleton1 singleton5 = Singleton1.getInstance();
		 */
		Singleton1 singleton12 = Singleton1.getInstance();
		System.out.println(singleton1 == singleton12);//因为是同一个对象，输出为true
		
		
		Singleton2 singleton2 = Singleton2.getInstance();
		singleton2.print();
	}
}


/**
 * 单例设计模式
 * 饿汉式	
 */
class Singleton1{
	
	// 定义一个对象并实例化
	private static Singleton1 singleton1 = new Singleton1();
	
	// 构造方法私有化
	private Singleton1(){
		
	}
	
	// 获取实例 的静态方法
	public static Singleton1 getInstance(){
		return singleton1;
	}
	
	public void print(){
		System.out.println("饿汉式-单例设计模式");
	}
}

/**
 * 单例设计模式
 * 懒汉式（多线程访问时会有安全问题）
 */
class Singleton2{
	
	// 定义一个对象并实例化
	private static Singleton2 singleton2 = null;
	
	// 构造方法私有化
	private Singleton2(){
		
	}
	
	// 获取实例 的静态方法
	public static Singleton2 getInstance(){
		if(singleton2 == null){
			singleton2 = new Singleton2();
		}
		return singleton2;
	}
	
	public void print(){
		System.out.println("懒汉式-单例设计模式");
	}
}

