/**
 * <p>Project: 网络管理委员会招新网站, NetUnion Recruit WebSite </p>
 * <p>File: ExtendsDmo.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2017</p>
 * @author 张健顺
 * @email: 1224522500@qq.com
 * @date 2017年5月11日
 */
package com.review;

import java.util.Arrays;

/**
 * 
 */
public class ExtendsDemo {

	public static void main(String[] args) {

	}

}

class Underwear {

	float price;

	String name;

	String sex;

	public Underwear(String name, String sex, float price) {
		this.name = name;
		this.sex = sex;
		this.price = price;
	}

	public String getInfo() {
		return sex + name + ",RMB:" + price;
	}
}

class UnderwareManager {

	private Underwear[] underwears = new Underwear[3];

	private int count;

	public void add(Underwear underwear) {
		if (count >= underwears.length) {
			// 数组动态扩展
			int newlen = underwears.length * 3 / 2 + 1;
			underwears = Arrays.copyOf(underwears, newlen);
		}
		underwears[count] = underwear;
	}

	// 输出所有的信息
	public Underwear[] getUnderWears() {
		Underwear[] us = new Underwear[count];
		for (int i = 0; i < us.length; i++) {
			us[i] = underwears[i];
		}
		return us;
	}

}

class PriceSortUnderWearManager extends UnderwareManager {

	@Override
	public Underwear[] getUnderWears() {
		Underwear[] us = super.getUnderWears();
		Underwear temp = null;
		for (int i = 0; i < us.length - 1 - i; i++) {
			for (int j = 0; j < us.length - 1 - i; j++) {
				if (us[j].price > us[j + 1].price) {
					temp = us[j];
					us[j] = us[j + 1];
					us[j + 1] = temp;
				}
			}
		}
		return us;
	}
}

class WomanUnderWearManager extends UnderwareManager {

	@Override
	public Underwear[] getUnderWears() {
		Underwear[] us = super.getUnderWears();
		UnderwareManager umManager = new UnderwareManager();
		for (int i = 0; i < us.length; i++) {
			//常量在前避免变量空指针异常，若为空，调用equals方法会报错
			if("女士".equals(us[i].sex)){
				umManager.add(us[i]);
			}
		}
		return umManager.getUnderWears();
	}

}
