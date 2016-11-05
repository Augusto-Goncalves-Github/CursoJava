package com.dextraining.banco;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

import com.dextraining.jpa.EntityManagerUtil;

public class BancoTest {
	
	@After
	public void close(){
		EntityManagerUtil.fechar();	
	}

	@Test
	public void salvarBancoTeste(){
		
		BancoService bancoService = new BancoService();

		Banco bancoBradesco = new Banco();
		bancoBradesco.setNome("Bradesco");

		Banco bancoDoBrasil = new Banco();
		bancoDoBrasil.setNome("Banco do Brasil");

		bancoService.salvar(bancoDoBrasil);
		bancoService.salvar(bancoBradesco);
		
		Assert.assertNotNull("Id do banco não pode ser null", bancoBradesco.getId());
		Assert.assertNotNull("Id do banco não pode ser null", bancoDoBrasil.getId());
	}
	
	@Test
	public void buscarPorIdTeste(){
		BancoService bancoService = new BancoService();
		Banco bancoDoBrasil = new Banco();
		bancoDoBrasil.setNome("Banco do Brasil");
		bancoService.salvar(bancoDoBrasil);
		
		Banco banco = bancoService.buscarPorId(-1L);
		Banco bancoEncontrado = bancoService.buscarPorId(bancoDoBrasil.getId());
		
		Assert.assertNull("Id do banco pode ser null", banco);
		Assert.assertNotNull("Id do banco não pode ser null", bancoEncontrado);
		Assert.assertEquals(bancoDoBrasil.getNome(), bancoEncontrado.getNome());
	}

}
