package com.moneyhub.web.services;

import java.util.HashMap;

import org.springframework.stereotype.Component;

import com.moneyhub.web.domains.ClientDTO;
@Component
public interface ClientService  {
	public void join(ClientDTO param);
	public ClientDTO login(ClientDTO param);
}
