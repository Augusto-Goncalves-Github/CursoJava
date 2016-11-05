package com.dextraining.investimento;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.dextraining.exception.ValidacaoException;
import com.dextraining.jpa.EntityManagerUtil;
import com.dextraining.service.GenericService;

public class InvestimentoService extends GenericService<Investimento>{

	public InvestimentoService() {
		super(Investimento.class);
	}
	
	@Override
	public void salvar(Investimento investimento){
		if (investimento.getDescricao() == null || investimento.getDescricao().isEmpty()) {
			throw new ValidacaoException("Descrição não pode estar vazia");
		}		
		if (investimento.getValor() == null || investimento.getValor() <= 0 ) {
			throw new ValidacaoException("Valor inválido");
		}		
		if (investimento.getRendimentoMensal() == null || investimento.getRendimentoMensal() <= 0 ) {
			throw new ValidacaoException("Rendimento inválido");
		}		
		super.salvar(investimento);
	}
	
	public List<Investimento> buscarTodosDesc(){
		EntityManager em = EntityManagerUtil.criarEntityManager();
		try{
			String jpql = "";
			jpql += "SELECT i FROM Investimento i";
			jpql += " ORDER BY i.valor DESC";
			
			TypedQuery<Investimento> query = em.createQuery(jpql, Investimento.class);
			
			return query.getResultList();
		} finally {
			em.close();
		}		
	}
	
	public List<Investimento> buscarTodosMaiorMil(){
		EntityManager em = EntityManagerUtil.criarEntityManager();
		try{
			String jpql = "";
			jpql += "SELECT i FROM Investimento i";
			jpql += " WHERE i.valor >= 1000 AND i.rendimentoMensal > 0.25";
			
			TypedQuery<Investimento> query = em.createQuery(jpql, Investimento.class);
			
			return query.getResultList();
		} finally {
			em.close();
		}		
	}
	
	public List<Investimento> buscarTodosComLike(String descricao){
		EntityManager em = EntityManagerUtil.criarEntityManager();
		try{
			String jpql = "";
			jpql += "SELECT i FROM Investimento i";
			jpql += " WHERE UPPER(i.descricao) LIKE UPPER(:descricao)";
			
			//chamada tradicional da query e setar parametro
			// TypedQuery<Investimento> query = em.createQuery(jpql, Investimento.class);
			// query.setParameter("descricao", descricao);
			
			// feito em fluent interface - é uma alternativa a chamada tradicional
			return em.createQuery(jpql, Investimento.class)
					.setParameter("descricao", "%"+descricao+"%")
					.getResultList();
		} finally {
			em.close();
		}		
	}
}
