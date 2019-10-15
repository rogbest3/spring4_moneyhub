package com.moneyhub.web.serviceimpls;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moneyhub.web.domains.MoneyhubDTO;
import com.moneyhub.web.services.MoneyhubService;
import com.moneyhub.web.mappers.MoneyhubMapper;
@Service
public class MoneyhubServiceImpl implements MoneyhubService{
	@Autowired	MoneyhubMapper moneyhubMapper;
	
	@Override
	public int countClient() {
	
		return moneyhubMapper.selectCountClient();
	}
	
	public void join(MoneyhubDTO param) {
		System.out.println("joinService=");
//		HrDaoImpl.getInstance().insertJoin(param);
	}
	
	public MoneyhubDTO login(MoneyhubDTO param) {
		return null;
	}

	public List<String> viewMypage() {
		return null;
	}


	

}
