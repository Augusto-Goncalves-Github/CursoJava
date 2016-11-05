package com.dextraining.service;

import java.text.MessageFormat;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.dextraining.jpa.EntityManagerUtil;

public class GenericService<T> {

	private Class<T> targetClass;

	public GenericService(Class<T> targetClass){
		this.targetClass = targetClass;
	}

	public void salvar(T entidade){
		EntityManager em = EntityManagerUtil.criarEntityManager();

		try{
			em.getTransaction().begin();
			em.persist(entidade);
			em.getTransaction().commit();
		} catch (Exception e) {
			em.getTransaction().rollback();
			throw e;
		}finally { 
			em.close();
		}		
	}

	public T buscarPorId(Long Id){	
		EntityManager em = EntityManagerUtil.criarEntityManager();

		try{
			return em.find(targetClass, Id);
		} finally {
			em.close();	
		}
	}
	
	public List<T> buscarTodos(){
		EntityManager em = EntityManagerUtil.criarEntityManager();

		try{
			// String jpql = "SELECT e FROM " + targetClass.getSimpleName() + " e";
			// dando CTRL 1 e USE MESSAGEFORMAT temos a linha abaixo
			String jpql = MessageFormat.format("SELECT e FROM {0} e", targetClass.getSimpleName());
			TypedQuery<T> query = em.createQuery(jpql, targetClass);
			return query.getResultList();
		} finally {
			em.close();
		}		
	}

}
