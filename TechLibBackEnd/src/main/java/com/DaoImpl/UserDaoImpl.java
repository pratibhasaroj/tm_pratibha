package com.DaoImpl;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.Dao.UserDao;
import com.Model.USer;


@Repository
@Service
		
public  class UserDaoImpl implements UserDao
{
	
	
	
		@Autowired
		SessionFactory sessionFactory;
		@Autowired
		
		UserDaoImpl(SessionFactory sessionFactory)
		{
			this.sessionFactory=sessionFactory;
		}

		@Transactional
		public void insertUser(USer user) {
			// TODO Auto-generated method stub
			Session session=sessionFactory.openSession();
			session.beginTransaction();
			session.saveOrUpdate(user);
			session.getTransaction().commit();
		}
		
	
			/*// TODO Auto-generated method stub
			Session session=sessionFactory.openSession();
			session.beginTransaction();
			session.saveOrUpdate(user);
			session.getTransaction().commit();*/
		}

		
		
		
	


