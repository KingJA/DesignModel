package com.design23.com.template_method;

/**  
 * @Name:   
 * @author KingJA    
 * @date 2015-12-5 下午7:21:27  
 * @version V1.0  
 * @Description:     
 */
public class AdminLogin extends TemplateLogin {
	@Override
	public String getEncyptedPassword(String password) {
		System.out.println("密码加密：管理员登录，加密");
		return super.getEncyptedPassword(password);
	}

}
