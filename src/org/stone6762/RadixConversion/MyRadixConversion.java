package org.stone6762.RadixConversion;

import java.math.BigInteger;

/**  
 * @ClassName_MyTest进制转换
 * @author_Stone6762  
 * @CreationTime_2016年9月26日 下午7:58:21
 * @Description_
 */
public class MyRadixConversion {

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
