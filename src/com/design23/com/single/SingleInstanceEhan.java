package com.design23.com.single;

/**
 * @Description: 单例模式-饿汉式
 * @author KingJA
 * @date 2015-11-15 下午1:46:15
 * @version V1.0
 */
public final class SingleInstanceEhan {
	private static SingleInstanceEhan mInstance = new SingleInstanceEhan();

	private SingleInstanceEhan() {

	}

	public static SingleInstanceEhan getInstance() {
		return mInstance;
	}

}
