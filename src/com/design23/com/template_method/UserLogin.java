package com.design23.com.template_method;

/**  
 * @Name:   
 * @author KingJA    
 * @date 2015-12-5 下午7:17:44  
 * @version V1.0  
 * @Description:     
 */
public class UserLogin extends TemplateLogin {
	
	@Override
	public String getEncyptedPassword(String password) {
		System.out.println("密码加密：普通用户登录，不加密");
		return super.getEncyptedPassword(password);
	}

}
