package com.design23.com.template_method;


/**  
 * @Name:   
 * @author KingJA    
 * @date 2015-12-5 下午4:28:47  
 * @version V1.0  
 * @Description:     
 */
public class TemplateLogin {
	public final boolean  checkLogin(String userName,String password){
		if (checkFormat(userName,password)) {
			password=getEncyptedPassword(password);
			return checkUserExist(userName,password);
		}
		
		return false;
	}

	/**
	 * 固定算法
	 * 检查用户是否存在
	 * @param userName
	 * @param password
	 * @return
	 */
	private final boolean checkUserExist(String userName, String password) {
		// 数据库检查用户是否存在，具体逻辑省略
		if ("admin".equals(userName)&&"admin".equals(password)) {
			System.out.println("数据库检查：存在该用户");
			
			return true;
		}
		System.out.println("数据库检查：不存在该用户");
		return false;
	}

	/**
	 * 子类具体实现
	 * 密码加密算法，public 由子类具体实现
	 * @param password
	 * @return
	 */
	public String getEncyptedPassword(String password) {
		return password;
	}

	/**
	 * 固定算法
	 * 检查用户名格式，仅用非空判断代替
	 * @param userName
	 * @param password
	 * @return
	 */
	private final boolean checkFormat(String userName, String password) {
		if (userName!=""&&password!="") {
			System.out.println("格式检查：正确");
			return true;
		}
		System.out.println("格式检查：错误");
		return false;
	}

}
