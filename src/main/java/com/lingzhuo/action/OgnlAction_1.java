/**
 * 
 */
package com.lingzhuo.action;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.lingzhuo.vo.CusVo;
import com.opensymphony.xwork2.ActionContext;

/**
 * @ClassName: OgnlAction
 * @Description: TODO(������һ�仰��������������)
 * @author LHX
 * @date 2017��9��21�� ����11:19:18
 *
 */
public class OgnlAction_1 {

	private String username;
	private List<CusVo> list;
	public String test_1(){
		username="JONES";//����reuqest������
		ActionContext.getContext().put("pwd", "123");
		//����session������
		ActionContext.getContext().getSession().put("a", "abc");
		//����application������
		ServletActionContext.getServletContext().setAttribute("app", "��׿");
		
		list=new ArrayList<CusVo>();
		list.add(new CusVo("Smith1", new BigDecimal("1098")));
		list.add(new CusVo("Smith2", new BigDecimal("2098")));
		list.add(new CusVo("Smith3", new BigDecimal("3098")));
		list.add(new CusVo("Smith4", new BigDecimal("4098")));
		list.add(new CusVo("Smith5", new BigDecimal("5098")));
		list.add(new CusVo("Smith6", new BigDecimal("6098")));
		list.add(new CusVo("Smith7", new BigDecimal("998")));
		
		return "success";
		
	}
	
	public List<CusVo> getList() {
		return list;
	}

	public void setList(List<CusVo> list) {
		this.list = list;
	}

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
}
