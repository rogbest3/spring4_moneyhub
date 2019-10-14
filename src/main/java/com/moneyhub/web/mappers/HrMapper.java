package com.moneyhub.web.mappers;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.moneyhub.web.domains.HrDTO;

@Repository
public interface HrMapper {
	public void insertJoin(HrDTO param);
	public HrDTO selectLogin(HrDTO param);
	public List<String> searchMypage();
}
