package com.moneyhub.web.serviceimpls;

import java.util.List;

import org.springframework.stereotype.Service;

import com.moneyhub.web.domains.HrDTO;
import com.moneyhub.web.services.HrService;
@Service
public class HrServiceImpl implements HrService{
	private static HrServiceImpl instance = new HrServiceImpl();
	public static HrServiceImpl getInstance() {return instance;}
	private HrServiceImpl() {}

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
