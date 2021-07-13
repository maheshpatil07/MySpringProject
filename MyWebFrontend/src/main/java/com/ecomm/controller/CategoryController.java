package com.ecomm.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


import com.ecomm.dao.CategoryDAO;
import com.ecomm.entity.Category;

@Controller
public class CategoryController 
{
	@Autowired
	CategoryDAO categoryDAO;
	
	@RequestMapping("/category")
	public String showCategoryPage() 
	{
		System.out.println("===Category page creation===");
		return "Category";
	}
	
	@RequestMapping(value="/addCategory",method=RequestMethod.POST)
	public String addCategory(@RequestParam("catId")int catId,@RequestParam("catName")String catName,@RequestParam("catDesc")String catDesc)
	{
		System.out.println("Category ID : "+catId);
		System.out.println("Category Name : "+catName);
		System.out.println("Category Desc : "+catDesc);
		
		Category category=new Category();
		category.setCategoryId(catId);
		category.setCategoryName(catName);
		category.setCategoryDesc(catDesc);
		categoryDAO.addCategory(category);
		System.out.println("Category object added");
		
		return "Category";
	}

}
