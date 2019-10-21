package com.moneyhub.web.mappers;

import java.util.HashMap;

import org.springframework.stereotype.Repository;

import com.moneyhub.web.domains.ClientDTO;
@Repository
public interface ClientMapper {
	public ClientDTO selectLogin(ClientDTO param);
	public void selectJoin(ClientDTO param);
}
