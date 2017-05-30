/**
 * <p>Project: 网络管理委员会招新网站, NetUnion Recruit WebSite </p>
 * <p>File: AdapterDemo.java</p>
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
public class AdapterDemo {
	
	public static void main(String[] args) {
		PowerA powerA = new PowerAImplA();
		startA(powerA);
		
		
		PowerB powerB = new PowerBImpl();
		//startA(powerB); 报错
		PowerAAdapter pAAdapter = new PowerAAdapter(powerB);
		startA(pAAdapter);
		
	}
	
	public static void startA(PowerA powerA){
		// ......
		powerA.insert();
		// ......
	}
	//与startA的内容大部分重复
//	public static void startB(PowerB powerB){
//		// ......
//		powerB.connect();
//		// ......
//	}
}

class PowerAAdapter implements PowerA{
	
	private PowerB powerB;// 要进行适配的接口
	
	public PowerAAdapter(PowerB powerB) {
		this.powerB = powerB;
	}

	@Override
	public void insert() {
		powerB.connect();
	}
	
}

/**
 * 电源A接口
 */
interface PowerA{
	public void insert();
}

class PowerAImplA implements PowerA{

	/* (non-Javadoc)
	 * @see com.review.PowerA#insert()
	 */
	@Override
	public void insert() {
		// TODO Auto-generated method stub
		System.out.println("电源A接口插入，开始工作。");
	}
	
}

/**
 * 电源B接口
 */
interface PowerB{
	public void connect();
}

class PowerBImpl implements PowerB{
	public void connect(){
		System.out.println("电源B接口已连接。");
	}
}
