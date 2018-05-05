/**
 * 
 */
package com.lingzhuo.action;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

import com.opensymphony.xwork2.ActionContext;

/**
 * @ClassName: UploadAction
 * @Description: TODO(������һ�仰��������������)
 * @author LHX
 * @date 2017��9��21�� ����2:38:52
 *
 */
public class UploadAction {

	//�ϴ��ļ�
	private String desc;//��ע
	private String myfileContentType;//�ļ��ϴ����ļ����� MIME����
	private  File myfile;
	private String myfileFileName;
	
	public String upload(){
		System.out.println(myfile!=null);
		System.out.println(myfileContentType);
		System.out.println(myfileFileName);
		System.out.println(desc);
		
		try {
			FileUtils.copyFile(myfile, new File("D:/upoad/"+myfileFileName));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "error";
		}
		
		ActionContext.getContext().put("url","D:/upoad/"+myfileFileName);
		ActionContext.getContext().put("fileName",myfileFileName);
		
		return "success";
		
		
	}
	
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getMyfileContentType() {
		return myfileContentType;
	}
	public void setMyfileContentType(String myfileContentType) {
		this.myfileContentType = myfileContentType;
	}
	public File getMyfile() {
		return myfile;
	}
	public void setMyfile(File myfile) {
		this.myfile = myfile;
	}
	public String getMyfileFileName() {
		return myfileFileName;
	}
	public void setMyfileFileName(String myfileFileName) {
		this.myfileFileName = myfileFileName;
	}
	
	
}
