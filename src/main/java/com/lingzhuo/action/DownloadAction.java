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
 * @Description: TODO(������һ�仰��������������)
 * @author LHX
 * @date 2017��9��21�� ����3:22:59
 *
 */
public class DownloadAction {
  
	private String val;//���������Ĵ洢·�����ļ���
	private String fileName;//����ҳ�洫�����ļ���
	private InputStream inputStream;//��Ӳ�̶�ȡ���ڴ�
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
