package com.design23.com.single;

/**
 * @Description: 单例模式-懒汉式DCL(Double Check Lock)
 * @author KingJA
 * @date 2015-11-15 下午1:40:32
 * @version V1.0
 */
public class SingleInstanceDCL {
	private static SingleInstanceDCL mInstance;

	private SingleInstanceDCL() {
	}

	public static SingleInstanceDCL getInstance() {
		if (mInstance == null) {
			synchronized (SingleInstanceDCL.class) {
				if (mInstance == null) {
					mInstance = new SingleInstanceDCL();
				}
			}
		}
		return mInstance;
	}

}
