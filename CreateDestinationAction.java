package com.internousdev.oregon.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class CreateDestinationAction extends ActionSupport implements SessionAware{
	private String backFlag;
	private Map<String, Object> session;
	public String execute(){
		if(!session.containsKey("tempUserId") && !session.containsKey("userId")) {
			return "sessionTimeout";
		}
		if (backFlag == null) {
			session.remove("familyName");
			session.remove("firstName");
			session.remove("familyNameKana");
			session.remove("firstNameKana");
			session.remove("email");
			session.remove("telNumber");
			session.remove("userAddress");
		}
		return SUCCESS;
}
	public String getBackFlag(){
		return backFlag;
	}
	public void setBackFlag(String backFlag){
		this.backFlag = backFlag;
	}
	public Map<String, Object> getSession(){
		return session;
	}
	public void setSession(Map<String, Object>session){
		this.session = session;
	}
}
