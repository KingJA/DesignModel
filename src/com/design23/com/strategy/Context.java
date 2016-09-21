package com.design23.com.strategy;

/**  
 * @Name:   
 * @author KingJA    
 * @date 2016-9-21 обнГ9:11:21  
 * @version V1.0  
 * @Description:     
 */
public class Context {
	
	private Strategy mStrategy;
	public Context(Strategy strategy){
		this.mStrategy=strategy;
	}
	public void doSomething(){
		this.mStrategy.doSomething();
	}

}
