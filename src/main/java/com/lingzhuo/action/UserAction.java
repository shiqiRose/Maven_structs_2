/**
 * 
 */
package com.lingzhuo.action;

/**
 * @ClassName: UserAction
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author LHX
 * @date 2017年9月19日 下午7:56:20
 *
 */
public class UserAction {
	private String username;
	private String pwd;
	
  public String login(){
	System.out.println("--user--"+username+":"+pwd);  
	return "success";
	  
  }

public String getUsername() {
	return username;
}

public void setUsername(String username) {
	this.username = username;
}

public String getPwd() {
	return pwd;
}

public void setPwd(String pwd) {
	this.pwd = pwd;
}
  
}
