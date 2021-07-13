package com.ecomm.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ecomm.entity.Supplier;

@Repository("supplierDAO")
@Transactional
public class SupplierDAOImpl implements SupplierDAO
{
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public boolean addSupplier(Supplier supplier) {
		try {sessionFactory.getCurrentSession().save(supplier);
		return true;
		}
		catch(Exception e) {
		System.out.println(e);
		return false;
		}
		
	}

	@Override
	public boolean deleteSupplier(Supplier supplier) {
		try {sessionFactory.getCurrentSession().delete(supplier);
		return true;
		}
		catch(Exception e) {
		System.out.println(e);
		return false;
		}
	}

	@Override
	public boolean updateSupplier(Supplier supplier) {
		try {sessionFactory.getCurrentSession().update(supplier);
		return true;
		}
		catch(Exception e) {
		System.out.println(e);
		return false;
		}
	}

	@Override
	public List<Supplier> getSupplier() {
		Session session=sessionFactory.openSession();
		Query query=session.createNamedQuery("from supplier");
		List<Supplier> supplierList=query.list();
		session.close();
		return supplierList;
		
	}

	@Override
	public Supplier getSupplier(int supplierId) {
		Session session=sessionFactory.openSession();
		Supplier supplier=(Supplier)session.get(Supplier.class, supplierId);
		return supplier;
	
	}
}
