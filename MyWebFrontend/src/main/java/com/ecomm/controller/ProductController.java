package com.ecomm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ecomm.dao.ProductDAO;
import com.ecomm.entity.Product;

@Controller
public class ProductController 
{
	@Autowired
	ProductDAO productDAO;
	
	@RequestMapping("/product")
	public String showProductPage()
	{
		return "Product";
	}
	
	@RequestMapping(value="/addProduct",method=RequestMethod.POST)
	public String addProduct(@RequestParam("productId")int productId,@RequestParam("productName")String productName,@RequestParam("price")int price,@RequestParam("stock")int stock,@RequestParam("productDesc")String productDesc)
	{
		
		System.out.println("Product ID : "+productId);
		System.out.println("product Name : "+productName);
		System.out.println("Price : "+price);
		System.out.println("Stock : "+stock);
		System.out.println("Category Desc : "+productDesc);
		
		Product product=new Product();
		product.setProductId(productId);
		product.setProductName(productName);
		product.setPrice(price);
		product.setStock(stock);
		product.setProductDesc(productDesc);
		
		productDAO.addProduct(product);
		System.out.println("Product object added");
		
		return "Product";
	}
}
