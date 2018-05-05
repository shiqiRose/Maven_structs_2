/**
 * 
 */
package com.lingzhuo.action;

/**
 * @ClassName: EmpAction
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author LHX
 * @date 2017年9月19日 下午8:15:25
 *
 */
public class EmpAction {
private String username;
private String pwd;
	public String select(){
		System.out.println("---emp---"+username+":"+pwd);
		return null;
		
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
