package com.moneyhub.web.domains;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data @Component
public class UserDTO {
	private static final long serialVersionUID = 1L;
	
	private String cstate, level, hubAccount, uid, pwd, reg, wdd;

	public String getUid() {
		return uid;
	}

	public void setUid(String cid) {
		this.uid = cid;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	
}
