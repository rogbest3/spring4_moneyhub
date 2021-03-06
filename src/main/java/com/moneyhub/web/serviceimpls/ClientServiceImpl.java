package com.moneyhub.web.serviceimpls;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moneyhub.web.domains.ClientDTO;
import com.moneyhub.web.mappers.ClientMapper;
import com.moneyhub.web.services.ClientService;
@Service
public class ClientServiceImpl implements ClientService{
	@Autowired ClientMapper clientMapper;
	
	@Override
	public void join(ClientDTO param) {
		clientMapper.selectJoin(param);	
	}

	@Override
	public ClientDTO login(ClientDTO param) {
		// TODO Auto-generated method stub
		return clientMapper.selectLogin(param);
	}

}
