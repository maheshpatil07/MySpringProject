package com.ecomm.dao;

import java.util.List;


import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ecomm.entity.Category;

@Repository("categoryDAO")
@Transactional
public class CategoryDAOImpl implements CategoryDAO
{
	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public boolean addCategory(Category category) {
		try {
			sessionFactory.getCurrentSession().save(category);
			return true;
		}
		catch (Exception e) {
			System.out.println(e);
			return false;
		}
	}

	@Override
	public boolean deleteCategory(Category category) {
		try {
			sessionFactory.getCurrentSession().delete(category);
			return true;
		}
		catch(Exception e){
			System.out.println(e);
			return false;
		}
	}

	@Override
	public boolean updateCategory(Category category) {
		try {
			sessionFactory.getCurrentSession().update(category);
			return true;
		}
		catch (Exception e) {
			System.out.println(e);
			return false;
		}
	}

	@Override
	public List<Category> getCategories() {
		Session session=sessionFactory.openSession();
		Query query=session.createQuery("from category");
		List<Category> categoryList=query.list();
		session.close();
		return categoryList;
	}

	@Override
	public Category getcategory(int categoryId) {
		Session session=sessionFactory.openSession();
		Category category=(Category)session.get(Category.class, categoryId);
		session.close();
		return category;
	}
}
