package com.cg.customer.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.cg.customer.model.Customer;

@Repository
public class CustomerDAOImpl implements ICustomerDAO {

	@PersistenceContext
	EntityManager entityManager ;
	
	
	@Override
	public void addDetails(Customer bean) {
		entityManager.persist(bean);
		
	}


	@Override
	public Customer find(int complainid) {
		// TODO Auto-generated method stub

        Customer bean;
        bean=entityManager.find(Customer.class,complainid);
        return bean;

	}

}
