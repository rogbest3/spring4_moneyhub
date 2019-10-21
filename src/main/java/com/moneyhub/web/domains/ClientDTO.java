package com.moneyhub.web.domains;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data @Component
public class ClientDTO {
	private static final long serialVersionUID = 1L;
	
	private String cstate, level, hubAccount, cid, pwd, reg, wdd, cname;


	
}
