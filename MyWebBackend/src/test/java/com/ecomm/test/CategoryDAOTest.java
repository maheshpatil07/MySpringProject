package com.ecomm.test;

import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ecomm.dao.CategoryDAO;
import com.ecomm.entity.Category;

public class CategoryDAOTest {
	static CategoryDAO categoryDAO;

	@BeforeClass
	public static void initialize() 
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("com.ecomm");
		context.refresh();
		
		categoryDAO=(CategoryDAO)context.getBean("categoryDAO");
	}
		
		/*
		@Ignore 
		@Test
		public void addCategoryTest()
		{
			Category category=new Category();
			category.setCategoryId(1002);
			category.setCategoryName("NokiaMobile");
			category.setCategoryDesc("All 4G Mobiles of Realme India");
			
			assertTrue("Problem occured while adding category : ",categoryDAO.addCategory(category));
		}*/
		@Ignore
		@Test
		public void updateCategoryTest()
		{
			Category category=categoryDAO.getcategory(1002);
			category.setCategoryName("SamsungMobiles");
			category.setCategoryDesc("Latest 4G mobiles of Samsung");
			
			assertTrue("Problem occured while updating category : ",categoryDAO.updateCategory(category));
		}
		
}
