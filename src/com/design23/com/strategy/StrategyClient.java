package com.design23.com.strategy;

/**  
 * @Name:   
 * @author KingJA    
 * @date 2016-9-21 обнГ9:11:03  
 * @version V1.0  
 * @Description:     
 */
public class StrategyClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	Context context = new Context(new StrategyA());
	context.doSomething();

	}

}
