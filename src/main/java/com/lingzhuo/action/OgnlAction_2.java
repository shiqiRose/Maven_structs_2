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
public class OgnlAction_2 {
    private String hobbys[];
    private CusVo cus;
	public String test_1(){
		for(int i=0;i<hobbys.length;i++){
			System.out.println(hobbys[i]);
		}
		
		if(cus!=null){
			System.out.println(cus.getCusnames()+"::"+cus.getSal());
		}
		return null;
		
	}
	
	public String[] getHobbys() {
		return hobbys;
	}
	public void setHobbys(String[] hobbys) {
		this.hobbys = hobbys;
	}
	public CusVo getCus() {
		return cus;
	}
	public void setCus(CusVo cus) {
		this.cus = cus;
	}
	
}
