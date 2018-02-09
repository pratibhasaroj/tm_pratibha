package com.DaoImpl;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


import com.Model.Product;


@Repository
@Service
public class ProductDaoImpl {
	
	@Autowired
	SessionFactory sessionFactory;
	@Autowired
	public
	
	ProductDaoImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}
	
	@Transactional
	public void insertProduct(Product product) {
		
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		session.saveOrUpdate(product);
		session.getTransaction().commit();
	}
		
	

}
