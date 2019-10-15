package com.moneyhub.web.mappers;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.moneyhub.web.domains.MoneyhubDTO;

@Repository
public interface MoneyhubMapper {
	public void insertJoin(MoneyhubDTO param);
	public MoneyhubDTO selectLogin(MoneyhubDTO param);
	public List<String> searchMypage();
	
	public int selectCountClient();
}
