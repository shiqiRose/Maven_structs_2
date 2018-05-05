/**
 * 
 */
package com.lingzhuo.vo;

import java.math.BigDecimal;

/**
 * @ClassName: CusVo
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author LHX
 * @date 2017年9月21日 上午11:52:22
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
