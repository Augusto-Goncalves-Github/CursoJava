package com.dextraining.banco;

import javax.persistence.EntityManager;

import com.dextraining.jpa.EntityManagerUtil;
import com.dextraining.service.GenericService;

public class BancoService extends GenericService<Banco> {

	public BancoService() {
		super(Banco.class);
	}

}
