package com.moneyhub.web.services;

import java.util.List;

import org.springframework.stereotype.Component;

import com.moneyhub.web.domains.HrDTO;
@Component
public interface HrService {
	public void join(HrDTO param);
	public HrDTO login(HrDTO param);
	public List<String> viewMypage();
}
