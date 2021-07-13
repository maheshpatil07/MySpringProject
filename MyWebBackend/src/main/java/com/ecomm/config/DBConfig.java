package com.ecomm.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.ecomm.entity.Category;
import com.ecomm.entity.Product;
import com.ecomm.entity.Supplier;

@Configuration
@EnableTransactionManagement
@ComponentScan("com.ecomm")
public class DBConfig 
{
	//1.DataSource bean
	@Bean(name="dataSource")
	public DataSource getMySQLDataSource()
	{
		DriverManagerDataSource dataSource=new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost/Mahesh_PGPS210246");
		dataSource.setUsername("root");
		dataSource.setPassword("1234");
		System.out.println("=====Data source bean created=====");
		return dataSource;
	}
	
	
	//2.SessionFactory bean
	@Bean(name="sessionFactory")
	public SessionFactory getSessionFactory()
	{
		Properties hibernateProp=new Properties();
		hibernateProp.put("hbm2ddl.auto", "update");
		hibernateProp.put("hibernate.dialect", "org.hibernate.dialect.MySQL8Dialect");
		
		LocalSessionFactoryBuilder factoryBuilder=new LocalSessionFactoryBuilder(getMySQLDataSource());
		factoryBuilder.addProperties(hibernateProp);
		
		factoryBuilder.addAnnotatedClass(Category.class);
		factoryBuilder.addAnnotatedClass(Product.class);
		factoryBuilder.addAnnotatedClass(Supplier.class);
		
		SessionFactory sessionFactory=factoryBuilder.buildSessionFactory();
		System.out.println("=====Session factory bean created=====");
		return sessionFactory;
		
	}
	
	
	//3.HibernateTransaction Bean
	@Bean(name="txManager")
	public HibernateTransactionManager getHibernateTransaction(SessionFactory sessionFactory)
	{
		System.out.println("=====Hibernate transaction bean created=====");
		return new HibernateTransactionManager(sessionFactory);
	}
}
