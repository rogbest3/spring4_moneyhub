package com.moneyhub.web.services;

import java.util.List;

import org.springframework.stereotype.Component;

import com.moneyhub.web.domains.MoneyhubDTO;
@Component
public interface MoneyhubService {
	public void join(MoneyhubDTO param);
	public MoneyhubDTO login(MoneyhubDTO param);
	public List<String> viewMypage();
	
	public int countClient();
}
