/**
 * 
 */
package com.lingzhuo.vo;

import java.math.BigDecimal;

/**
 * @ClassName: CusVo
 * @Description: TODO(������һ�仰��������������)
 * @author LHX
 * @date 2017��9��21�� ����11:52:22
 *
 */
public class CusVo {
	private String cusnames;
	private BigDecimal sal;
	public CusVo(){}
	public CusVo(String cusnames, BigDecimal sal) {
		super();
		this.cusnames = cusnames;
		this.sal = sal;
	}
	public String getCusnames() {
		return cusnames;
	}
	public void setCusnames(String cusnames) {
		this.cusnames = cusnames;
	}
	public BigDecimal getSal() {
		return sal;
	}
	public void setSal(BigDecimal sal) {
		this.sal = sal;
	}

}
