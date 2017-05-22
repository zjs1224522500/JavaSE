/**
 * <p>Project: 网络管理委员会招新网站, NetUnion Recruit WebSite </p>
 * <p>File: FactoryDemo.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2017</p>
 * @author 张健顺
 * @email: 1224522500@qq.com
 * @date 2017年5月20日
 */
package com.review;


/**
 * 工厂设计模式：
 * 
 */
public class FactoryDemo {
	
	public static void main(String[] args) {
		
//		ClothDoll clothDoll = new ClothDoll();
//		System.out.println(clothDoll.getInfo());
//		
//		BarbieDoll barbieDoll = new BarbieDoll();
//		System.out.println(barbieDoll.getInfo());
		
		Doll clothDoll = DollFactory.getInstance("ClothDoll");
		if(null != clothDoll)
			System.out.println(clothDoll.getInfo());
		Doll barbieDoll = DollFactory.getInstance("Barbie");
		if(null != barbieDoll)
			System.out.println(barbieDoll.getInfo());
	}
}

//工厂类  降低耦合性（主函数与具体类之间的耦合）  解耦合     转移依赖关系
/**
 * 避免主类直接调用具体类来定义对象，然而被调用类可能发生了一些改变，
 * 那么对于main类的代码将会产生影响，可维护性下降，因为太过于依赖具体的类，
 * 故想让主类不与具体类产生依赖关系，所以选择引入工厂模式，也就是一个中间类，
 * 中间类中根据条件产生相应的对象，依赖具体的类，而主类只是需要调用工程类的
 * 相应方法并传入不同的参数就可以产生相应的对象。
 */
class DollFactory{
	public static Doll getInstance(String name){
		// 根据条件生产不同的对象
		if("ClothDoll".equals(name)){
			return new ClothDoll();
		}else if("Barbie".equals(name)){
			return new BarbieDoll();
		}else{
			return null;
		}
	}
	
}


interface Doll{
	String getInfo();
}

class ClothDoll implements Doll{
	public String getInfo(){
		return "我是布娃娃，我怕脏";
	}
}

class BarbieDoll implements Doll{
	public String getInfo(){
		return "我是芭比娃娃,我美得不可思议";
	}
}
