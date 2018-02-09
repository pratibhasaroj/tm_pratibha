package com.DaoImpl;
import java.util.ArrayList;
import java.util.List;

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
	
	List<USer> users;

	public UserDaoImpl(){
		users = new ArrayList<USer>();
	 USer user1 = new USer("prati","abc123","pqr@gmail.com","mumbai","9853356379");
	  USer user2 = new USer("sonakshi","abc123","pqr@gmail.com","mumbai","9853356379");
	  users.add(user1);
	  users.add(user2);
	}


	public List<USer> getAllUsers() {
			return users;
	}
	
		@Autowired
		SessionFactory sessionFactory;
		@Autowired
		
		UserDaoImpl(SessionFactory sessionFactory)
		{
			this.sessionFactory=sessionFactory;
		}

		@Transactional
		public void insertUser(USer user) {
			
			Session session=sessionFactory.openSession();
			session.beginTransaction();
			session.saveOrUpdate(user);
			session.getTransaction().commit();
		}
		
	
			
			
		}

		
		
		
	


