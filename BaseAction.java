package com.telin.action;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public abstract class BaseAction extends ActionSupport implements SessionAware,ServletRequestAware{

	/**
	 * 
	 */
	private static final long serialVersionUID = 23436543543L;
	protected Map<String,Object> session;
	protected HttpServletRequest request;
	public void setSession(Map<String,Object> session){
		this.session = session;
	}
	public void setServletRequest(HttpServletRequest request){
		this.request = request;
	}
	public String getBackPath(){
		return ServletActionContext.getRequest().getHeader("referer"); 
	}
	
}
