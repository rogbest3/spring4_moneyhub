package com.moneyhub.web.serviceimpls;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moneyhub.web.domains.HrDTO;
import com.moneyhub.web.services.HrService;
import com.moneyhub.web.mappers.HrMapper;
@Service
public class HrServiceImpl implements HrService{
	@Autowired	HrMapper mapper;
	
	public void join(HrDTO param) {
		System.out.println("joinService=");
//		HrDaoImpl.getInstance().insertJoin(param);
	}
	
	public HrDTO login(HrDTO param) {
		return null;
	}

	public List<String> viewMypage() {
		return null;
	}
	

}
