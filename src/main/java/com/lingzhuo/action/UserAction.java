/**
 * 
 */
package com.lingzhuo.action;

/**
 * @ClassName: UserAction
 * @Description: TODO(������һ�仰��������������)
 * @author LHX
 * @date 2017��9��19�� ����7:56:20
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
