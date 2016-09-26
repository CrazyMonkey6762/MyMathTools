package org.stone.radix;

import java.math.BigInteger;

/**  
 * @ClassName_MyTest
 * @author_Stone6762  
 * @CreationTime_2016年9月26日 下午7:58:21
 * @Description_
 */
public class MyTest {

	/**
	 * 
	 * @Description: (再大的数都能给你实现进制转换)
	 * @param number
	 * @return
	 */
	public static String d2string(String number,int oldRadix,int aimRadix){
		BigInteger bigInteger=new BigInteger(number, oldRadix);
		bigInteger.toString(aimRadix);
		return bigInteger.toString(2);
	}
	
}
