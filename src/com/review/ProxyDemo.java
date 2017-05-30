/**
 * <p>Project: 网络管理委员会招新网站, NetUnion Recruit WebSite </p>
 * <p>File: ProxyDemo.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2017</p>
 * @author 张健顺
 * @email: 1224522500@qq.com
 * @date 2017年5月30日
 */
package com.review;


/**
 * 代理模式（Proxy）：为其它对象提供一种代理以控制对这个对象的访问
 */
public class ProxyDemo {

	public static void main(String[] args) {
		MiaiPerson person = new MiaiPerson("小白");
		
		//创建代理对象
		Matchmaker matchmaker = new Matchmaker(person);
		matchmaker.miai();
	}
	
}

/**
 * 主题接口
 */
interface Subject{
	public void miai();
}

/**
 * 被代理的类
 */
class MiaiPerson implements Subject{
	private String name;
	public MiaiPerson(String name){
		this.name = name;
	}
	
	public void miai(){
		System.out.println(name+"正在相亲中...");
	}
}

/**
 * 代理类
 */
class Matchmaker implements Subject{
	private Subject target;//要代理的目标对象
	
	public Matchmaker(Subject target){
		this.target = target;
	}
	
	public void before(){
		System.out.println("为代理人匹配如意郎君。");
	}
	
	public void after(){
		System.out.println("本次相亲结束");
	}
	
	@Override
	public void miai() {
		before();
		// 真正执行相亲的方法
		target.miai();
		after();
	}
	
	
}