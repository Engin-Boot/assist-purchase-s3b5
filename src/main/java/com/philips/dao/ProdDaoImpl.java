package com.philips.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.philips.entity.Prod;

@Repository
@Transactional
public class ProdDaoImpl implements IProdDao {

	@PersistenceContext
	private EntityManager em ;
	
	@Override
	public boolean addProduct(Prod prod) {
		em.persist(prod) ;
		return true;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Prod> viewProduct() {
		String jpql = "from Prod" ;
		Query qry = em.createQuery( jpql ) ;
		return qry.getResultList();
	}

	@Override
	public Prod viewProduct(int pid) {
		Prod prod = em.find(Prod.class, pid) ;
		return prod;
	}

	@Override
	public boolean editProduct(Prod prod) {
		em.merge(prod) ;
		return true;
	}

	@Override
	public boolean removeProduct(Prod prod) {
		em.remove(prod);
		return true;
	}
	
}
