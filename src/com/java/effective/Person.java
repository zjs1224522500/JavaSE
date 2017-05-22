/**
 * <p>Project: 网络管理委员会招新网站, NetUnion Recruit WebSite </p>
 * <p>File: Person.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2017</p>
 * @author 张健顺
 * @email: 1224522500@qq.com
 * @date 2017年5月17日
 */
package com.java.effective;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;


/**
 * 
 */
public class Person {
	
	private final Date birthDate;
	
	/**
	 * 
	 */
	public Person(Date birthDate) {
		// TODO Auto-generated c onstructor stub
		this.birthDate = birthDate;
	}
	
	private static final Date BOOM_START;
	private static final Date BOOM_END;
	
	static {
		Calendar gmtCal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
		gmtCal.set(1946, Calendar.JANUARY, 1, 0, 0, 0);
		BOOM_START = gmtCal.getTime();
		gmtCal.set(1965, Calendar.JANUARY, 1, 0, 0, 0);
		BOOM_END = gmtCal.getTime();
	}
	
	public boolean isBabyBoomer(){
		return birthDate.compareTo(BOOM_START) >= 0 && birthDate.compareTo(BOOM_END) < 0;
	}

}
