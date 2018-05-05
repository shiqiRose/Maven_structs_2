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
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author LHX
 * @date 2017年9月21日 上午11:19:18
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
