package com.ecomm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ecomm.dao.SupplierDAO;
import com.ecomm.entity.Supplier;

@Controller
public class SupplierController 
{
	@Autowired
	SupplierDAO supplierDAO;
	
	@RequestMapping("/supplier")
	public String showSupplierPage()
	{
		return "Supplier";
	}
	
	@RequestMapping(value="/addSupplier",method=RequestMethod.POST)
	public String addSupplier(@RequestParam("supplierId")int supplierId,@RequestParam("supplierName")String supplierName,@RequestParam("supplierAddr")String supplierAddr)
	{
		System.out.println("Supplier ID : "+supplierId);
		System.out.println("Supplier Name : "+supplierName);
		System.out.println("Supplier Address : "+supplierAddr);
		
		Supplier supplier=new Supplier();
		supplier.setSupplierId(supplierId);
		supplier.setSupplierName(supplierName);
		supplier.setSupplierAddress(supplierAddr);
		
		return "Supplier";
	}
	
}
