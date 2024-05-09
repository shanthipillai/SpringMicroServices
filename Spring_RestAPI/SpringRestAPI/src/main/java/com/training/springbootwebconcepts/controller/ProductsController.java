package com.training.springbootwebconcepts.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.training.springbootwebconcepts.products.Product;

@RestController
//Base URL
@RequestMapping("/product")
public class ProductsController {
	@RequestMapping("/name")
	public String getProductName()
	{
		return "MAC Laptop";
		
	}
	
	@RequestMapping(path="/price", method= {RequestMethod.POST,RequestMethod.GET })
	public double getProductPrice()
	{
		return 1000000;
		
	}
	
	
	@RequestMapping("/data")
	public void printProductData()
	{
		
		System.out.println("My lovely MAC lapy");
	}

	@RequestMapping(value="/delete", method=RequestMethod.DELETE)
	public String deleteProduct()
	{
		
		System.out.println("Product has been deleted but can't delete MAC from my mind");
		return "Product has been deleted but can't delete MAC from my mind";
	}
//Shortcut Annotations
	@DeleteMapping
	@GetMapping
	@PostMapping
	@RequestMapping("/deleteproducts")
	public String deleteProducts()
	{
		
		System.out.println("Product has been deleted but can't delete MAC from my mind");
		return "Product has been deleted but can't delete MAC from my mind";
	}
	
	
	@PostMapping(value= {"/new","test"})
	
	public String deleteProddetails() throws IOException
	{
		Product p=new Product();
		p.setProdName("Mac");
		p.setProdBrand("Mac");
		ObjectMapper Obj = new ObjectMapper();  
		String str=Obj.writeValueAsString(p);
	    File f=new File("D:\\\\writedata.json");
		Product prod=Obj.readValue(f, Product.class);
		
		
		System.out.println(prod.getProdName());
		System.out.println(prod.getProdBrand());
	
		FileOutputStream fos=new FileOutputStream("D:\\writedata.json");
		Obj.writeValue(fos, p);
		System.out.println("Product has been deleted but can't delete MAC from my mind");
		return str;
	}
	
	@GetMapping("/productdetails")
	public Product productDetails()
	{
		Product p1=new Product();
		p1.setProdName("iPhone Laptop");
		p1.setProdBrand("Mac");
		
		Product p2=new Product();
		p2.setProdName("HP laptop");
		p2.setProdBrand("HP");
		
		//String products[]= {{"{""},{""}"},{""},{""}};
		String products[]= {"product1", "product2"};
		Product p[]= {p1,p2};
		Object obj[]= {products, p};
		
		String s[][]= {{"prod1","prod2"},{"prod3","prod4"},{"prod5","prod6"}};
		return p1;
	}
}
