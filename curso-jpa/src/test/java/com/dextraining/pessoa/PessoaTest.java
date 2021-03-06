package com.dextraining.pessoa;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

import com.dextraining.jpa.EntityManagerUtil;
import com.dextraining.service.GenericService;

public class PessoaTest {

	private Pessoa pessoa;

	@After
	public void close(){
		EntityManagerUtil.fechar();	
	}

	@Test
	public void salvarPessoaTeste() throws ParseException{
		
		SimpleDateFormat df = new SimpleDateFormat("DD/MM/yyyy");
		Date dataEu = df.parse("07/01/1978");
		Date dataVoce = df.parse("12/03/1980");

		//PessoaService pessoaService = new PessoaService();
		
		GenericService<Pessoa> pessoaService = new GenericService<>(Pessoa.class);

		Pessoa pessoaEu = new Pessoa();
		pessoaEu.setNome("Augusto");
		pessoaEu.setDataNascimento(dataEu);

		Pessoa pessoaVoce = new Pessoa();
		pessoaVoce.setNome("Diego");
		pessoaVoce.setDataNascimento(dataVoce);
		
		pessoaService.salvar(pessoaEu);
		pessoaService.salvar(pessoaVoce);
		
		Assert.assertNotNull("Id da pessoa não pode ser null", pessoaEu.getId());
		Assert.assertNotNull("Id da pessoa não pode ser null", pessoaVoce.getId());
	}
	
	@Test
	public void buscarPorIdTeste(){
		PessoaService pessoaService = new PessoaService();
		Pessoa pessoaEu = new Pessoa();
		pessoaEu.setNome("Gusto");
		pessoaService.salvar(pessoaEu);
		
		pessoa = pessoaService.buscarPorId(-1L);
		Pessoa pessoaEncontrada = pessoaService.buscarPorId(pessoaEu.getId());
		
		Assert.assertNull("Id da pessoa pode ser null", pessoa);
		Assert.assertNotNull("Id do pessoa não pode ser null", pessoaEncontrada);
		Assert.assertEquals(pessoaEu.getNome(), pessoaEncontrada.getNome());
	}
	
	@Test
	public void buscarTodosTeste(){
		PessoaService pessoaService = new PessoaService();
		
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Augusto");
		pessoa.setDataNascimento(new Date());
		pessoaService.salvar(pessoa);
		
		List<Pessoa> pessoas = pessoaService.buscarTodos();
		Assert.assertEquals(1, pessoas.size());
	}
	
}
