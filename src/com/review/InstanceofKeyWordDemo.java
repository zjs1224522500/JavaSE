/**
 * <p>Project: 网络管理委员会招新网站, NetUnion Recruit WebSite </p>
 * <p>File: InstanceofKeyWordDemo.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2017</p>
 * @author 张健顺
 * @email: 1224522500@qq.com
 * @date 2017年5月14日
 */
package com.review;


/**
 * 
 */
public class InstanceofKeyWordDemo {
	
	public static void main(String[] args) {
		
		Person man = new Man();
		say((Man)man);//父类对象需要强制转换为子类对象
		
		Woman woman = new Woman();
		say(woman);
	}

//	
//	//static 和 返回类型 的位置不可交换
//	public static void say(Man man){
//		man.say();
//	}
//	
//	public static void say(Woman woman){
//		woman.say();
//	}
	
	public static void say(Person person){
		person.say();
//		person.getAngry(); //由于父类没有该方法，故无法调用
//		Woman woman = (Woman)person; //会报出类型转换异常,因为传入的person可能为man
		
		// 判断person对象是否为woman的实例
		if(person instanceof Woman){
			Woman woman = (Woman)person;
			woman.getAngry();
		}
		
	}
}

abstract class Person{
	private String name;
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public abstract void say();//抽象方法
}

class Man extends Person{

	/* (non-Javadoc)
	 * @see com.review.Person#say()
	 */
	@Override
	public void say() {
		// TODO Auto-generated method stub
		System.out.println("I am a man!!!");
	}
}

class Woman extends Person{

	/* (non-Javadoc)
	 * @see com.review.Person#say()
	 */
	@Override
	public void say() {
		// TODO Auto-generated method stub
		System.out.println("I am a woman!!!!");
	}
	
	// 本类中进行扩展的方法
	public void getAngry(){
		System.out.println("I am angry!!!");
	}
	
}
