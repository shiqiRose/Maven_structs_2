/**
 * 
 */
package com.lingzhuo.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * @ClassName: DownloadAction
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author LHX
 * @date 2017年9月21日 下午3:22:59
 *
 */
public class DownloadAction {
  
	private String val;//接受完整的存储路径和文件名
	private String fileName;//接受页面传来的文件名
	private InputStream inputStream;//从硬盘读取到内存
	public String download(){
		try {
			inputStream =new FileInputStream(new File(val));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "success";
		
	}
	public String getVal() {
		return val;
	}
	public void setVal(String val) {
		this.val = val;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public InputStream getInputStream() {
		return inputStream;
	}
	public void setInputStream(InputStream inputStream) {
		this.inputStream = inputStream;
	}
	
}
